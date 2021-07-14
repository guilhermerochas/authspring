#!/usr/bin/env bash

function main() {
  case $1 in
    -d | *)
      source ./dev-env.sh
      docker-compose -f ./docker-compose-dev.yml up -d
      ./gradlew bootRun --stacktrace
    ;;
    -p)
      ./gradlew build
      docker-compose -f ./docker-compose.yml up -d
    ;;
  esac
}

main $@
