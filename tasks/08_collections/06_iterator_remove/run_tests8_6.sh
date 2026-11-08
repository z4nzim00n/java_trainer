#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case $'5\n1 2 3 4 5' $'1 3 5\n'
run_case $'4\n2 4 6 8' $'empty\n'
run_case $'3\n1 3 5' $'1 3 5\n'
run_case $'2\n0 1' $'1\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
