#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "10 2" $'5\nDone\n'
run_case "5 0" $'Error: division by zero\nDone\n'
run_case "7 2" $'3\nDone\n'
run_case "-8 2" $'-4\nDone\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
