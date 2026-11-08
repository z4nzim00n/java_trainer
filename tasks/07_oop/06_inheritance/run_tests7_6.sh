#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "circle 2" $'circle: 12.57\n'
run_case "rect 3 4" $'rect: 12.00\n'
run_case "rect 2.5 4" $'rect: 10.00\n'
run_case "circle 0" $'circle: 0.00\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
