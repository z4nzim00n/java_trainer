#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case $'5\n3 -1 7 2 7' $'-1 7\n'
run_case $'1\n5' $'5 5\n'
run_case $'4\n-9 -1 -7 -3' $'-9 -1\n'
run_case $'3\n0 0 0' $'0 0\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
