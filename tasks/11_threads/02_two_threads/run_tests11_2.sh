#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "10" $'even: 30\nodd: 25\n'
run_case "1" $'even: 0\nodd: 1\n'
run_case "5" $'even: 6\nodd: 9\n'
run_case "2" $'even: 2\nodd: 1\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
