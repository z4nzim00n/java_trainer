#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "7" $'true\n'
run_case "2" $'true\n'
run_case "1" $'false\n'
run_case "9" $'false\n'
run_case "97" $'true\n'
run_case "4" $'false\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
