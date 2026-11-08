#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "10 2" $'5\n'
run_case "7 2" $'3\n'
run_case "5 0" $'Error: division by zero\n'
run_case "-9 3" $'-3\n'
run_case "0 5" $'0\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
