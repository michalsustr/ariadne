# Ariadne: code navigation plugin for Intellij IDEA

Currently just a fork of dotplugin. 
The aim of this project is to build a graphical code navigation plugin (primarily) for Python.

# Roadmap:

- Make dotplugin a web view that will display a hard-coded .dot file in a side panel.
- Display the dot graph with an SVG renderer. Learn how to make SVG transition animations.
- Get a collection of currently opened files in editor.
- Display the whole AST of a single file provided by intellij's PSI. Should be a tree.
- Display AST of all currently opened files. Should be a DAG.
- Focus on the current AST node based on location in editor. Center it in the web view.
- Traverse the edges using ace-jump/few-ide-strokes style.
- Add animations between the graph transitions. 
- Give edges of the DAG weights based on pagerank/visitation counts.
- Heuristics on which edges to display and which should be collapsed. Maybe learn them :)
- Release plugin.

# Credits

Project author:

[Olga Strizhenko](https://github.com/bzixilu)

Contributors:

[Jiri Hanousek](https://github.com/zzajc)


# License

All files in this repository are released under the [Apache 2.0 License](https://github.com/bzixilu/dotplugin/blob/master/LICENSE).

