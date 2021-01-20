#!/usr/bin/env sh

set -e

git init
git add -A
git commit -m 'deploy'

git push -f git@github.com:AdminHcat/JapariCraftMod.git master:master

cd -