#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case $'5\n1 2 2 3 1' $'3\n1 2 3\n'
run_case $'3\n5 5 5' $'1\n5\n'
run_case $'4\n-1 0 -1 0' $'2\n-1 0\n'
run_case $'5\n5 4 3 2 1' $'5\n1 2 3 4 5\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
