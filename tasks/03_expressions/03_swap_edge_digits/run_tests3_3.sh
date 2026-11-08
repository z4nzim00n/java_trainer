#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "1234" $'4231\n'
run_case "1000" $'1\n'
run_case "9999" $'9999\n'
run_case "5678" $'8675\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi