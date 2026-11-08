#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "3.5 2" $'Total: 7.00\n'
run_case "0.1 3" $'Total: 0.30\n'
run_case "10 1" $'Total: 10.00\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi