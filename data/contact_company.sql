create table contact_company (
	id SERIAL PRIMARY KEY,
	company_name VARCHAR(50) NOT NULL,
	company_owner VARCHAR(50) NOT NULL,
	company_website VARCHAR(50) NULL,
	company_location VARCHAR(50) NOT NULL
);

insert into contact_company (id, company_name, company_owner, company_website, company_location) values (1, 'Yadel', 'Nap', 'unesco.org', 'California');
insert into contact_company (id, company_name, company_owner, company_website, company_location) values (2, 'Twimm', 'Wendall', 'nhs.uk', 'Colorado');
insert into contact_company (id, company_name, company_owner, company_website, company_location) values (3, 'Eidel', 'Adriane', 'phoca.cz', 'Ohio');
insert into contact_company (id, company_name, company_owner, company_website, company_location) values (4, 'Rhynyx', 'Manny', 'google.co.jp', 'North Carolina');
insert into contact_company (id, company_name, company_owner, company_website, company_location) values (5, 'Photospace', 'Linnet', 'flickr.com', 'District of Columbia');
insert into contact_company (id, company_name, company_owner, company_website, company_location) values (6, 'Edgepulse', 'Alonzo', 'mysql.com', 'Tennessee');
insert into contact_company (id, company_name, company_owner, company_website, company_location) values (7, 'Yakitri', 'Quent', null, 'Pennsylvania');
insert into contact_company (id, company_name, company_owner, company_website, company_location) values (8, 'Plajo', 'Martita', 'canalblog.com', 'California');
insert into contact_company (id, company_name, company_owner, company_website, company_location) values (9, 'Pixope', 'Bethany', 'illinois.edu', 'New York');
insert into contact_company (id, company_name, company_owner, company_website, company_location) values (10, 'Digitube', 'Ronald', 'ifeng.com', 'Colorado');
