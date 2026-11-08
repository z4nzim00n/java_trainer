#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "3 5" $'3 5\n0 0\n'
run_case "-1 2" $'-1 2\n0 0\n'
run_case "0 0" $'0 0\n0 0\n'
run_case "100 -100" $'100 -100\n0 0\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
