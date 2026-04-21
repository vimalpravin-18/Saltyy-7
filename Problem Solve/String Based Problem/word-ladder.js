var ladderLength = function (beginWord, endWord, wordList) {
  const dict = new Set(wordList);
  if (!dict.has(endWord)) return 0;

  let beginSet = new Set([beginWord]);
  let endSet = new Set([endWord]);
  const visited = new Set([beginWord, endWord]);
  let level = 1;

  const alpha = Array.from({ length: 26 }, (_, i) =>
    String.fromCharCode(97 + i),
  );

  while (beginSet.size && endSet.size) {
    // always expand the smaller side
    if (beginSet.size > endSet.size) [beginSet, endSet] = [endSet, beginSet];

    const next = new Set();

    for (const word of beginSet) {
      const arr = word.split("");

      for (let i = 0; i < arr.length; i++) {
        const orig = arr[i];

        for (const ch of alpha) {
          if (ch === orig) continue;

          arr[i] = ch;
          const cand = arr.join("");

          if (endSet.has(cand)) return level + 1;
          if (dict.has(cand) && !visited.has(cand)) {
            visited.add(cand);
            next.add(cand);
          }
        }
        arr[i] = orig;
      }
    }
    beginSet = next;
    level++;
  }
  return 0;
};
