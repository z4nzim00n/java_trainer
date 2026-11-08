#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case $'6\n1 2 1 3 2 4' $'1 2 3 4\n'
run_case $'3\n5 5 5' $'5\n'
run_case $'1\n-7' $'-7\n'
run_case $'4\n3 1 3 2' $'3 1 2\n'
run_case $'5\n0 -1 0 -1 0' $'0 -1\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
