#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case $'Alice 100\n50' $'Alice: 100\nAlice: 50\n'
run_case $'Bob 30\n-5' $'Bob: 30\nInvalid balance\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi