// const antlr4 = require('antlr4');
import antlr4 from 'antlr4';
// const TPTPv9Lexer = require('./TPTPv9Lexer').TPTPv9Lexer;
import TPTPv9Lexer from './JSParser/g4/TPTPv9Lexer.js';
// const TPTPv9Parser = require('./TPTPv9Parser').TPTPv9Parser;
import TPTPv9Parser from './JSParser/g4/TPTPv9Parser.js';

import fs from 'fs';

const filePath = '/Users/daniel/Documents/coding_stuff/antlr_parser/testfiles/simple.s';

let fileContent;
try {
  fileContent = fs.readFileSync(filePath, 'utf8');
} catch (err) {
  console.error('Error reading file:', err);
}

const input = fileContent;
const chars = new antlr4.InputStream(input);
const lexer = new TPTPv9Lexer(chars);
const tokens = new antlr4.CommonTokenStream(lexer);
const parser = new TPTPv9Parser(tokens);

const tree = parser.tptp_file();

// Print the AST
function printTree(node, indent = 0) {
  const nodeName = parser.ruleNames[node.ruleIndex];
  console.log(' '.repeat(indent), nodeName, node.getText());

  for (let i = 0; i < node.getChildCount(); i++) {
    printTree(node.getChild(i), indent + 2);
  }
}

printTree(tree);