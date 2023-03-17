# Trie Data Structure

## Problem Statement

A [**trie**](https://en.wikipedia.org/wiki/Trie) (pronounced as "try") or **prefix tree** is a tree data structure used to efficiently store and retrieve keys in a dataset of strings. There are various applications of this data structure, such as autocomplete and spellchecker.

Implement the Trie class:

- `Trie()` Initializes the trie object.
- `void insert(String word)` Inserts the string `word` into the trie.
- `boolean search(String word)` Returns `true` if the string `word` is in the trie (i.e., was inserted before), and `false` otherwise.
- `boolean startsWith(String prefix)` Returns `true` if there is a previously inserted string `word` that has the prefix `prefix`, and `false` otherwise.

**Example 1:**

**Input**
["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
[[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
**Output**
[null, null, true, false, true, null, true]

**Explanation**

```
Trie trie = new Trie();
trie.insert("apple");
trie.search("apple"); // return True
trie.search("app"); // return False
trie.startsWith("app"); // return True
trie.insert("app");
trie.search("app"); // return True
```

## Explanation

 A trie, also called digital tree or prefix tree, is a type of k-ary search tree, a tree data structure used for locating specific keys from within a set. These keys are most often strings, with links between nodes defined not by the entire key, but by individual characters

In a Trie data structure, each node stores a single character from the string. The root of the Trie represents an empty string, and each child of a node represents a particular character in the string. The key advantage of the Trie data structure is that it enables us to search quickly for a particular string or a substring.

Tries are commonly used in autocomplete and spell-checking applications, where we need to find all the words that match a given partial input string. This is achieved by traversing the Trie data structure from the root node and scanning all the child nodes that match the input string, which can be done in linear time with respect to the length of the input string.

In summary, the Trie data structure is a tree-like data structure used for storing strings that provides efficient searching, insertion, and deletion of strings in linear time with respect to the length of the input string.Yes, here is an implementation of a Trie in Java with the following methods:

- `Trie()` - constructor method to initialize the Trie.
- `insert(String word)` - method to insert a word into the Trie.
- `search(String word)` - method to search if a word exists in the Trie.
- `delete(String word)` - method to delete a word from the Trie.
- `startsWith(String prefix)` - method to search if a word in the Trie starts with a given prefix.
