# Java DSA Practice

A personal collection of Java solutions from LeetCode and GeeksforGeeks. Solutions are grouped by platform and topic, and each solved problem has one canonical source file and one README in a shared format.

## Repository layout

```text
Java-DSA-Practice/
├── LeetCode/
│   ├── Java/<topic>/<problem>/Solution.java
│   ├── Java/<topic>/<problem>/README.md
│   └── trackers/
├── GeeksforGeeks/
│   ├── Java/<topic>/<problem>/Solution.java
│   └── trackers/
├── PROBLEM_TEMPLATE.md
└── README.md
```

## Branches

- `leetcode` contains the LeetCode problems and their trackers.
- `gfg` contains the GeeksforGeeks problems and progress list.
- `main` is the shared starting point for both platform branches.

## Progress labels

A checked tracker item means the repository contains a solution file. An unchecked item means no solution is present in this repository. This label tracks repository contents and does not imply an online judge verdict.

## Adding a solution

Create a problem folder under the right platform and topic, add `Solution.java`, and copy the structure from [`PROBLEM_TEMPLATE.md`](./PROBLEM_TEMPLATE.md). Update the relevant tracker with a link only after the solution file is added.
