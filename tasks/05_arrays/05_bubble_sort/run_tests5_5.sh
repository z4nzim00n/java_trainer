#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case $'5\n5 1 4 2 8' $'1 2 4 5 8\n'
run_case $'1\n0' $'0\n'
run_case $'4\n9 9 1 1' $'1 1 9 9\n'
run_case $'3\n-1 3 -5' $'-5 -1 3\n'
run_case $'5\n1 2 3 4 5' $'1 2 3 4 5\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
