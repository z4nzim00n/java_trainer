#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case_args "/tmp/jt_out1.txt" "hello" $'Saved: 5 bytes\n'
printf 'hello' > /tmp/jt_exp1.txt
if cmp -s /tmp/jt_out1.txt /tmp/jt_exp1.txt; then
  echo "OK:   содержимое /tmp/jt_out1.txt"
else
  echo "FAIL: содержимое /tmp/jt_out1.txt"
  FAILED=1
fi

run_case_args "/tmp/jt_out2.txt" $'line1\nline2' $'Saved: 11 bytes\n'
printf 'line1\nline2' > /tmp/jt_exp2.txt
if cmp -s /tmp/jt_out2.txt /tmp/jt_exp2.txt; then
  echo "OK:   содержимое /tmp/jt_out2.txt"
else
  echo "FAIL: содержимое /tmp/jt_out2.txt"
  FAILED=1
fi

run_case_args "/tmp/jt_out3.txt" "" $'Saved: 0 bytes\n'

run_case_args "/tmp/jt_out4.txt" "hello!" $'Saved: 6 bytes\n'
printf 'hello!' > /tmp/jt_exp4.txt
if cmp -s /tmp/jt_out4.txt /tmp/jt_exp4.txt; then
  echo "OK:   содержимое /tmp/jt_out4.txt"
else
  echo "FAIL: содержимое /tmp/jt_out4.txt"
  FAILED=1
fi

rm -f /tmp/jt_out1.txt /tmp/jt_out2.txt /tmp/jt_out3.txt /tmp/jt_out4.txt /tmp/jt_exp1.txt /tmp/jt_exp2.txt /tmp/jt_exp4.txt

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
