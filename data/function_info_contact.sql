DROP FUNCTION IF EXISTS INFO_CONTACT;

CREATE FUNCTION INFO_CONTACT()
RETURNS TABLE(id int, first_name varchar(50), last_name varchar(50), email varchar(50), company_name varchar(50),
             company_owner varchar(50), company_location varchar(50))
AS $$
BEGIN
  RETURN QUERY SELECT uc.id, uc.first_name, uc.last_name, uc.email, cc.company_name, 
  cc.company_owner, cc.company_location 
  from user_contact uc 
  INNER JOIN contact_company cc ON uc.company_id = cc.id;
END; 
$$ LANGUAGE plpgsql;

SELECT * FROM INFO_CONTACT();
