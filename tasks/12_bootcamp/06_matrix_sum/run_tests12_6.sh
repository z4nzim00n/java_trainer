#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case $'2 3\n1 2 3 4 5 6' $'Sum: 21\nMax: 6\n'
run_case $'1 1\n-5' $'Sum: -5\nMax: -5\n'
run_case $'2 2\n0 0 0 0' $'Sum: 0\nMax: 0\n'
run_case $'2 3\n-1 -2 -3 -4 -5 -6' $'Sum: -21\nMax: -1\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
