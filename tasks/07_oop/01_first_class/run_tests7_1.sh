#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "3 4" $'12.00\n14.00\n'
run_case "2.5 2" $'5.00\n9.00\n'
run_case "1 1" $'1.00\n4.00\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi