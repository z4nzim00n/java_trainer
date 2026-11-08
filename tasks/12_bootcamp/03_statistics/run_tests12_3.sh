#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case $'3\n1 2 3' $'Min: 1.00\nMax: 3.00\nAvg: 2.00\n'
run_case $'2\n-1 1' $'Min: -1.00\nMax: 1.00\nAvg: 0.00\n'
run_case $'1\n2.5' $'Min: 2.50\nMax: 2.50\nAvg: 2.50\n'
run_case $'4\n1 2 3 4' $'Min: 1.00\nMax: 4.00\nAvg: 2.50\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
