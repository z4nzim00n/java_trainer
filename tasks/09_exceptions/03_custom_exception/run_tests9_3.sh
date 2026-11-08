#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "100 40" $'Balance: 60\n'
run_case "50 50" $'Balance: 0\n'
run_case "30 100" $'Error: insufficient funds\n'
run_case "0 1" $'Error: insufficient funds\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
