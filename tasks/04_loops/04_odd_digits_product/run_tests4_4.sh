#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "1235" $'15\n'
run_case "2468" $'0\n'
run_case "0" $'0\n'
run_case "13579" $'945\n'
run_case "222222222" $'0\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
