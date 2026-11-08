#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "2 3.5" $'5.5\n'
run_case "0 0.0" $'0.0\n'
run_case "-1 2.5" $'1.5\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi