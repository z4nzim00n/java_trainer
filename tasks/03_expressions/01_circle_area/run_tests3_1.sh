#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "1" $'3.14\n'
run_case "2" $'12.57\n'
run_case "0" $'0.00\n'
run_case "1.5" $'7.07\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi