// Generated from C:/Development/coherence-sql/src/main/resources\SqlGrammar.g4 by ANTLR 4.7
package pl.mwojciechowski.coherence.sql.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlGrammarParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            ADD = 1, ALL = 2, ALTER = 3, AND = 4, ANY = 5, AS = 6, ASC = 7, AUTHORIZATION = 8, BACKUP = 9,
            BEGIN = 10, BETWEEN = 11, BREAK = 12, BROWSE = 13, BULK = 14, BY = 15, CALLED = 16,
            CASCADE = 17, CASE = 18, CHANGETABLE = 19, CHANGES = 20, CHECK = 21, CHECKPOINT = 22,
            CLOSE = 23, CLUSTERED = 24, COALESCE = 25, COLLATE = 26, COLUMN = 27, COMMIT = 28,
            COMPUTE = 29, CONSTRAINT = 30, CONTAINMENT = 31, CONTAINS = 32, CONTAINSTABLE = 33,
            CONTINUE = 34, CONVERT = 35, CREATE = 36, CROSS = 37, CURRENT = 38, CURRENT_DATE = 39,
            CURRENT_TIME = 40, CURRENT_TIMESTAMP = 41, CURRENT_USER = 42, CURSOR = 43, DATABASE = 44,
            DBCC = 45, DEALLOCATE = 46, DECLARE = 47, DEFAULT = 48, DELETE = 49, DENY = 50, DESC = 51,
            DISK = 52, DISTINCT = 53, DISTRIBUTED = 54, DOUBLE = 55, DROP = 56, DUMP = 57, ELSE = 58,
            END = 59, ERRLVL = 60, ESCAPE = 61, EXCEPT = 62, EXECUTE = 63, EXISTS = 64, EXIT = 65,
            EXTERNAL = 66, FETCH = 67, FILE = 68, FILENAME = 69, FILLFACTOR = 70, FOR = 71, FORCESEEK = 72,
            FOREIGN = 73, FREETEXT = 74, FREETEXTTABLE = 75, FROM = 76, FULL = 77, FUNCTION = 78,
            GOTO = 79, GRANT = 80, GROUP = 81, HAVING = 82, IDENTITY = 83, IDENTITYCOL = 84, IDENTITY_INSERT = 85,
            IF = 86, IN = 87, INDEX = 88, INNER = 89, INSERT = 90, INTERSECT = 91, INTO = 92, IS = 93,
            JOIN = 94, KEY = 95, KILL = 96, LEFT = 97, LIKE = 98, LINENO = 99, LOAD = 100, LOG = 101,
            MERGE = 102, NATIONAL = 103, NOCHECK = 104, NONCLUSTERED = 105, NONE = 106, NOT = 107,
            NULL = 108, NULLIF = 109, OF = 110, OFF = 111, OFFSETS = 112, ON = 113, OPEN = 114,
            OPENDATASOURCE = 115, OPENQUERY = 116, OPENROWSET = 117, OPENXML = 118, OPTION = 119,
            OR = 120, ORDER = 121, OUTER = 122, OVER = 123, PARTIAL = 124, PERCENT = 125, PIVOT = 126,
            PLAN = 127, PRECISION = 128, PRIMARY = 129, PRINT = 130, PROC = 131, PROCEDURE = 132,
            PUBLIC = 133, RAISERROR = 134, READ = 135, READTEXT = 136, RECONFIGURE = 137, REFERENCES = 138,
            REPLICATION = 139, RESTORE = 140, RESTRICT = 141, RETURN = 142, RETURNS = 143, REVERT = 144,
            REVOKE = 145, RIGHT = 146, ROLLBACK = 147, ROWCOUNT = 148, ROWGUIDCOL = 149, RULE = 150,
            SAVE = 151, SCHEMA = 152, SECURITYAUDIT = 153, SELECT = 154, SEMANTICKEYPHRASETABLE = 155,
            SEMANTICSIMILARITYDETAILSTABLE = 156, SEMANTICSIMILARITYTABLE = 157, SESSION_USER = 158,
            SET = 159, SETUSER = 160, SHUTDOWN = 161, SOME = 162, STATISTICS = 163, SYSTEM_USER = 164,
            TABLE = 165, TABLESAMPLE = 166, TEXTSIZE = 167, THEN = 168, TO = 169, TOP = 170, TRAN = 171,
            TRANSACTION = 172, TRIGGER = 173, TRUNCATE = 174, TRY_CONVERT = 175, TSEQUAL = 176,
            UNION = 177, UNIQUE = 178, UNPIVOT = 179, UPDATE = 180, UPDATETEXT = 181, USE = 182,
            USER = 183, VALUES = 184, VARYING = 185, VIEW = 186, WAITFOR = 187, WHEN = 188, WHERE = 189,
            WHILE = 190, WITH = 191, WITHIN = 192, WRITETEXT = 193, ABSOLUTE = 194, AFTER = 195,
            ALLOWED = 196, ALLOW_SNAPSHOT_ISOLATION = 197, ANSI_NULLS = 198, ANSI_NULL_DEFAULT = 199,
            ANSI_PADDING = 200, ANSI_WARNINGS = 201, APPLY = 202, ARITHABORT = 203, AUTO = 204,
            AUTO_CLEANUP = 205, AUTO_CLOSE = 206, AUTO_CREATE_STATISTICS = 207, AUTO_SHRINK = 208,
            AUTO_UPDATE_STATISTICS = 209, AUTO_UPDATE_STATISTICS_ASYNC = 210, AVG = 211,
            BASE64 = 212, BINARY_CHECKSUM = 213, BULK_LOGGED = 214, CALLER = 215, CAST = 216,
            CATCH = 217, CHANGE_RETENTION = 218, CHANGE_TRACKING = 219, CHECKSUM = 220, CHECKSUM_AGG = 221,
            COMMITTED = 222, COMPATIBILITY_LEVEL = 223, CONCAT = 224, CONCAT_NULL_YIELDS_NULL = 225,
            CONTROL = 226, COOKIE = 227, COUNT = 228, COUNT_BIG = 229, CURSOR_CLOSE_ON_COMMIT = 230,
            CURSOR_DEFAULT = 231, DATEADD = 232, DATEDIFF = 233, DATENAME = 234, DATEPART = 235,
            DATE_CORRELATION_OPTIMIZATION = 236, DAYS = 237, DB_CHAINING = 238, DEFAULT_FULLTEXT_LANGUAGE = 239,
            DEFAULT_LANGUAGE = 240, DELAY = 241, DELAYED_DURABILITY = 242, DELETED = 243,
            DENSE_RANK = 244, DIRECTORY_NAME = 245, DISABLE = 246, DISABLED = 247, DISABLE_BROKER = 248,
            DYNAMIC = 249, EMERGENCY = 250, ENABLE_BROKER = 251, ENCRYPTION = 252, ERROR_BROKER_CONVERSATIONS = 253,
            EXPAND = 254, FAST = 255, FAST_FORWARD = 256, FILEGROUP = 257, FILEGROWTH = 258,
            FILESTREAM = 259, FIRST = 260, FOLLOWING = 261, FORCE = 262, FORCED = 263, FORWARD_ONLY = 264,
            FULLSCAN = 265, GB = 266, GLOBAL = 267, GO = 268, GROUPING = 269, GROUPING_ID = 270,
            HADR = 271, HASH = 272, HONOR_BROKER_PRIORITY = 273, HOURS = 274, IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX = 275,
            IMMEDIATE = 276, IMPERSONATE = 277, INCREMENTAL = 278, INPUT = 279, INSENSITIVE = 280,
            INSERTED = 281, ISOLATION = 282, KB = 283, KEEP = 284, KEEPFIXED = 285, KEYSET = 286,
            LAST = 287, LEVEL = 288, LOCAL = 289, LOCK_ESCALATION = 290, LOGIN = 291, LOOP = 292,
            MARK = 293, MAX = 294, MAXDOP = 295, MAXRECURSION = 296, MAXSIZE = 297, MB = 298,
            MEMORY_OPTIMIZED_DATA = 299, MIN = 300, MINUTES = 301, MIN_ACTIVE_ROWVERSION = 302,
            MIXED_PAGE_ALLOCATION = 303, MODIFY = 304, MULTI_USER = 305, NAME = 306, NESTED_TRIGGERS = 307,
            NEW_BROKER = 308, NEXT = 309, NOCOUNT = 310, NOEXPAND = 311, NON_TRANSACTED_ACCESS = 312,
            NORECOMPUTE = 313, NO_WAIT = 314, NTILE = 315, NUMBER = 316, NUMERIC_ROUNDABORT = 317,
            OFFLINE = 318, OFFSET = 319, ONLINE = 320, ONLY = 321, OPTIMISTIC = 322, OPTIMIZE = 323,
            OUT = 324, OUTPUT = 325, OWNER = 326, PAGE_VERIFY = 327, PARAMETERIZATION = 328,
            PARTITION = 329, PATH = 330, PRECEDING = 331, PRIOR = 332, PRIVILEGES = 333, QUOTED_IDENTIFIER = 334,
            RANGE = 335, RANK = 336, READONLY = 337, READ_COMMITTED_SNAPSHOT = 338, READ_ONLY = 339,
            READ_WRITE = 340, RECOMPILE = 341, RECOVERY = 342, RECURSIVE_TRIGGERS = 343, RELATIVE = 344,
            REMOTE = 345, REPEATABLE = 346, RESTRICTED_USER = 347, ROBUST = 348, ROOT = 349,
            ROW = 350, ROWGUID = 351, ROWS = 352, ROW_NUMBER = 353, SAMPLE = 354, SCHEMABINDING = 355,
            SCROLL = 356, SCROLL_LOCKS = 357, SECONDS = 358, SELF = 359, SERIALIZABLE = 360,
            SHOWPLAN = 361, SIMPLE = 362, SINGLE_USER = 363, SIZE = 364, SNAPSHOT = 365, SPATIAL_WINDOW_MAX_CELLS = 366,
            STATIC = 367, STATS_STREAM = 368, STDEV = 369, STDEVP = 370, SUM = 371, TAKE = 372,
            TARGET_RECOVERY_TIME = 373, TB = 374, TEXTIMAGE_ON = 375, THROW = 376, TIES = 377,
            TIME = 378, TORN_PAGE_DETECTION = 379, TRANSFORM_NOISE_WORDS = 380, TRUSTWORTHY = 381,
            TRY = 382, TWO_DIGIT_YEAR_CUTOFF = 383, TYPE = 384, TYPE_WARNING = 385, UNBOUNDED = 386,
            UNCOMMITTED = 387, UNKNOWN = 388, UNLIMITED = 389, USING = 390, VAR = 391, VARP = 392,
            VIEWS = 393, VIEW_METADATA = 394, WORK = 395, XML = 396, XMLNAMESPACES = 397, DOLLAR_ACTION = 398,
            SPACE = 399, COMMENT = 400, LINE_COMMENT = 401, DOUBLE_QUOTE_ID = 402, SQUARE_BRACKET_ID = 403,
            LOCAL_ID = 404, DECIMAL = 405, ID = 406, STRING = 407, BINARY = 408, FLOAT = 409,
            REAL = 410, EQUAL = 411, GREATER = 412, LESS = 413, EXCLAMATION = 414, PLUS_ASSIGN = 415,
            MINUS_ASSIGN = 416, MULT_ASSIGN = 417, DIV_ASSIGN = 418, MOD_ASSIGN = 419, AND_ASSIGN = 420,
            XOR_ASSIGN = 421, OR_ASSIGN = 422, DOT = 423, UNDERLINE = 424, AT = 425, SHARP = 426,
            DOLLAR = 427, LR_BRACKET = 428, RR_BRACKET = 429, COMMA = 430, SEMI = 431, COLON = 432,
            STAR = 433, DIVIDE = 434, MODULE = 435, PLUS = 436, MINUS = 437, BIT_NOT = 438, BIT_OR = 439,
            BIT_AND = 440, BIT_XOR = 441;
    public static final int
            RULE_sqlClauses = 0, RULE_sqlClause = 1, RULE_dmlClause = 2, RULE_selectStatement = 3,
            RULE_expression = 4, RULE_constantExpression = 5, RULE_subquery = 6, RULE_searchCondition = 7,
            RULE_searchConditionAnd = 8, RULE_searchConditionNot = 9, RULE_predicate = 10,
            RULE_queryExpression = 11, RULE_union = 12, RULE_querySpecification = 13,
            RULE_orderByClause = 14, RULE_orderByExpression = 15, RULE_groupByItem = 16,
            RULE_optionClause = 17, RULE_option = 18, RULE_selectList = 19, RULE_selectListElem = 20,
            RULE_tableSources = 21, RULE_tableSource = 22, RULE_tableSourceItemJoined = 23,
            RULE_tableSourceItem = 24, RULE_changeTable = 25, RULE_joinPart = 26,
            RULE_tableNameWith_hint = 27, RULE_derivedTable = 28, RULE_functionCall = 29,
            RULE_switchSection = 30, RULE_switchSearchConditionSection = 31, RULE_asTableAlias = 32,
            RULE_tableAlias = 33, RULE_columnAliasList = 34, RULE_columnAlias = 35,
            RULE_expressionList = 36, RULE_aggregateWindowedFunction = 37, RULE_allDistinctExpression = 38,
            RULE_tableName = 39, RULE_funcProcName = 40, RULE_fullColumnName = 41,
            RULE_nullNotnull = 42, RULE_scalarFunctionName = 43, RULE_dataType = 44,
            RULE_constant = 45, RULE_sign = 46, RULE_complexId = 47, RULE_id = 48,
            RULE_simpleId = 49, RULE_comparisonOperator = 50;
    public static final String[] ruleNames = {
            "sqlClauses", "sqlClause", "dmlClause", "selectStatement", "expression",
            "constantExpression", "subquery", "searchCondition", "searchConditionAnd",
            "searchConditionNot", "predicate", "queryExpression", "union", "querySpecification",
            "orderByClause", "orderByExpression", "groupByItem", "optionClause", "option",
            "selectList", "selectListElem", "tableSources", "tableSource", "tableSourceItemJoined",
            "tableSourceItem", "changeTable", "joinPart", "tableNameWith_hint", "derivedTable",
            "functionCall", "switchSection", "switchSearchConditionSection", "asTableAlias",
            "tableAlias", "columnAliasList", "columnAlias", "expressionList", "aggregateWindowedFunction",
            "allDistinctExpression", "tableName", "funcProcName", "fullColumnName",
            "nullNotnull", "scalarFunctionName", "dataType", "constant", "sign", "complexId",
            "id", "simpleId", "comparisonOperator"
    };

    private static final String[] _LITERAL_NAMES = {
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, "'='", "'>'", "'<'", "'!'", "'+='", "'-='", "'*='",
            "'/='", "'%='", "'&='", "'^='", "'|='", "'.'", "'_'", "'@'", "'#'", "'$'",
            "'('", "')'", "','", "';'", "':'", "'*'", "'/'", "'%'", "'+'", "'-'",
            "'~'", "'|'", "'&'", "'^'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "ADD", "ALL", "ALTER", "AND", "ANY", "AS", "ASC", "AUTHORIZATION",
            "BACKUP", "BEGIN", "BETWEEN", "BREAK", "BROWSE", "BULK", "BY", "CALLED",
            "CASCADE", "CASE", "CHANGETABLE", "CHANGES", "CHECK", "CHECKPOINT", "CLOSE",
            "CLUSTERED", "COALESCE", "COLLATE", "COLUMN", "COMMIT", "COMPUTE", "CONSTRAINT",
            "CONTAINMENT", "CONTAINS", "CONTAINSTABLE", "CONTINUE", "CONVERT", "CREATE",
            "CROSS", "CURRENT", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP",
            "CURRENT_USER", "CURSOR", "DATABASE", "DBCC", "DEALLOCATE", "DECLARE",
            "DEFAULT", "DELETE", "DENY", "DESC", "DISK", "DISTINCT", "DISTRIBUTED",
            "DOUBLE", "DROP", "DUMP", "ELSE", "END", "ERRLVL", "ESCAPE", "EXCEPT",
            "EXECUTE", "EXISTS", "EXIT", "EXTERNAL", "FETCH", "FILE", "FILENAME",
            "FILLFACTOR", "FOR", "FORCESEEK", "FOREIGN", "FREETEXT", "FREETEXTTABLE",
            "FROM", "FULL", "FUNCTION", "GOTO", "GRANT", "GROUP", "HAVING", "IDENTITY",
            "IDENTITYCOL", "IDENTITY_INSERT", "IF", "IN", "INDEX", "INNER", "INSERT",
            "INTERSECT", "INTO", "IS", "JOIN", "KEY", "KILL", "LEFT", "LIKE", "LINENO",
            "LOAD", "LOG", "MERGE", "NATIONAL", "NOCHECK", "NONCLUSTERED", "NONE",
            "NOT", "NULL", "NULLIF", "OF", "OFF", "OFFSETS", "ON", "OPEN", "OPENDATASOURCE",
            "OPENQUERY", "OPENROWSET", "OPENXML", "OPTION", "OR", "ORDER", "OUTER",
            "OVER", "PARTIAL", "PERCENT", "PIVOT", "PLAN", "PRECISION", "PRIMARY",
            "PRINT", "PROC", "PROCEDURE", "PUBLIC", "RAISERROR", "READ", "READTEXT",
            "RECONFIGURE", "REFERENCES", "REPLICATION", "RESTORE", "RESTRICT", "RETURN",
            "RETURNS", "REVERT", "REVOKE", "RIGHT", "ROLLBACK", "ROWCOUNT", "ROWGUIDCOL",
            "RULE", "SAVE", "SCHEMA", "SECURITYAUDIT", "SELECT", "SEMANTICKEYPHRASETABLE",
            "SEMANTICSIMILARITYDETAILSTABLE", "SEMANTICSIMILARITYTABLE", "SESSION_USER",
            "SET", "SETUSER", "SHUTDOWN", "SOME", "STATISTICS", "SYSTEM_USER", "TABLE",
            "TABLESAMPLE", "TEXTSIZE", "THEN", "TO", "TOP", "TRAN", "TRANSACTION",
            "TRIGGER", "TRUNCATE", "TRY_CONVERT", "TSEQUAL", "UNION", "UNIQUE", "UNPIVOT",
            "UPDATE", "UPDATETEXT", "USE", "USER", "VALUES", "VARYING", "VIEW", "WAITFOR",
            "WHEN", "WHERE", "WHILE", "WITH", "WITHIN", "WRITETEXT", "ABSOLUTE", "AFTER",
            "ALLOWED", "ALLOW_SNAPSHOT_ISOLATION", "ANSI_NULLS", "ANSI_NULL_DEFAULT",
            "ANSI_PADDING", "ANSI_WARNINGS", "APPLY", "ARITHABORT", "AUTO", "AUTO_CLEANUP",
            "AUTO_CLOSE", "AUTO_CREATE_STATISTICS", "AUTO_SHRINK", "AUTO_UPDATE_STATISTICS",
            "AUTO_UPDATE_STATISTICS_ASYNC", "AVG", "BASE64", "BINARY_CHECKSUM", "BULK_LOGGED",
            "CALLER", "CAST", "CATCH", "CHANGE_RETENTION", "CHANGE_TRACKING", "CHECKSUM",
            "CHECKSUM_AGG", "COMMITTED", "COMPATIBILITY_LEVEL", "CONCAT", "CONCAT_NULL_YIELDS_NULL",
            "CONTROL", "COOKIE", "COUNT", "COUNT_BIG", "CURSOR_CLOSE_ON_COMMIT", "CURSOR_DEFAULT",
            "DATEADD", "DATEDIFF", "DATENAME", "DATEPART", "DATE_CORRELATION_OPTIMIZATION",
            "DAYS", "DB_CHAINING", "DEFAULT_FULLTEXT_LANGUAGE", "DEFAULT_LANGUAGE",
            "DELAY", "DELAYED_DURABILITY", "DELETED", "DENSE_RANK", "DIRECTORY_NAME",
            "DISABLE", "DISABLED", "DISABLE_BROKER", "DYNAMIC", "EMERGENCY", "ENABLE_BROKER",
            "ENCRYPTION", "ERROR_BROKER_CONVERSATIONS", "EXPAND", "FAST", "FAST_FORWARD",
            "FILEGROUP", "FILEGROWTH", "FILESTREAM", "FIRST", "FOLLOWING", "FORCE",
            "FORCED", "FORWARD_ONLY", "FULLSCAN", "GB", "GLOBAL", "GO", "GROUPING",
            "GROUPING_ID", "HADR", "HASH", "HONOR_BROKER_PRIORITY", "HOURS", "IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX",
            "IMMEDIATE", "IMPERSONATE", "INCREMENTAL", "INPUT", "INSENSITIVE", "INSERTED",
            "ISOLATION", "KB", "KEEP", "KEEPFIXED", "KEYSET", "LAST", "LEVEL", "LOCAL",
            "LOCK_ESCALATION", "LOGIN", "LOOP", "MARK", "MAX", "MAXDOP", "MAXRECURSION",
            "MAXSIZE", "MB", "MEMORY_OPTIMIZED_DATA", "MIN", "MINUTES", "MIN_ACTIVE_ROWVERSION",
            "MIXED_PAGE_ALLOCATION", "MODIFY", "MULTI_USER", "NAME", "NESTED_TRIGGERS",
            "NEW_BROKER", "NEXT", "NOCOUNT", "NOEXPAND", "NON_TRANSACTED_ACCESS",
            "NORECOMPUTE", "NO_WAIT", "NTILE", "NUMBER", "NUMERIC_ROUNDABORT", "OFFLINE",
            "OFFSET", "ONLINE", "ONLY", "OPTIMISTIC", "OPTIMIZE", "OUT", "OUTPUT",
            "OWNER", "PAGE_VERIFY", "PARAMETERIZATION", "PARTITION", "PATH", "PRECEDING",
            "PRIOR", "PRIVILEGES", "QUOTED_IDENTIFIER", "RANGE", "RANK", "READONLY",
            "READ_COMMITTED_SNAPSHOT", "READ_ONLY", "READ_WRITE", "RECOMPILE", "RECOVERY",
            "RECURSIVE_TRIGGERS", "RELATIVE", "REMOTE", "REPEATABLE", "RESTRICTED_USER",
            "ROBUST", "ROOT", "ROW", "ROWGUID", "ROWS", "ROW_NUMBER", "SAMPLE", "SCHEMABINDING",
            "SCROLL", "SCROLL_LOCKS", "SECONDS", "SELF", "SERIALIZABLE", "SHOWPLAN",
            "SIMPLE", "SINGLE_USER", "SIZE", "SNAPSHOT", "SPATIAL_WINDOW_MAX_CELLS",
            "STATIC", "STATS_STREAM", "STDEV", "STDEVP", "SUM", "TAKE", "TARGET_RECOVERY_TIME",
            "TB", "TEXTIMAGE_ON", "THROW", "TIES", "TIME", "TORN_PAGE_DETECTION",
            "TRANSFORM_NOISE_WORDS", "TRUSTWORTHY", "TRY", "TWO_DIGIT_YEAR_CUTOFF",
            "TYPE", "TYPE_WARNING", "UNBOUNDED", "UNCOMMITTED", "UNKNOWN", "UNLIMITED",
            "USING", "VAR", "VARP", "VIEWS", "VIEW_METADATA", "WORK", "XML", "XMLNAMESPACES",
            "DOLLAR_ACTION", "SPACE", "COMMENT", "LINE_COMMENT", "DOUBLE_QUOTE_ID",
            "SQUARE_BRACKET_ID", "LOCAL_ID", "DECIMAL", "ID", "STRING", "BINARY",
            "FLOAT", "REAL", "EQUAL", "GREATER", "LESS", "EXCLAMATION", "PLUS_ASSIGN",
            "MINUS_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN",
            "XOR_ASSIGN", "OR_ASSIGN", "DOT", "UNDERLINE", "AT", "SHARP", "DOLLAR",
            "LR_BRACKET", "RR_BRACKET", "COMMA", "SEMI", "COLON", "STAR", "DIVIDE",
            "MODULE", "PLUS", "MINUS", "BIT_NOT", "BIT_OR", "BIT_AND", "BIT_XOR"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "SqlGrammar.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public SqlGrammarParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class SqlClausesContext extends ParserRuleContext {
        public TerminalNode EOF() {
            return getToken(SqlGrammarParser.EOF, 0);
        }

        public List<SqlClauseContext> sqlClause() {
            return getRuleContexts(SqlClauseContext.class);
        }

        public SqlClauseContext sqlClause(int i) {
            return getRuleContext(SqlClauseContext.class, i);
        }

        public List<TerminalNode> SEMI() {
            return getTokens(SqlGrammarParser.SEMI);
        }

        public TerminalNode SEMI(int i) {
            return getToken(SqlGrammarParser.SEMI, i);
        }

        public SqlClausesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_sqlClauses;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterSqlClauses(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitSqlClauses(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitSqlClauses(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SqlClausesContext sqlClauses() throws RecognitionException {
        SqlClausesContext _localctx = new SqlClausesContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_sqlClauses);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(106);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(102);
                            sqlClause();
                            setState(104);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == SEMI) {
                                {
                                    setState(103);
                                    match(SEMI);
                                }
                            }

                        }
                    }
                    setState(108);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == SELECT || _la == LR_BRACKET);
                setState(110);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SqlClauseContext extends ParserRuleContext {
        public DmlClauseContext dmlClause() {
            return getRuleContext(DmlClauseContext.class, 0);
        }

        public SqlClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_sqlClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterSqlClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitSqlClause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitSqlClause(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SqlClauseContext sqlClause() throws RecognitionException {
        SqlClauseContext _localctx = new SqlClauseContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_sqlClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(112);
                dmlClause();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DmlClauseContext extends ParserRuleContext {
        public SelectStatementContext selectStatement() {
            return getRuleContext(SelectStatementContext.class, 0);
        }

        public DmlClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dmlClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterDmlClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitDmlClause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitDmlClause(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DmlClauseContext dmlClause() throws RecognitionException {
        DmlClauseContext _localctx = new DmlClauseContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_dmlClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(114);
                selectStatement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SelectStatementContext extends ParserRuleContext {
        public QueryExpressionContext queryExpression() {
            return getRuleContext(QueryExpressionContext.class, 0);
        }

        public OrderByClauseContext orderByClause() {
            return getRuleContext(OrderByClauseContext.class, 0);
        }

        public OptionClauseContext optionClause() {
            return getRuleContext(OptionClauseContext.class, 0);
        }

        public SelectStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_selectStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterSelectStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitSelectStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitSelectStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SelectStatementContext selectStatement() throws RecognitionException {
        SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_selectStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(116);
                queryExpression();
                setState(118);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                    case 1: {
                        setState(117);
                        orderByClause();
                    }
                    break;
                }
                setState(121);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                    case 1: {
                        setState(120);
                        optionClause();
                    }
                    break;
                }
                setState(124);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                    case 1: {
                        setState(123);
                        match(SEMI);
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpressionContext extends ParserRuleContext {
        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        public ExpressionContext() {
        }

        public void copyFrom(ExpressionContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class UnaryOperatorExpressionContext extends ExpressionContext {
        public Token op;

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public UnaryOperatorExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener)
                ((SqlGrammarListener) listener).enterUnaryOperatorExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener)
                ((SqlGrammarListener) listener).exitUnaryOperatorExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitUnaryOperatorExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PrimitiveExpressionContext extends ExpressionContext {
        public TerminalNode DEFAULT() {
            return getToken(SqlGrammarParser.DEFAULT, 0);
        }

        public TerminalNode NULL() {
            return getToken(SqlGrammarParser.NULL, 0);
        }

        public TerminalNode LOCAL_ID() {
            return getToken(SqlGrammarParser.LOCAL_ID, 0);
        }

        public ConstantContext constant() {
            return getRuleContext(ConstantContext.class, 0);
        }

        public PrimitiveExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterPrimitiveExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitPrimitiveExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitPrimitiveExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CaseExpressionContext extends ExpressionContext {
        public ExpressionContext caseExpr;
        public ExpressionContext elseExpr;

        public TerminalNode CASE() {
            return getToken(SqlGrammarParser.CASE, 0);
        }

        public TerminalNode END() {
            return getToken(SqlGrammarParser.END, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<SwitchSectionContext> switchSection() {
            return getRuleContexts(SwitchSectionContext.class);
        }

        public SwitchSectionContext switchSection(int i) {
            return getRuleContext(SwitchSectionContext.class, i);
        }

        public TerminalNode ELSE() {
            return getToken(SqlGrammarParser.ELSE, 0);
        }

        public List<SwitchSearchConditionSectionContext> switchSearchConditionSection() {
            return getRuleContexts(SwitchSearchConditionSectionContext.class);
        }

        public SwitchSearchConditionSectionContext switchSearchConditionSection(int i) {
            return getRuleContext(SwitchSearchConditionSectionContext.class, i);
        }

        public CaseExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterCaseExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitCaseExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitCaseExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunctionCallExpressionContext extends ExpressionContext {
        public FunctionCallContext functionCall() {
            return getRuleContext(FunctionCallContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode COLLATE() {
            return getToken(SqlGrammarParser.COLLATE, 0);
        }

        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public FunctionCallExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener)
                ((SqlGrammarListener) listener).enterFunctionCallExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener)
                ((SqlGrammarListener) listener).exitFunctionCallExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitFunctionCallExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ColumnRefExpressionContext extends ExpressionContext {
        public FullColumnNameContext fullColumnName() {
            return getRuleContext(FullColumnNameContext.class, 0);
        }

        public ColumnRefExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterColumnRefExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitColumnRefExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitColumnRefExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BracketExpressionContext extends ExpressionContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public BracketExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterBracketExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitBracketExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitBracketExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SubqueryExpressionContext extends ExpressionContext {
        public SubqueryContext subquery() {
            return getRuleContext(SubqueryContext.class, 0);
        }

        public SubqueryExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterSubqueryExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitSubqueryExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitSubqueryExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BinaryOperatorExpressionContext extends ExpressionContext {
        public Token op;

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public ComparisonOperatorContext comparisonOperator() {
            return getRuleContext(ComparisonOperatorContext.class, 0);
        }

        public BinaryOperatorExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener)
                ((SqlGrammarListener) listener).enterBinaryOperatorExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener)
                ((SqlGrammarListener) listener).exitBinaryOperatorExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitBinaryOperatorExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExpressionContext expression() throws RecognitionException {
        return expression(0);
    }

    private ExpressionContext expression(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
        ExpressionContext _prevctx = _localctx;
        int _startState = 8;
        enterRecursionRule(_localctx, 8, RULE_expression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(170);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
                    case 1: {
                        _localctx = new PrimitiveExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(127);
                        match(DEFAULT);
                    }
                    break;
                    case 2: {
                        _localctx = new PrimitiveExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(128);
                        match(NULL);
                    }
                    break;
                    case 3: {
                        _localctx = new PrimitiveExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(129);
                        match(LOCAL_ID);
                    }
                    break;
                    case 4: {
                        _localctx = new PrimitiveExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(130);
                        constant();
                    }
                    break;
                    case 5: {
                        _localctx = new FunctionCallExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(131);
                        functionCall();
                    }
                    break;
                    case 6: {
                        _localctx = new CaseExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(132);
                        match(CASE);
                        setState(133);
                        ((CaseExpressionContext) _localctx).caseExpr = expression(0);
                        setState(135);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do {
                            {
                                {
                                    setState(134);
                                    switchSection();
                                }
                            }
                            setState(137);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        } while (_la == WHEN);
                        setState(141);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == ELSE) {
                            {
                                setState(139);
                                match(ELSE);
                                setState(140);
                                ((CaseExpressionContext) _localctx).elseExpr = expression(0);
                            }
                        }

                        setState(143);
                        match(END);
                    }
                    break;
                    case 7: {
                        _localctx = new CaseExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(145);
                        match(CASE);
                        setState(147);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do {
                            {
                                {
                                    setState(146);
                                    switchSearchConditionSection();
                                }
                            }
                            setState(149);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        } while (_la == WHEN);
                        setState(153);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == ELSE) {
                            {
                                setState(151);
                                match(ELSE);
                                setState(152);
                                ((CaseExpressionContext) _localctx).elseExpr = expression(0);
                            }
                        }

                        setState(155);
                        match(END);
                    }
                    break;
                    case 8: {
                        _localctx = new ColumnRefExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(157);
                        fullColumnName();
                    }
                    break;
                    case 9: {
                        _localctx = new BracketExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(158);
                        match(LR_BRACKET);
                        setState(159);
                        expression(0);
                        setState(160);
                        match(RR_BRACKET);
                    }
                    break;
                    case 10: {
                        _localctx = new SubqueryExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(162);
                        match(LR_BRACKET);
                        setState(163);
                        subquery();
                        setState(164);
                        match(RR_BRACKET);
                    }
                    break;
                    case 11: {
                        _localctx = new UnaryOperatorExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(166);
                        match(BIT_NOT);
                        setState(167);
                        expression(5);
                    }
                    break;
                    case 12: {
                        _localctx = new UnaryOperatorExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(168);
                        ((UnaryOperatorExpressionContext) _localctx).op = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == PLUS || _la == MINUS)) {
                            ((UnaryOperatorExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(169);
                        expression(3);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(187);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(185);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
                                case 1: {
                                    _localctx = new BinaryOperatorExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(172);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(173);
                                    ((BinaryOperatorExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(((((_la - 433)) & ~0x3f) == 0 && ((1L << (_la - 433)) & ((1L << (STAR - 433)) | (1L << (DIVIDE - 433)) | (1L << (MODULE - 433)))) != 0))) {
                                        ((BinaryOperatorExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(174);
                                    expression(5);
                                }
                                break;
                                case 2: {
                                    _localctx = new BinaryOperatorExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(175);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(176);
                                    ((BinaryOperatorExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(((((_la - 436)) & ~0x3f) == 0 && ((1L << (_la - 436)) & ((1L << (PLUS - 436)) | (1L << (MINUS - 436)) | (1L << (BIT_OR - 436)) | (1L << (BIT_AND - 436)) | (1L << (BIT_XOR - 436)))) != 0))) {
                                        ((BinaryOperatorExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(177);
                                    expression(3);
                                }
                                break;
                                case 3: {
                                    _localctx = new BinaryOperatorExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(178);
                                    if (!(precpred(_ctx, 1)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                    setState(179);
                                    comparisonOperator();
                                    setState(180);
                                    expression(2);
                                }
                                break;
                                case 4: {
                                    _localctx = new FunctionCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(182);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(183);
                                    match(COLLATE);
                                    setState(184);
                                    id();
                                }
                                break;
                            }
                        }
                    }
                    setState(189);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class ConstantExpressionContext extends ParserRuleContext {
        public TerminalNode NULL() {
            return getToken(SqlGrammarParser.NULL, 0);
        }

        public ConstantContext constant() {
            return getRuleContext(ConstantContext.class, 0);
        }

        public FunctionCallContext functionCall() {
            return getRuleContext(FunctionCallContext.class, 0);
        }

        public TerminalNode LOCAL_ID() {
            return getToken(SqlGrammarParser.LOCAL_ID, 0);
        }

        public ConstantExpressionContext constantExpression() {
            return getRuleContext(ConstantExpressionContext.class, 0);
        }

        public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constantExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterConstantExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitConstantExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitConstantExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ConstantExpressionContext constantExpression() throws RecognitionException {
        ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_constantExpression);
        try {
            setState(198);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case NULL:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(190);
                    match(NULL);
                }
                break;
                case DECIMAL:
                case STRING:
                case BINARY:
                case FLOAT:
                case REAL:
                case DOLLAR:
                case PLUS:
                case MINUS:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(191);
                    constant();
                }
                break;
                case CALLED:
                case COALESCE:
                case CONVERT:
                case CURRENT_TIMESTAMP:
                case CURRENT_USER:
                case FORCESEEK:
                case IDENTITY:
                case LEFT:
                case NULLIF:
                case PUBLIC:
                case RETURN:
                case RETURNS:
                case RIGHT:
                case SESSION_USER:
                case SYSTEM_USER:
                case ABSOLUTE:
                case APPLY:
                case AUTO:
                case AVG:
                case BASE64:
                case BINARY_CHECKSUM:
                case CALLER:
                case CAST:
                case CATCH:
                case CHECKSUM:
                case CHECKSUM_AGG:
                case COMMITTED:
                case CONCAT:
                case CONTROL:
                case COOKIE:
                case COUNT:
                case COUNT_BIG:
                case DATEADD:
                case DATEDIFF:
                case DATENAME:
                case DATEPART:
                case DELAY:
                case DELETED:
                case DENSE_RANK:
                case DISABLE:
                case DYNAMIC:
                case ENCRYPTION:
                case EXPAND:
                case FAST:
                case FAST_FORWARD:
                case FIRST:
                case FOLLOWING:
                case FORCE:
                case FORCED:
                case FORWARD_ONLY:
                case FULLSCAN:
                case GLOBAL:
                case GO:
                case GROUPING:
                case GROUPING_ID:
                case HASH:
                case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
                case IMPERSONATE:
                case INPUT:
                case INSENSITIVE:
                case INSERTED:
                case ISOLATION:
                case KEEP:
                case KEEPFIXED:
                case KEYSET:
                case LAST:
                case LEVEL:
                case LOCAL:
                case LOCK_ESCALATION:
                case LOGIN:
                case LOOP:
                case MARK:
                case MAX:
                case MAXDOP:
                case MAXRECURSION:
                case MIN:
                case MIN_ACTIVE_ROWVERSION:
                case MODIFY:
                case NAME:
                case NEXT:
                case NOCOUNT:
                case NOEXPAND:
                case NORECOMPUTE:
                case NTILE:
                case NUMBER:
                case OFFSET:
                case ONLINE:
                case ONLY:
                case OPTIMISTIC:
                case OPTIMIZE:
                case OUT:
                case OUTPUT:
                case OWNER:
                case PARAMETERIZATION:
                case PARTITION:
                case PATH:
                case PRECEDING:
                case PRIOR:
                case PRIVILEGES:
                case RANGE:
                case RANK:
                case READONLY:
                case READ_ONLY:
                case RECOMPILE:
                case RELATIVE:
                case REMOTE:
                case REPEATABLE:
                case ROBUST:
                case ROOT:
                case ROW:
                case ROWGUID:
                case ROWS:
                case ROW_NUMBER:
                case SAMPLE:
                case SCHEMABINDING:
                case SCROLL:
                case SCROLL_LOCKS:
                case SELF:
                case SERIALIZABLE:
                case SIMPLE:
                case SIZE:
                case SNAPSHOT:
                case SPATIAL_WINDOW_MAX_CELLS:
                case STATIC:
                case STATS_STREAM:
                case STDEV:
                case STDEVP:
                case SUM:
                case TEXTIMAGE_ON:
                case THROW:
                case TIES:
                case TIME:
                case TRY:
                case TYPE:
                case TYPE_WARNING:
                case UNBOUNDED:
                case UNCOMMITTED:
                case UNKNOWN:
                case USING:
                case VAR:
                case VARP:
                case VIEWS:
                case VIEW_METADATA:
                case WORK:
                case XML:
                case XMLNAMESPACES:
                case DOUBLE_QUOTE_ID:
                case SQUARE_BRACKET_ID:
                case ID:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(192);
                    functionCall();
                }
                break;
                case LOCAL_ID:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(193);
                    match(LOCAL_ID);
                }
                break;
                case LR_BRACKET:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(194);
                    match(LR_BRACKET);
                    setState(195);
                    constantExpression();
                    setState(196);
                    match(RR_BRACKET);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SubqueryContext extends ParserRuleContext {
        public SelectStatementContext selectStatement() {
            return getRuleContext(SelectStatementContext.class, 0);
        }

        public SubqueryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_subquery;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterSubquery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitSubquery(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitSubquery(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SubqueryContext subquery() throws RecognitionException {
        SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_subquery);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(200);
                selectStatement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SearchConditionContext extends ParserRuleContext {
        public List<SearchConditionAndContext> searchConditionAnd() {
            return getRuleContexts(SearchConditionAndContext.class);
        }

        public SearchConditionAndContext searchConditionAnd(int i) {
            return getRuleContext(SearchConditionAndContext.class, i);
        }

        public List<TerminalNode> OR() {
            return getTokens(SqlGrammarParser.OR);
        }

        public TerminalNode OR(int i) {
            return getToken(SqlGrammarParser.OR, i);
        }

        public SearchConditionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_searchCondition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterSearchCondition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitSearchCondition(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitSearchCondition(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SearchConditionContext searchCondition() throws RecognitionException {
        SearchConditionContext _localctx = new SearchConditionContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_searchCondition);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(202);
                searchConditionAnd();
                setState(207);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OR) {
                    {
                        {
                            setState(203);
                            match(OR);
                            setState(204);
                            searchConditionAnd();
                        }
                    }
                    setState(209);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SearchConditionAndContext extends ParserRuleContext {
        public List<SearchConditionNotContext> searchConditionNot() {
            return getRuleContexts(SearchConditionNotContext.class);
        }

        public SearchConditionNotContext searchConditionNot(int i) {
            return getRuleContext(SearchConditionNotContext.class, i);
        }

        public List<TerminalNode> AND() {
            return getTokens(SqlGrammarParser.AND);
        }

        public TerminalNode AND(int i) {
            return getToken(SqlGrammarParser.AND, i);
        }

        public SearchConditionAndContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_searchConditionAnd;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterSearchConditionAnd(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitSearchConditionAnd(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitSearchConditionAnd(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SearchConditionAndContext searchConditionAnd() throws RecognitionException {
        SearchConditionAndContext _localctx = new SearchConditionAndContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_searchConditionAnd);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(210);
                searchConditionNot();
                setState(215);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == AND) {
                    {
                        {
                            setState(211);
                            match(AND);
                            setState(212);
                            searchConditionNot();
                        }
                    }
                    setState(217);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SearchConditionNotContext extends ParserRuleContext {
        public PredicateContext predicate() {
            return getRuleContext(PredicateContext.class, 0);
        }

        public TerminalNode NOT() {
            return getToken(SqlGrammarParser.NOT, 0);
        }

        public SearchConditionNotContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_searchConditionNot;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterSearchConditionNot(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitSearchConditionNot(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitSearchConditionNot(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SearchConditionNotContext searchConditionNot() throws RecognitionException {
        SearchConditionNotContext _localctx = new SearchConditionNotContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_searchConditionNot);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(219);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == NOT) {
                    {
                        setState(218);
                        match(NOT);
                    }
                }

                setState(221);
                predicate();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PredicateContext extends ParserRuleContext {
        public TerminalNode EXISTS() {
            return getToken(SqlGrammarParser.EXISTS, 0);
        }

        public SubqueryContext subquery() {
            return getRuleContext(SubqueryContext.class, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public ComparisonOperatorContext comparisonOperator() {
            return getRuleContext(ComparisonOperatorContext.class, 0);
        }

        public TerminalNode ALL() {
            return getToken(SqlGrammarParser.ALL, 0);
        }

        public TerminalNode SOME() {
            return getToken(SqlGrammarParser.SOME, 0);
        }

        public TerminalNode ANY() {
            return getToken(SqlGrammarParser.ANY, 0);
        }

        public TerminalNode BETWEEN() {
            return getToken(SqlGrammarParser.BETWEEN, 0);
        }

        public TerminalNode AND() {
            return getToken(SqlGrammarParser.AND, 0);
        }

        public TerminalNode NOT() {
            return getToken(SqlGrammarParser.NOT, 0);
        }

        public TerminalNode IN() {
            return getToken(SqlGrammarParser.IN, 0);
        }

        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class, 0);
        }

        public TerminalNode LIKE() {
            return getToken(SqlGrammarParser.LIKE, 0);
        }

        public TerminalNode ESCAPE() {
            return getToken(SqlGrammarParser.ESCAPE, 0);
        }

        public TerminalNode IS() {
            return getToken(SqlGrammarParser.IS, 0);
        }

        public NullNotnullContext nullNotnull() {
            return getRuleContext(NullNotnullContext.class, 0);
        }

        public SearchConditionContext searchCondition() {
            return getRuleContext(SearchConditionContext.class, 0);
        }

        public PredicateContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_predicate;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterPredicate(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitPredicate(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitPredicate(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PredicateContext predicate() throws RecognitionException {
        PredicateContext _localctx = new PredicateContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_predicate);
        int _la;
        try {
            setState(278);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 21, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(223);
                    match(EXISTS);
                    setState(224);
                    match(LR_BRACKET);
                    setState(225);
                    subquery();
                    setState(226);
                    match(RR_BRACKET);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(228);
                    expression(0);
                    setState(229);
                    comparisonOperator();
                    setState(230);
                    expression(0);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(232);
                    expression(0);
                    setState(233);
                    comparisonOperator();
                    setState(234);
                    _la = _input.LA(1);
                    if (!(_la == ALL || _la == ANY || _la == SOME)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(235);
                    match(LR_BRACKET);
                    setState(236);
                    subquery();
                    setState(237);
                    match(RR_BRACKET);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(239);
                    expression(0);
                    setState(241);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == NOT) {
                        {
                            setState(240);
                            match(NOT);
                        }
                    }

                    setState(243);
                    match(BETWEEN);
                    setState(244);
                    expression(0);
                    setState(245);
                    match(AND);
                    setState(246);
                    expression(0);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(248);
                    expression(0);
                    setState(250);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == NOT) {
                        {
                            setState(249);
                            match(NOT);
                        }
                    }

                    setState(252);
                    match(IN);
                    setState(253);
                    match(LR_BRACKET);
                    setState(256);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                        case 1: {
                            setState(254);
                            subquery();
                        }
                        break;
                        case 2: {
                            setState(255);
                            expressionList();
                        }
                        break;
                    }
                    setState(258);
                    match(RR_BRACKET);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(260);
                    expression(0);
                    setState(262);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == NOT) {
                        {
                            setState(261);
                            match(NOT);
                        }
                    }

                    setState(264);
                    match(LIKE);
                    setState(265);
                    expression(0);
                    setState(268);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == ESCAPE) {
                        {
                            setState(266);
                            match(ESCAPE);
                            setState(267);
                            expression(0);
                        }
                    }

                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(270);
                    expression(0);
                    setState(271);
                    match(IS);
                    setState(272);
                    nullNotnull();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(274);
                    match(LR_BRACKET);
                    setState(275);
                    searchCondition();
                    setState(276);
                    match(RR_BRACKET);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class QueryExpressionContext extends ParserRuleContext {
        public QuerySpecificationContext querySpecification() {
            return getRuleContext(QuerySpecificationContext.class, 0);
        }

        public QueryExpressionContext queryExpression() {
            return getRuleContext(QueryExpressionContext.class, 0);
        }

        public List<UnionContext> union() {
            return getRuleContexts(UnionContext.class);
        }

        public UnionContext union(int i) {
            return getRuleContext(UnionContext.class, i);
        }

        public QueryExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_queryExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterQueryExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitQueryExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitQueryExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final QueryExpressionContext queryExpression() throws RecognitionException {
        QueryExpressionContext _localctx = new QueryExpressionContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_queryExpression);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(285);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case SELECT: {
                        setState(280);
                        querySpecification();
                    }
                    break;
                    case LR_BRACKET: {
                        setState(281);
                        match(LR_BRACKET);
                        setState(282);
                        queryExpression();
                        setState(283);
                        match(RR_BRACKET);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(290);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(287);
                                union();
                            }
                        }
                    }
                    setState(292);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class UnionContext extends ParserRuleContext {
        public TerminalNode UNION() {
            return getToken(SqlGrammarParser.UNION, 0);
        }

        public TerminalNode EXCEPT() {
            return getToken(SqlGrammarParser.EXCEPT, 0);
        }

        public TerminalNode INTERSECT() {
            return getToken(SqlGrammarParser.INTERSECT, 0);
        }

        public QuerySpecificationContext querySpecification() {
            return getRuleContext(QuerySpecificationContext.class, 0);
        }

        public QueryExpressionContext queryExpression() {
            return getRuleContext(QueryExpressionContext.class, 0);
        }

        public TerminalNode ALL() {
            return getToken(SqlGrammarParser.ALL, 0);
        }

        public UnionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_union;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterUnion(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitUnion(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitUnion(this);
            else return visitor.visitChildren(this);
        }
    }

    public final UnionContext union() throws RecognitionException {
        UnionContext _localctx = new UnionContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_union);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(299);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case UNION: {
                        setState(293);
                        match(UNION);
                        setState(295);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == ALL) {
                            {
                                setState(294);
                                match(ALL);
                            }
                        }

                    }
                    break;
                    case EXCEPT: {
                        setState(297);
                        match(EXCEPT);
                    }
                    break;
                    case INTERSECT: {
                        setState(298);
                        match(INTERSECT);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(306);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case SELECT: {
                        setState(301);
                        querySpecification();
                    }
                    break;
                    case LR_BRACKET: {
                        {
                            setState(302);
                            match(LR_BRACKET);
                            setState(303);
                            queryExpression();
                            setState(304);
                            match(RR_BRACKET);
                        }
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class QuerySpecificationContext extends ParserRuleContext {
        public SearchConditionContext where;
        public SearchConditionContext having;

        public TerminalNode SELECT() {
            return getToken(SqlGrammarParser.SELECT, 0);
        }

        public SelectListContext selectList() {
            return getRuleContext(SelectListContext.class, 0);
        }

        public TerminalNode INTO() {
            return getToken(SqlGrammarParser.INTO, 0);
        }

        public TableNameContext tableName() {
            return getRuleContext(TableNameContext.class, 0);
        }

        public TerminalNode FROM() {
            return getToken(SqlGrammarParser.FROM, 0);
        }

        public TableSourcesContext tableSources() {
            return getRuleContext(TableSourcesContext.class, 0);
        }

        public TerminalNode WHERE() {
            return getToken(SqlGrammarParser.WHERE, 0);
        }

        public TerminalNode GROUP() {
            return getToken(SqlGrammarParser.GROUP, 0);
        }

        public TerminalNode BY() {
            return getToken(SqlGrammarParser.BY, 0);
        }

        public List<GroupByItemContext> groupByItem() {
            return getRuleContexts(GroupByItemContext.class);
        }

        public GroupByItemContext groupByItem(int i) {
            return getRuleContext(GroupByItemContext.class, i);
        }

        public TerminalNode HAVING() {
            return getToken(SqlGrammarParser.HAVING, 0);
        }

        public TerminalNode ALL() {
            return getToken(SqlGrammarParser.ALL, 0);
        }

        public TerminalNode DISTINCT() {
            return getToken(SqlGrammarParser.DISTINCT, 0);
        }

        public List<SearchConditionContext> searchCondition() {
            return getRuleContexts(SearchConditionContext.class);
        }

        public SearchConditionContext searchCondition(int i) {
            return getRuleContext(SearchConditionContext.class, i);
        }

        public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_querySpecification;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterQuerySpecification(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitQuerySpecification(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitQuerySpecification(this);
            else return visitor.visitChildren(this);
        }
    }

    public final QuerySpecificationContext querySpecification() throws RecognitionException {
        QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_querySpecification);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(308);
                match(SELECT);
                setState(310);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ALL || _la == DISTINCT) {
                    {
                        setState(309);
                        _la = _input.LA(1);
                        if (!(_la == ALL || _la == DISTINCT)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }

                setState(312);
                selectList();
                setState(315);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == INTO) {
                    {
                        setState(313);
                        match(INTO);
                        setState(314);
                        tableName();
                    }
                }

                setState(319);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == FROM) {
                    {
                        setState(317);
                        match(FROM);
                        setState(318);
                        tableSources();
                    }
                }

                setState(323);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 30, _ctx)) {
                    case 1: {
                        setState(321);
                        match(WHERE);
                        setState(322);
                        ((QuerySpecificationContext) _localctx).where = searchCondition();
                    }
                    break;
                }
                setState(335);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 32, _ctx)) {
                    case 1: {
                        setState(325);
                        match(GROUP);
                        setState(326);
                        match(BY);
                        setState(327);
                        groupByItem();
                        setState(332);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 31, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(328);
                                        match(COMMA);
                                        setState(329);
                                        groupByItem();
                                    }
                                }
                            }
                            setState(334);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 31, _ctx);
                        }
                    }
                    break;
                }
                setState(339);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 33, _ctx)) {
                    case 1: {
                        setState(337);
                        match(HAVING);
                        setState(338);
                        ((QuerySpecificationContext) _localctx).having = searchCondition();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OrderByClauseContext extends ParserRuleContext {
        public TerminalNode ORDER() {
            return getToken(SqlGrammarParser.ORDER, 0);
        }

        public TerminalNode BY() {
            return getToken(SqlGrammarParser.BY, 0);
        }

        public List<OrderByExpressionContext> orderByExpression() {
            return getRuleContexts(OrderByExpressionContext.class);
        }

        public OrderByExpressionContext orderByExpression(int i) {
            return getRuleContext(OrderByExpressionContext.class, i);
        }

        public TerminalNode OFFSET() {
            return getToken(SqlGrammarParser.OFFSET, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<TerminalNode> ROW() {
            return getTokens(SqlGrammarParser.ROW);
        }

        public TerminalNode ROW(int i) {
            return getToken(SqlGrammarParser.ROW, i);
        }

        public List<TerminalNode> ROWS() {
            return getTokens(SqlGrammarParser.ROWS);
        }

        public TerminalNode ROWS(int i) {
            return getToken(SqlGrammarParser.ROWS, i);
        }

        public TerminalNode FETCH() {
            return getToken(SqlGrammarParser.FETCH, 0);
        }

        public TerminalNode ONLY() {
            return getToken(SqlGrammarParser.ONLY, 0);
        }

        public TerminalNode FIRST() {
            return getToken(SqlGrammarParser.FIRST, 0);
        }

        public TerminalNode NEXT() {
            return getToken(SqlGrammarParser.NEXT, 0);
        }

        public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_orderByClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterOrderByClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitOrderByClause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitOrderByClause(this);
            else return visitor.visitChildren(this);
        }
    }

    public final OrderByClauseContext orderByClause() throws RecognitionException {
        OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_orderByClause);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(341);
                match(ORDER);
                setState(342);
                match(BY);
                setState(343);
                orderByExpression();
                setState(348);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 34, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(344);
                                match(COMMA);
                                setState(345);
                                orderByExpression();
                            }
                        }
                    }
                    setState(350);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 34, _ctx);
                }
                setState(362);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 36, _ctx)) {
                    case 1: {
                        setState(351);
                        match(OFFSET);
                        setState(352);
                        expression(0);
                        setState(353);
                        _la = _input.LA(1);
                        if (!(_la == ROW || _la == ROWS)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(360);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == FETCH) {
                            {
                                setState(354);
                                match(FETCH);
                                setState(355);
                                _la = _input.LA(1);
                                if (!(_la == FIRST || _la == NEXT)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(356);
                                expression(0);
                                setState(357);
                                _la = _input.LA(1);
                                if (!(_la == ROW || _la == ROWS)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(358);
                                match(ONLY);
                            }
                        }

                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OrderByExpressionContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode ASC() {
            return getToken(SqlGrammarParser.ASC, 0);
        }

        public TerminalNode DESC() {
            return getToken(SqlGrammarParser.DESC, 0);
        }

        public OrderByExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_orderByExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterOrderByExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitOrderByExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitOrderByExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final OrderByExpressionContext orderByExpression() throws RecognitionException {
        OrderByExpressionContext _localctx = new OrderByExpressionContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_orderByExpression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(364);
                expression(0);
                setState(366);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ASC || _la == DESC) {
                    {
                        setState(365);
                        _la = _input.LA(1);
                        if (!(_la == ASC || _la == DESC)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class GroupByItemContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public GroupByItemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_groupByItem;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterGroupByItem(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitGroupByItem(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitGroupByItem(this);
            else return visitor.visitChildren(this);
        }
    }

    public final GroupByItemContext groupByItem() throws RecognitionException {
        GroupByItemContext _localctx = new GroupByItemContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_groupByItem);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(368);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OptionClauseContext extends ParserRuleContext {
        public TerminalNode OPTION() {
            return getToken(SqlGrammarParser.OPTION, 0);
        }

        public List<OptionContext> option() {
            return getRuleContexts(OptionContext.class);
        }

        public OptionContext option(int i) {
            return getRuleContext(OptionContext.class, i);
        }

        public OptionClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_optionClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterOptionClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitOptionClause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitOptionClause(this);
            else return visitor.visitChildren(this);
        }
    }

    public final OptionClauseContext optionClause() throws RecognitionException {
        OptionClauseContext _localctx = new OptionClauseContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_optionClause);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(370);
                match(OPTION);
                setState(371);
                match(LR_BRACKET);
                setState(372);
                option();
                setState(377);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(373);
                            match(COMMA);
                            setState(374);
                            option();
                        }
                    }
                    setState(379);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(380);
                match(RR_BRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OptionContext extends ParserRuleContext {
        public Token numberRows;
        public Token numberOfProcessors;
        public Token numberRecursion;

        public TerminalNode FAST() {
            return getToken(SqlGrammarParser.FAST, 0);
        }

        public TerminalNode DECIMAL() {
            return getToken(SqlGrammarParser.DECIMAL, 0);
        }

        public TerminalNode GROUP() {
            return getToken(SqlGrammarParser.GROUP, 0);
        }

        public TerminalNode HASH() {
            return getToken(SqlGrammarParser.HASH, 0);
        }

        public TerminalNode ORDER() {
            return getToken(SqlGrammarParser.ORDER, 0);
        }

        public TerminalNode UNION() {
            return getToken(SqlGrammarParser.UNION, 0);
        }

        public TerminalNode MERGE() {
            return getToken(SqlGrammarParser.MERGE, 0);
        }

        public TerminalNode CONCAT() {
            return getToken(SqlGrammarParser.CONCAT, 0);
        }

        public TerminalNode JOIN() {
            return getToken(SqlGrammarParser.JOIN, 0);
        }

        public TerminalNode LOOP() {
            return getToken(SqlGrammarParser.LOOP, 0);
        }

        public TerminalNode EXPAND() {
            return getToken(SqlGrammarParser.EXPAND, 0);
        }

        public TerminalNode VIEWS() {
            return getToken(SqlGrammarParser.VIEWS, 0);
        }

        public TerminalNode FORCE() {
            return getToken(SqlGrammarParser.FORCE, 0);
        }

        public TerminalNode IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX() {
            return getToken(SqlGrammarParser.IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX, 0);
        }

        public TerminalNode KEEP() {
            return getToken(SqlGrammarParser.KEEP, 0);
        }

        public TerminalNode PLAN() {
            return getToken(SqlGrammarParser.PLAN, 0);
        }

        public TerminalNode KEEPFIXED() {
            return getToken(SqlGrammarParser.KEEPFIXED, 0);
        }

        public TerminalNode MAXDOP() {
            return getToken(SqlGrammarParser.MAXDOP, 0);
        }

        public TerminalNode MAXRECURSION() {
            return getToken(SqlGrammarParser.MAXRECURSION, 0);
        }

        public TerminalNode OPTIMIZE() {
            return getToken(SqlGrammarParser.OPTIMIZE, 0);
        }

        public TerminalNode FOR() {
            return getToken(SqlGrammarParser.FOR, 0);
        }

        public TerminalNode UNKNOWN() {
            return getToken(SqlGrammarParser.UNKNOWN, 0);
        }

        public TerminalNode PARAMETERIZATION() {
            return getToken(SqlGrammarParser.PARAMETERIZATION, 0);
        }

        public TerminalNode SIMPLE() {
            return getToken(SqlGrammarParser.SIMPLE, 0);
        }

        public TerminalNode FORCED() {
            return getToken(SqlGrammarParser.FORCED, 0);
        }

        public TerminalNode RECOMPILE() {
            return getToken(SqlGrammarParser.RECOMPILE, 0);
        }

        public TerminalNode ROBUST() {
            return getToken(SqlGrammarParser.ROBUST, 0);
        }

        public TerminalNode USE() {
            return getToken(SqlGrammarParser.USE, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlGrammarParser.STRING, 0);
        }

        public OptionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_option;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterOption(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitOption(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitOption(this);
            else return visitor.visitChildren(this);
        }
    }

    public final OptionContext option() throws RecognitionException {
        OptionContext _localctx = new OptionContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_option);
        int _la;
        try {
            setState(414);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 39, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(382);
                    match(FAST);
                    setState(383);
                    ((OptionContext) _localctx).numberRows = match(DECIMAL);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(384);
                    _la = _input.LA(1);
                    if (!(_la == ORDER || _la == HASH)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(385);
                    match(GROUP);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(386);
                    _la = _input.LA(1);
                    if (!(_la == MERGE || _la == CONCAT || _la == HASH)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(387);
                    match(UNION);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(388);
                    _la = _input.LA(1);
                    if (!(_la == MERGE || _la == HASH || _la == LOOP)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(389);
                    match(JOIN);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(390);
                    match(EXPAND);
                    setState(391);
                    match(VIEWS);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(392);
                    match(FORCE);
                    setState(393);
                    match(ORDER);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(394);
                    match(IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX);
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(395);
                    match(KEEP);
                    setState(396);
                    match(PLAN);
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(397);
                    match(KEEPFIXED);
                    setState(398);
                    match(PLAN);
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(399);
                    match(MAXDOP);
                    setState(400);
                    ((OptionContext) _localctx).numberOfProcessors = match(DECIMAL);
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(401);
                    match(MAXRECURSION);
                    setState(402);
                    ((OptionContext) _localctx).numberRecursion = match(DECIMAL);
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(403);
                    match(OPTIMIZE);
                    setState(404);
                    match(FOR);
                    setState(405);
                    match(UNKNOWN);
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(406);
                    match(PARAMETERIZATION);
                    setState(407);
                    _la = _input.LA(1);
                    if (!(_la == FORCED || _la == SIMPLE)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(408);
                    match(RECOMPILE);
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(409);
                    match(ROBUST);
                    setState(410);
                    match(PLAN);
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(411);
                    match(USE);
                    setState(412);
                    match(PLAN);
                    setState(413);
                    match(STRING);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SelectListContext extends ParserRuleContext {
        public List<SelectListElemContext> selectListElem() {
            return getRuleContexts(SelectListElemContext.class);
        }

        public SelectListElemContext selectListElem(int i) {
            return getRuleContext(SelectListElemContext.class, i);
        }

        public SelectListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_selectList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterSelectList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitSelectList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitSelectList(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SelectListContext selectList() throws RecognitionException {
        SelectListContext _localctx = new SelectListContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_selectList);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(416);
                selectListElem();
                setState(421);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 40, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(417);
                                match(COMMA);
                                setState(418);
                                selectListElem();
                            }
                        }
                    }
                    setState(423);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 40, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SelectListElemContext extends ParserRuleContext {
        public TableNameContext tableName() {
            return getRuleContext(TableNameContext.class, 0);
        }

        public TerminalNode IDENTITY() {
            return getToken(SqlGrammarParser.IDENTITY, 0);
        }

        public TerminalNode ROWGUID() {
            return getToken(SqlGrammarParser.ROWGUID, 0);
        }

        public ColumnAliasContext columnAlias() {
            return getRuleContext(ColumnAliasContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SqlGrammarParser.AS, 0);
        }

        public SelectListElemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_selectListElem;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterSelectListElem(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitSelectListElem(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitSelectListElem(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SelectListElemContext selectListElem() throws RecognitionException {
        SelectListElemContext _localctx = new SelectListElemContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_selectListElem);
        int _la;
        try {
            setState(445);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 45, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(427);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == CALLED || _la == FORCESEEK || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (PUBLIC - 133)) | (1L << (RETURN - 133)) | (1L << (RETURNS - 133)) | (1L << (ABSOLUTE - 133)))) != 0) || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (APPLY - 202)) | (1L << (AUTO - 202)) | (1L << (AVG - 202)) | (1L << (BASE64 - 202)) | (1L << (CALLER - 202)) | (1L << (CAST - 202)) | (1L << (CATCH - 202)) | (1L << (CHECKSUM_AGG - 202)) | (1L << (COMMITTED - 202)) | (1L << (CONCAT - 202)) | (1L << (CONTROL - 202)) | (1L << (COOKIE - 202)) | (1L << (COUNT - 202)) | (1L << (COUNT_BIG - 202)) | (1L << (DELAY - 202)) | (1L << (DELETED - 202)) | (1L << (DENSE_RANK - 202)) | (1L << (DISABLE - 202)) | (1L << (DYNAMIC - 202)) | (1L << (ENCRYPTION - 202)) | (1L << (EXPAND - 202)) | (1L << (FAST - 202)) | (1L << (FAST_FORWARD - 202)) | (1L << (FIRST - 202)) | (1L << (FOLLOWING - 202)) | (1L << (FORCE - 202)) | (1L << (FORCED - 202)) | (1L << (FORWARD_ONLY - 202)) | (1L << (FULLSCAN - 202)))) != 0) || ((((_la - 267)) & ~0x3f) == 0 && ((1L << (_la - 267)) & ((1L << (GLOBAL - 267)) | (1L << (GO - 267)) | (1L << (GROUPING - 267)) | (1L << (GROUPING_ID - 267)) | (1L << (HASH - 267)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 267)) | (1L << (IMPERSONATE - 267)) | (1L << (INPUT - 267)) | (1L << (INSENSITIVE - 267)) | (1L << (INSERTED - 267)) | (1L << (ISOLATION - 267)) | (1L << (KEEP - 267)) | (1L << (KEEPFIXED - 267)) | (1L << (KEYSET - 267)) | (1L << (LAST - 267)) | (1L << (LEVEL - 267)) | (1L << (LOCAL - 267)) | (1L << (LOCK_ESCALATION - 267)) | (1L << (LOGIN - 267)) | (1L << (LOOP - 267)) | (1L << (MARK - 267)) | (1L << (MAX - 267)) | (1L << (MAXDOP - 267)) | (1L << (MAXRECURSION - 267)) | (1L << (MIN - 267)) | (1L << (MODIFY - 267)) | (1L << (NAME - 267)) | (1L << (NEXT - 267)) | (1L << (NOCOUNT - 267)) | (1L << (NOEXPAND - 267)) | (1L << (NORECOMPUTE - 267)) | (1L << (NTILE - 267)) | (1L << (NUMBER - 267)) | (1L << (OFFSET - 267)) | (1L << (ONLINE - 267)) | (1L << (ONLY - 267)) | (1L << (OPTIMISTIC - 267)) | (1L << (OPTIMIZE - 267)) | (1L << (OUT - 267)) | (1L << (OUTPUT - 267)) | (1L << (OWNER - 267)) | (1L << (PARAMETERIZATION - 267)) | (1L << (PARTITION - 267)) | (1L << (PATH - 267)))) != 0) || ((((_la - 331)) & ~0x3f) == 0 && ((1L << (_la - 331)) & ((1L << (PRECEDING - 331)) | (1L << (PRIOR - 331)) | (1L << (PRIVILEGES - 331)) | (1L << (RANGE - 331)) | (1L << (RANK - 331)) | (1L << (READONLY - 331)) | (1L << (READ_ONLY - 331)) | (1L << (RECOMPILE - 331)) | (1L << (RELATIVE - 331)) | (1L << (REMOTE - 331)) | (1L << (REPEATABLE - 331)) | (1L << (ROBUST - 331)) | (1L << (ROOT - 331)) | (1L << (ROW - 331)) | (1L << (ROWGUID - 331)) | (1L << (ROWS - 331)) | (1L << (ROW_NUMBER - 331)) | (1L << (SAMPLE - 331)) | (1L << (SCHEMABINDING - 331)) | (1L << (SCROLL - 331)) | (1L << (SCROLL_LOCKS - 331)) | (1L << (SELF - 331)) | (1L << (SERIALIZABLE - 331)) | (1L << (SIMPLE - 331)) | (1L << (SIZE - 331)) | (1L << (SNAPSHOT - 331)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 331)) | (1L << (STATIC - 331)) | (1L << (STATS_STREAM - 331)) | (1L << (STDEV - 331)) | (1L << (STDEVP - 331)) | (1L << (SUM - 331)) | (1L << (TEXTIMAGE_ON - 331)) | (1L << (THROW - 331)) | (1L << (TIES - 331)) | (1L << (TIME - 331)) | (1L << (TRY - 331)) | (1L << (TYPE - 331)) | (1L << (TYPE_WARNING - 331)) | (1L << (UNBOUNDED - 331)) | (1L << (UNCOMMITTED - 331)) | (1L << (UNKNOWN - 331)) | (1L << (USING - 331)) | (1L << (VAR - 331)) | (1L << (VARP - 331)) | (1L << (VIEWS - 331)) | (1L << (VIEW_METADATA - 331)))) != 0) || ((((_la - 395)) & ~0x3f) == 0 && ((1L << (_la - 395)) & ((1L << (WORK - 395)) | (1L << (XML - 395)) | (1L << (XMLNAMESPACES - 395)) | (1L << (DOUBLE_QUOTE_ID - 395)) | (1L << (SQUARE_BRACKET_ID - 395)) | (1L << (ID - 395)))) != 0)) {
                        {
                            setState(424);
                            tableName();
                            setState(425);
                            match(DOT);
                        }
                    }

                    setState(432);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case STAR: {
                            setState(429);
                            match(STAR);
                        }
                        break;
                        case DOLLAR: {
                            setState(430);
                            match(DOLLAR);
                            setState(431);
                            _la = _input.LA(1);
                            if (!(_la == IDENTITY || _la == ROWGUID)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(434);
                    columnAlias();
                    setState(435);
                    match(EQUAL);
                    setState(436);
                    expression(0);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(438);
                    expression(0);
                    setState(443);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 44, _ctx)) {
                        case 1: {
                            setState(440);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == AS) {
                                {
                                    setState(439);
                                    match(AS);
                                }
                            }

                            setState(442);
                            columnAlias();
                        }
                        break;
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TableSourcesContext extends ParserRuleContext {
        public List<TableSourceContext> tableSource() {
            return getRuleContexts(TableSourceContext.class);
        }

        public TableSourceContext tableSource(int i) {
            return getRuleContext(TableSourceContext.class, i);
        }

        public TableSourcesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableSources;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterTableSources(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitTableSources(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitTableSources(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TableSourcesContext tableSources() throws RecognitionException {
        TableSourcesContext _localctx = new TableSourcesContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_tableSources);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(447);
                tableSource();
                setState(452);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 46, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(448);
                                match(COMMA);
                                setState(449);
                                tableSource();
                            }
                        }
                    }
                    setState(454);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 46, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TableSourceContext extends ParserRuleContext {
        public TableSourceItemJoinedContext tableSourceItemJoined() {
            return getRuleContext(TableSourceItemJoinedContext.class, 0);
        }

        public TableSourceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableSource;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterTableSource(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitTableSource(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitTableSource(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TableSourceContext tableSource() throws RecognitionException {
        TableSourceContext _localctx = new TableSourceContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_tableSource);
        try {
            setState(460);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 47, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(455);
                    tableSourceItemJoined();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(456);
                    match(LR_BRACKET);
                    setState(457);
                    tableSourceItemJoined();
                    setState(458);
                    match(RR_BRACKET);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TableSourceItemJoinedContext extends ParserRuleContext {
        public TableSourceItemContext tableSourceItem() {
            return getRuleContext(TableSourceItemContext.class, 0);
        }

        public List<JoinPartContext> joinPart() {
            return getRuleContexts(JoinPartContext.class);
        }

        public JoinPartContext joinPart(int i) {
            return getRuleContext(JoinPartContext.class, i);
        }

        public TableSourceItemJoinedContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableSourceItemJoined;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener)
                ((SqlGrammarListener) listener).enterTableSourceItemJoined(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitTableSourceItemJoined(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitTableSourceItemJoined(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TableSourceItemJoinedContext tableSourceItemJoined() throws RecognitionException {
        TableSourceItemJoinedContext _localctx = new TableSourceItemJoinedContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_tableSourceItemJoined);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(462);
                tableSourceItem();
                setState(466);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 48, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(463);
                                joinPart();
                            }
                        }
                    }
                    setState(468);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 48, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TableSourceItemContext extends ParserRuleContext {
        public TableNameWith_hintContext tableNameWith_hint() {
            return getRuleContext(TableNameWith_hintContext.class, 0);
        }

        public AsTableAliasContext asTableAlias() {
            return getRuleContext(AsTableAliasContext.class, 0);
        }

        public DerivedTableContext derivedTable() {
            return getRuleContext(DerivedTableContext.class, 0);
        }

        public ColumnAliasListContext columnAliasList() {
            return getRuleContext(ColumnAliasListContext.class, 0);
        }

        public ChangeTableContext changeTable() {
            return getRuleContext(ChangeTableContext.class, 0);
        }

        public FunctionCallContext functionCall() {
            return getRuleContext(FunctionCallContext.class, 0);
        }

        public TerminalNode LOCAL_ID() {
            return getToken(SqlGrammarParser.LOCAL_ID, 0);
        }

        public TableSourceItemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableSourceItem;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterTableSourceItem(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitTableSourceItem(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitTableSourceItem(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TableSourceItemContext tableSourceItem() throws RecognitionException {
        TableSourceItemContext _localctx = new TableSourceItemContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_tableSourceItem);
        try {
            setState(500);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 56, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(469);
                    tableNameWith_hint();
                    setState(471);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 49, _ctx)) {
                        case 1: {
                            setState(470);
                            asTableAlias();
                        }
                        break;
                    }
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(473);
                    derivedTable();
                    setState(478);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 51, _ctx)) {
                        case 1: {
                            setState(474);
                            asTableAlias();
                            setState(476);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 50, _ctx)) {
                                case 1: {
                                    setState(475);
                                    columnAliasList();
                                }
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(480);
                    changeTable();
                    setState(481);
                    asTableAlias();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(483);
                    functionCall();
                    setState(485);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 52, _ctx)) {
                        case 1: {
                            setState(484);
                            asTableAlias();
                        }
                        break;
                    }
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(487);
                    match(LOCAL_ID);
                    setState(489);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 53, _ctx)) {
                        case 1: {
                            setState(488);
                            asTableAlias();
                        }
                        break;
                    }
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(491);
                    match(LOCAL_ID);
                    setState(492);
                    match(DOT);
                    setState(493);
                    functionCall();
                    setState(498);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 55, _ctx)) {
                        case 1: {
                            setState(494);
                            asTableAlias();
                            setState(496);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 54, _ctx)) {
                                case 1: {
                                    setState(495);
                                    columnAliasList();
                                }
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ChangeTableContext extends ParserRuleContext {
        public TerminalNode CHANGETABLE() {
            return getToken(SqlGrammarParser.CHANGETABLE, 0);
        }

        public TerminalNode CHANGES() {
            return getToken(SqlGrammarParser.CHANGES, 0);
        }

        public TableNameContext tableName() {
            return getRuleContext(TableNameContext.class, 0);
        }

        public TerminalNode NULL() {
            return getToken(SqlGrammarParser.NULL, 0);
        }

        public TerminalNode DECIMAL() {
            return getToken(SqlGrammarParser.DECIMAL, 0);
        }

        public TerminalNode LOCAL_ID() {
            return getToken(SqlGrammarParser.LOCAL_ID, 0);
        }

        public ChangeTableContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_changeTable;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterChangeTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitChangeTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitChangeTable(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ChangeTableContext changeTable() throws RecognitionException {
        ChangeTableContext _localctx = new ChangeTableContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_changeTable);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(502);
                match(CHANGETABLE);
                setState(503);
                match(LR_BRACKET);
                setState(504);
                match(CHANGES);
                setState(505);
                tableName();
                setState(506);
                match(COMMA);
                setState(507);
                _la = _input.LA(1);
                if (!(_la == NULL || _la == LOCAL_ID || _la == DECIMAL)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(508);
                match(RR_BRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class JoinPartContext extends ParserRuleContext {
        public Token joinType;
        public Token join_hint;

        public TerminalNode JOIN() {
            return getToken(SqlGrammarParser.JOIN, 0);
        }

        public TableSourceContext tableSource() {
            return getRuleContext(TableSourceContext.class, 0);
        }

        public TerminalNode ON() {
            return getToken(SqlGrammarParser.ON, 0);
        }

        public SearchConditionContext searchCondition() {
            return getRuleContext(SearchConditionContext.class, 0);
        }

        public TerminalNode LEFT() {
            return getToken(SqlGrammarParser.LEFT, 0);
        }

        public TerminalNode RIGHT() {
            return getToken(SqlGrammarParser.RIGHT, 0);
        }

        public TerminalNode FULL() {
            return getToken(SqlGrammarParser.FULL, 0);
        }

        public TerminalNode INNER() {
            return getToken(SqlGrammarParser.INNER, 0);
        }

        public TerminalNode OUTER() {
            return getToken(SqlGrammarParser.OUTER, 0);
        }

        public TerminalNode LOOP() {
            return getToken(SqlGrammarParser.LOOP, 0);
        }

        public TerminalNode HASH() {
            return getToken(SqlGrammarParser.HASH, 0);
        }

        public TerminalNode MERGE() {
            return getToken(SqlGrammarParser.MERGE, 0);
        }

        public TerminalNode REMOTE() {
            return getToken(SqlGrammarParser.REMOTE, 0);
        }

        public TerminalNode CROSS() {
            return getToken(SqlGrammarParser.CROSS, 0);
        }

        public TerminalNode APPLY() {
            return getToken(SqlGrammarParser.APPLY, 0);
        }

        public JoinPartContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_joinPart;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterJoinPart(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitJoinPart(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitJoinPart(this);
            else return visitor.visitChildren(this);
        }
    }

    public final JoinPartContext joinPart() throws RecognitionException {
        JoinPartContext _localctx = new JoinPartContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_joinPart);
        int _la;
        try {
            setState(536);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 61, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(517);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case INNER:
                        case JOIN:
                        case MERGE:
                        case HASH:
                        case LOOP:
                        case REMOTE: {
                            setState(511);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == INNER) {
                                {
                                    setState(510);
                                    match(INNER);
                                }
                            }

                        }
                        break;
                        case FULL:
                        case LEFT:
                        case RIGHT: {
                            setState(513);
                            ((JoinPartContext) _localctx).joinType = _input.LT(1);
                            _la = _input.LA(1);
                            if (!(_la == FULL || _la == LEFT || _la == RIGHT)) {
                                ((JoinPartContext) _localctx).joinType = (Token) _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(515);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == OUTER) {
                                {
                                    setState(514);
                                    match(OUTER);
                                }
                            }

                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(520);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == MERGE || _la == HASH || _la == LOOP || _la == REMOTE) {
                        {
                            setState(519);
                            ((JoinPartContext) _localctx).join_hint = _input.LT(1);
                            _la = _input.LA(1);
                            if (!(_la == MERGE || _la == HASH || _la == LOOP || _la == REMOTE)) {
                                ((JoinPartContext) _localctx).join_hint = (Token) _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                        }
                    }

                    setState(522);
                    match(JOIN);
                    setState(523);
                    tableSource();
                    setState(524);
                    match(ON);
                    setState(525);
                    searchCondition();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(527);
                    match(CROSS);
                    setState(528);
                    match(JOIN);
                    setState(529);
                    tableSource();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(530);
                    match(CROSS);
                    setState(531);
                    match(APPLY);
                    setState(532);
                    tableSource();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(533);
                    match(OUTER);
                    setState(534);
                    match(APPLY);
                    setState(535);
                    tableSource();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TableNameWith_hintContext extends ParserRuleContext {
        public TableNameContext tableName() {
            return getRuleContext(TableNameContext.class, 0);
        }

        public TableNameWith_hintContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableNameWith_hint;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterTableNameWith_hint(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitTableNameWith_hint(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitTableNameWith_hint(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TableNameWith_hintContext tableNameWith_hint() throws RecognitionException {
        TableNameWith_hintContext _localctx = new TableNameWith_hintContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_tableNameWith_hint);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(539);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 62, _ctx)) {
                    case 1: {
                        setState(538);
                        tableName();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DerivedTableContext extends ParserRuleContext {
        public SubqueryContext subquery() {
            return getRuleContext(SubqueryContext.class, 0);
        }

        public DerivedTableContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_derivedTable;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterDerivedTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitDerivedTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitDerivedTable(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DerivedTableContext derivedTable() throws RecognitionException {
        DerivedTableContext _localctx = new DerivedTableContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_derivedTable);
        try {
            setState(546);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 63, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(541);
                    subquery();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(542);
                    match(LR_BRACKET);
                    setState(543);
                    subquery();
                    setState(544);
                    match(RR_BRACKET);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FunctionCallContext extends ParserRuleContext {
        public ExpressionContext style;
        public Token seed;
        public Token increment;

        public AggregateWindowedFunctionContext aggregateWindowedFunction() {
            return getRuleContext(AggregateWindowedFunctionContext.class, 0);
        }

        public ScalarFunctionNameContext scalarFunctionName() {
            return getRuleContext(ScalarFunctionNameContext.class, 0);
        }

        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class, 0);
        }

        public TerminalNode BINARY_CHECKSUM() {
            return getToken(SqlGrammarParser.BINARY_CHECKSUM, 0);
        }

        public TerminalNode CAST() {
            return getToken(SqlGrammarParser.CAST, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode AS() {
            return getToken(SqlGrammarParser.AS, 0);
        }

        public DataTypeContext dataType() {
            return getRuleContext(DataTypeContext.class, 0);
        }

        public TerminalNode CONVERT() {
            return getToken(SqlGrammarParser.CONVERT, 0);
        }

        public TerminalNode CHECKSUM() {
            return getToken(SqlGrammarParser.CHECKSUM, 0);
        }

        public TerminalNode COALESCE() {
            return getToken(SqlGrammarParser.COALESCE, 0);
        }

        public TerminalNode CURRENT_TIMESTAMP() {
            return getToken(SqlGrammarParser.CURRENT_TIMESTAMP, 0);
        }

        public TerminalNode CURRENT_USER() {
            return getToken(SqlGrammarParser.CURRENT_USER, 0);
        }

        public TerminalNode DATEADD() {
            return getToken(SqlGrammarParser.DATEADD, 0);
        }

        public TerminalNode ID() {
            return getToken(SqlGrammarParser.ID, 0);
        }

        public TerminalNode DATEDIFF() {
            return getToken(SqlGrammarParser.DATEDIFF, 0);
        }

        public TerminalNode DATENAME() {
            return getToken(SqlGrammarParser.DATENAME, 0);
        }

        public TerminalNode DATEPART() {
            return getToken(SqlGrammarParser.DATEPART, 0);
        }

        public TerminalNode IDENTITY() {
            return getToken(SqlGrammarParser.IDENTITY, 0);
        }

        public List<TerminalNode> DECIMAL() {
            return getTokens(SqlGrammarParser.DECIMAL);
        }

        public TerminalNode DECIMAL(int i) {
            return getToken(SqlGrammarParser.DECIMAL, i);
        }

        public TerminalNode MIN_ACTIVE_ROWVERSION() {
            return getToken(SqlGrammarParser.MIN_ACTIVE_ROWVERSION, 0);
        }

        public TerminalNode NULLIF() {
            return getToken(SqlGrammarParser.NULLIF, 0);
        }

        public TerminalNode SESSION_USER() {
            return getToken(SqlGrammarParser.SESSION_USER, 0);
        }

        public TerminalNode SYSTEM_USER() {
            return getToken(SqlGrammarParser.SYSTEM_USER, 0);
        }

        public FunctionCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FunctionCallContext functionCall() throws RecognitionException {
        FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_functionCall);
        int _la;
        try {
            setState(644);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 68, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(548);
                    aggregateWindowedFunction();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(549);
                    scalarFunctionName();
                    setState(550);
                    match(LR_BRACKET);
                    setState(552);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALLED) | (1L << CASE) | (1L << COALESCE) | (1L << CONVERT) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DEFAULT))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (FORCESEEK - 72)) | (1L << (IDENTITY - 72)) | (1L << (LEFT - 72)) | (1L << (NULL - 72)) | (1L << (NULLIF - 72)) | (1L << (PUBLIC - 72)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (RETURN - 142)) | (1L << (RETURNS - 142)) | (1L << (RIGHT - 142)) | (1L << (SESSION_USER - 142)) | (1L << (SYSTEM_USER - 142)) | (1L << (ABSOLUTE - 142)) | (1L << (APPLY - 142)) | (1L << (AUTO - 142)))) != 0) || ((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (AVG - 211)) | (1L << (BASE64 - 211)) | (1L << (BINARY_CHECKSUM - 211)) | (1L << (CALLER - 211)) | (1L << (CAST - 211)) | (1L << (CATCH - 211)) | (1L << (CHECKSUM - 211)) | (1L << (CHECKSUM_AGG - 211)) | (1L << (COMMITTED - 211)) | (1L << (CONCAT - 211)) | (1L << (CONTROL - 211)) | (1L << (COOKIE - 211)) | (1L << (COUNT - 211)) | (1L << (COUNT_BIG - 211)) | (1L << (DATEADD - 211)) | (1L << (DATEDIFF - 211)) | (1L << (DATENAME - 211)) | (1L << (DATEPART - 211)) | (1L << (DELAY - 211)) | (1L << (DELETED - 211)) | (1L << (DENSE_RANK - 211)) | (1L << (DISABLE - 211)) | (1L << (DYNAMIC - 211)) | (1L << (ENCRYPTION - 211)) | (1L << (EXPAND - 211)) | (1L << (FAST - 211)) | (1L << (FAST_FORWARD - 211)) | (1L << (FIRST - 211)) | (1L << (FOLLOWING - 211)) | (1L << (FORCE - 211)) | (1L << (FORCED - 211)) | (1L << (FORWARD_ONLY - 211)) | (1L << (FULLSCAN - 211)) | (1L << (GLOBAL - 211)) | (1L << (GO - 211)) | (1L << (GROUPING - 211)) | (1L << (GROUPING_ID - 211)) | (1L << (HASH - 211)))) != 0) || ((((_la - 275)) & ~0x3f) == 0 && ((1L << (_la - 275)) & ((1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 275)) | (1L << (IMPERSONATE - 275)) | (1L << (INPUT - 275)) | (1L << (INSENSITIVE - 275)) | (1L << (INSERTED - 275)) | (1L << (ISOLATION - 275)) | (1L << (KEEP - 275)) | (1L << (KEEPFIXED - 275)) | (1L << (KEYSET - 275)) | (1L << (LAST - 275)) | (1L << (LEVEL - 275)) | (1L << (LOCAL - 275)) | (1L << (LOCK_ESCALATION - 275)) | (1L << (LOGIN - 275)) | (1L << (LOOP - 275)) | (1L << (MARK - 275)) | (1L << (MAX - 275)) | (1L << (MAXDOP - 275)) | (1L << (MAXRECURSION - 275)) | (1L << (MIN - 275)) | (1L << (MIN_ACTIVE_ROWVERSION - 275)) | (1L << (MODIFY - 275)) | (1L << (NAME - 275)) | (1L << (NEXT - 275)) | (1L << (NOCOUNT - 275)) | (1L << (NOEXPAND - 275)) | (1L << (NORECOMPUTE - 275)) | (1L << (NTILE - 275)) | (1L << (NUMBER - 275)) | (1L << (OFFSET - 275)) | (1L << (ONLINE - 275)) | (1L << (ONLY - 275)) | (1L << (OPTIMISTIC - 275)) | (1L << (OPTIMIZE - 275)) | (1L << (OUT - 275)) | (1L << (OUTPUT - 275)) | (1L << (OWNER - 275)) | (1L << (PARAMETERIZATION - 275)) | (1L << (PARTITION - 275)) | (1L << (PATH - 275)) | (1L << (PRECEDING - 275)) | (1L << (PRIOR - 275)) | (1L << (PRIVILEGES - 275)) | (1L << (RANGE - 275)) | (1L << (RANK - 275)) | (1L << (READONLY - 275)))) != 0) || ((((_la - 339)) & ~0x3f) == 0 && ((1L << (_la - 339)) & ((1L << (READ_ONLY - 339)) | (1L << (RECOMPILE - 339)) | (1L << (RELATIVE - 339)) | (1L << (REMOTE - 339)) | (1L << (REPEATABLE - 339)) | (1L << (ROBUST - 339)) | (1L << (ROOT - 339)) | (1L << (ROW - 339)) | (1L << (ROWGUID - 339)) | (1L << (ROWS - 339)) | (1L << (ROW_NUMBER - 339)) | (1L << (SAMPLE - 339)) | (1L << (SCHEMABINDING - 339)) | (1L << (SCROLL - 339)) | (1L << (SCROLL_LOCKS - 339)) | (1L << (SELF - 339)) | (1L << (SERIALIZABLE - 339)) | (1L << (SIMPLE - 339)) | (1L << (SIZE - 339)) | (1L << (SNAPSHOT - 339)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 339)) | (1L << (STATIC - 339)) | (1L << (STATS_STREAM - 339)) | (1L << (STDEV - 339)) | (1L << (STDEVP - 339)) | (1L << (SUM - 339)) | (1L << (TEXTIMAGE_ON - 339)) | (1L << (THROW - 339)) | (1L << (TIES - 339)) | (1L << (TIME - 339)) | (1L << (TRY - 339)) | (1L << (TYPE - 339)) | (1L << (TYPE_WARNING - 339)) | (1L << (UNBOUNDED - 339)) | (1L << (UNCOMMITTED - 339)) | (1L << (UNKNOWN - 339)) | (1L << (USING - 339)) | (1L << (VAR - 339)) | (1L << (VARP - 339)) | (1L << (VIEWS - 339)) | (1L << (VIEW_METADATA - 339)) | (1L << (WORK - 339)) | (1L << (XML - 339)) | (1L << (XMLNAMESPACES - 339)) | (1L << (DOUBLE_QUOTE_ID - 339)))) != 0) || ((((_la - 403)) & ~0x3f) == 0 && ((1L << (_la - 403)) & ((1L << (SQUARE_BRACKET_ID - 403)) | (1L << (LOCAL_ID - 403)) | (1L << (DECIMAL - 403)) | (1L << (ID - 403)) | (1L << (STRING - 403)) | (1L << (BINARY - 403)) | (1L << (FLOAT - 403)) | (1L << (REAL - 403)) | (1L << (DOLLAR - 403)) | (1L << (LR_BRACKET - 403)) | (1L << (PLUS - 403)) | (1L << (MINUS - 403)) | (1L << (BIT_NOT - 403)))) != 0)) {
                        {
                            setState(551);
                            expressionList();
                        }
                    }

                    setState(554);
                    match(RR_BRACKET);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(556);
                    match(BINARY_CHECKSUM);
                    setState(557);
                    match(LR_BRACKET);
                    setState(558);
                    match(STAR);
                    setState(559);
                    match(RR_BRACKET);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(560);
                    match(CAST);
                    setState(561);
                    match(LR_BRACKET);
                    setState(562);
                    expression(0);
                    setState(563);
                    match(AS);
                    setState(564);
                    dataType();
                    setState(565);
                    match(RR_BRACKET);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(567);
                    match(CONVERT);
                    setState(568);
                    match(LR_BRACKET);
                    setState(569);
                    dataType();
                    setState(570);
                    match(COMMA);
                    setState(571);
                    expression(0);
                    setState(574);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == COMMA) {
                        {
                            setState(572);
                            match(COMMA);
                            setState(573);
                            ((FunctionCallContext) _localctx).style = expression(0);
                        }
                    }

                    setState(576);
                    match(RR_BRACKET);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(578);
                    match(CHECKSUM);
                    setState(579);
                    match(LR_BRACKET);
                    setState(580);
                    match(STAR);
                    setState(581);
                    match(RR_BRACKET);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(582);
                    match(COALESCE);
                    setState(583);
                    match(LR_BRACKET);
                    setState(584);
                    expressionList();
                    setState(585);
                    match(RR_BRACKET);
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(587);
                    match(CURRENT_TIMESTAMP);
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(588);
                    match(CURRENT_USER);
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(589);
                    match(DATEADD);
                    setState(590);
                    match(LR_BRACKET);
                    setState(591);
                    match(ID);
                    setState(592);
                    match(COMMA);
                    setState(593);
                    expression(0);
                    setState(594);
                    match(COMMA);
                    setState(595);
                    expression(0);
                    setState(596);
                    match(RR_BRACKET);
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(598);
                    match(DATEDIFF);
                    setState(599);
                    match(LR_BRACKET);
                    setState(600);
                    match(ID);
                    setState(601);
                    match(COMMA);
                    setState(602);
                    expression(0);
                    setState(603);
                    match(COMMA);
                    setState(604);
                    expression(0);
                    setState(605);
                    match(RR_BRACKET);
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(607);
                    match(DATENAME);
                    setState(608);
                    match(LR_BRACKET);
                    setState(609);
                    match(ID);
                    setState(610);
                    match(COMMA);
                    setState(611);
                    expression(0);
                    setState(612);
                    match(RR_BRACKET);
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(614);
                    match(DATEPART);
                    setState(615);
                    match(LR_BRACKET);
                    setState(616);
                    match(ID);
                    setState(617);
                    match(COMMA);
                    setState(618);
                    expression(0);
                    setState(619);
                    match(RR_BRACKET);
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(621);
                    match(IDENTITY);
                    setState(622);
                    match(LR_BRACKET);
                    setState(623);
                    dataType();
                    setState(626);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 66, _ctx)) {
                        case 1: {
                            setState(624);
                            match(COMMA);
                            setState(625);
                            ((FunctionCallContext) _localctx).seed = match(DECIMAL);
                        }
                        break;
                    }
                    setState(630);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == COMMA) {
                        {
                            setState(628);
                            match(COMMA);
                            setState(629);
                            ((FunctionCallContext) _localctx).increment = match(DECIMAL);
                        }
                    }

                    setState(632);
                    match(RR_BRACKET);
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(634);
                    match(MIN_ACTIVE_ROWVERSION);
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(635);
                    match(NULLIF);
                    setState(636);
                    match(LR_BRACKET);
                    setState(637);
                    expression(0);
                    setState(638);
                    match(COMMA);
                    setState(639);
                    expression(0);
                    setState(640);
                    match(RR_BRACKET);
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(642);
                    match(SESSION_USER);
                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(643);
                    match(SYSTEM_USER);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SwitchSectionContext extends ParserRuleContext {
        public TerminalNode WHEN() {
            return getToken(SqlGrammarParser.WHEN, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode THEN() {
            return getToken(SqlGrammarParser.THEN, 0);
        }

        public SwitchSectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_switchSection;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterSwitchSection(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitSwitchSection(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitSwitchSection(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SwitchSectionContext switchSection() throws RecognitionException {
        SwitchSectionContext _localctx = new SwitchSectionContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_switchSection);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(646);
                match(WHEN);
                setState(647);
                expression(0);
                setState(648);
                match(THEN);
                setState(649);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SwitchSearchConditionSectionContext extends ParserRuleContext {
        public TerminalNode WHEN() {
            return getToken(SqlGrammarParser.WHEN, 0);
        }

        public SearchConditionContext searchCondition() {
            return getRuleContext(SearchConditionContext.class, 0);
        }

        public TerminalNode THEN() {
            return getToken(SqlGrammarParser.THEN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public SwitchSearchConditionSectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_switchSearchConditionSection;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener)
                ((SqlGrammarListener) listener).enterSwitchSearchConditionSection(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener)
                ((SqlGrammarListener) listener).exitSwitchSearchConditionSection(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitSwitchSearchConditionSection(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SwitchSearchConditionSectionContext switchSearchConditionSection() throws RecognitionException {
        SwitchSearchConditionSectionContext _localctx = new SwitchSearchConditionSectionContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_switchSearchConditionSection);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(651);
                match(WHEN);
                setState(652);
                searchCondition();
                setState(653);
                match(THEN);
                setState(654);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AsTableAliasContext extends ParserRuleContext {
        public TableAliasContext tableAlias() {
            return getRuleContext(TableAliasContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SqlGrammarParser.AS, 0);
        }

        public AsTableAliasContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_asTableAlias;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterAsTableAlias(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitAsTableAlias(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitAsTableAlias(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AsTableAliasContext asTableAlias() throws RecognitionException {
        AsTableAliasContext _localctx = new AsTableAliasContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_asTableAlias);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(657);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 69, _ctx)) {
                    case 1: {
                        setState(656);
                        match(AS);
                    }
                    break;
                }
                setState(659);
                tableAlias();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TableAliasContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public TableAliasContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableAlias;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterTableAlias(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitTableAlias(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitTableAlias(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TableAliasContext tableAlias() throws RecognitionException {
        TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_tableAlias);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(662);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 70, _ctx)) {
                    case 1: {
                        setState(661);
                        id();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ColumnAliasListContext extends ParserRuleContext {
        public List<ColumnAliasContext> columnAlias() {
            return getRuleContexts(ColumnAliasContext.class);
        }

        public ColumnAliasContext columnAlias(int i) {
            return getRuleContext(ColumnAliasContext.class, i);
        }

        public ColumnAliasListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_columnAliasList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterColumnAliasList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitColumnAliasList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitColumnAliasList(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ColumnAliasListContext columnAliasList() throws RecognitionException {
        ColumnAliasListContext _localctx = new ColumnAliasListContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_columnAliasList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(664);
                match(LR_BRACKET);
                setState(665);
                columnAlias();
                setState(670);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(666);
                            match(COMMA);
                            setState(667);
                            columnAlias();
                        }
                    }
                    setState(672);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(673);
                match(RR_BRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ColumnAliasContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlGrammarParser.STRING, 0);
        }

        public ColumnAliasContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_columnAlias;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterColumnAlias(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitColumnAlias(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitColumnAlias(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ColumnAliasContext columnAlias() throws RecognitionException {
        ColumnAliasContext _localctx = new ColumnAliasContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_columnAlias);
        try {
            setState(677);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case CALLED:
                case FORCESEEK:
                case PUBLIC:
                case RETURN:
                case RETURNS:
                case ABSOLUTE:
                case APPLY:
                case AUTO:
                case AVG:
                case BASE64:
                case CALLER:
                case CAST:
                case CATCH:
                case CHECKSUM_AGG:
                case COMMITTED:
                case CONCAT:
                case CONTROL:
                case COOKIE:
                case COUNT:
                case COUNT_BIG:
                case DELAY:
                case DELETED:
                case DENSE_RANK:
                case DISABLE:
                case DYNAMIC:
                case ENCRYPTION:
                case EXPAND:
                case FAST:
                case FAST_FORWARD:
                case FIRST:
                case FOLLOWING:
                case FORCE:
                case FORCED:
                case FORWARD_ONLY:
                case FULLSCAN:
                case GLOBAL:
                case GO:
                case GROUPING:
                case GROUPING_ID:
                case HASH:
                case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
                case IMPERSONATE:
                case INPUT:
                case INSENSITIVE:
                case INSERTED:
                case ISOLATION:
                case KEEP:
                case KEEPFIXED:
                case KEYSET:
                case LAST:
                case LEVEL:
                case LOCAL:
                case LOCK_ESCALATION:
                case LOGIN:
                case LOOP:
                case MARK:
                case MAX:
                case MAXDOP:
                case MAXRECURSION:
                case MIN:
                case MODIFY:
                case NAME:
                case NEXT:
                case NOCOUNT:
                case NOEXPAND:
                case NORECOMPUTE:
                case NTILE:
                case NUMBER:
                case OFFSET:
                case ONLINE:
                case ONLY:
                case OPTIMISTIC:
                case OPTIMIZE:
                case OUT:
                case OUTPUT:
                case OWNER:
                case PARAMETERIZATION:
                case PARTITION:
                case PATH:
                case PRECEDING:
                case PRIOR:
                case PRIVILEGES:
                case RANGE:
                case RANK:
                case READONLY:
                case READ_ONLY:
                case RECOMPILE:
                case RELATIVE:
                case REMOTE:
                case REPEATABLE:
                case ROBUST:
                case ROOT:
                case ROW:
                case ROWGUID:
                case ROWS:
                case ROW_NUMBER:
                case SAMPLE:
                case SCHEMABINDING:
                case SCROLL:
                case SCROLL_LOCKS:
                case SELF:
                case SERIALIZABLE:
                case SIMPLE:
                case SIZE:
                case SNAPSHOT:
                case SPATIAL_WINDOW_MAX_CELLS:
                case STATIC:
                case STATS_STREAM:
                case STDEV:
                case STDEVP:
                case SUM:
                case TEXTIMAGE_ON:
                case THROW:
                case TIES:
                case TIME:
                case TRY:
                case TYPE:
                case TYPE_WARNING:
                case UNBOUNDED:
                case UNCOMMITTED:
                case UNKNOWN:
                case USING:
                case VAR:
                case VARP:
                case VIEWS:
                case VIEW_METADATA:
                case WORK:
                case XML:
                case XMLNAMESPACES:
                case DOUBLE_QUOTE_ID:
                case SQUARE_BRACKET_ID:
                case ID:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(675);
                    id();
                }
                break;
                case STRING:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(676);
                    match(STRING);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpressionListContext extends ParserRuleContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public ExpressionListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expressionList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterExpressionList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitExpressionList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitExpressionList(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExpressionListContext expressionList() throws RecognitionException {
        ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_expressionList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(679);
                expression(0);
                setState(684);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(680);
                            match(COMMA);
                            setState(681);
                            expression(0);
                        }
                    }
                    setState(686);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AggregateWindowedFunctionContext extends ParserRuleContext {
        public AllDistinctExpressionContext allDistinctExpression() {
            return getRuleContext(AllDistinctExpressionContext.class, 0);
        }

        public TerminalNode AVG() {
            return getToken(SqlGrammarParser.AVG, 0);
        }

        public TerminalNode MAX() {
            return getToken(SqlGrammarParser.MAX, 0);
        }

        public TerminalNode MIN() {
            return getToken(SqlGrammarParser.MIN, 0);
        }

        public TerminalNode SUM() {
            return getToken(SqlGrammarParser.SUM, 0);
        }

        public TerminalNode STDEV() {
            return getToken(SqlGrammarParser.STDEV, 0);
        }

        public TerminalNode STDEVP() {
            return getToken(SqlGrammarParser.STDEVP, 0);
        }

        public TerminalNode VAR() {
            return getToken(SqlGrammarParser.VAR, 0);
        }

        public TerminalNode VARP() {
            return getToken(SqlGrammarParser.VARP, 0);
        }

        public TerminalNode COUNT() {
            return getToken(SqlGrammarParser.COUNT, 0);
        }

        public TerminalNode COUNT_BIG() {
            return getToken(SqlGrammarParser.COUNT_BIG, 0);
        }

        public TerminalNode CHECKSUM_AGG() {
            return getToken(SqlGrammarParser.CHECKSUM_AGG, 0);
        }

        public TerminalNode GROUPING() {
            return getToken(SqlGrammarParser.GROUPING, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode GROUPING_ID() {
            return getToken(SqlGrammarParser.GROUPING_ID, 0);
        }

        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class, 0);
        }

        public AggregateWindowedFunctionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_aggregateWindowedFunction;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener)
                ((SqlGrammarListener) listener).enterAggregateWindowedFunction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener)
                ((SqlGrammarListener) listener).exitAggregateWindowedFunction(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitAggregateWindowedFunction(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AggregateWindowedFunctionContext aggregateWindowedFunction() throws RecognitionException {
        AggregateWindowedFunctionContext _localctx = new AggregateWindowedFunctionContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_aggregateWindowedFunction);
        int _la;
        try {
            setState(714);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case AVG:
                case MAX:
                case MIN:
                case STDEV:
                case STDEVP:
                case SUM:
                case VAR:
                case VARP:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(687);
                    _la = _input.LA(1);
                    if (!(_la == AVG || _la == MAX || _la == MIN || ((((_la - 369)) & ~0x3f) == 0 && ((1L << (_la - 369)) & ((1L << (STDEV - 369)) | (1L << (STDEVP - 369)) | (1L << (SUM - 369)) | (1L << (VAR - 369)) | (1L << (VARP - 369)))) != 0))) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(688);
                    match(LR_BRACKET);
                    setState(689);
                    allDistinctExpression();
                    setState(690);
                    match(RR_BRACKET);
                }
                break;
                case COUNT:
                case COUNT_BIG:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(692);
                    _la = _input.LA(1);
                    if (!(_la == COUNT || _la == COUNT_BIG)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(693);
                    match(LR_BRACKET);
                    setState(696);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case STAR: {
                            setState(694);
                            match(STAR);
                        }
                        break;
                        case ALL:
                        case CALLED:
                        case CASE:
                        case COALESCE:
                        case CONVERT:
                        case CURRENT_TIMESTAMP:
                        case CURRENT_USER:
                        case DEFAULT:
                        case DISTINCT:
                        case FORCESEEK:
                        case IDENTITY:
                        case LEFT:
                        case NULL:
                        case NULLIF:
                        case PUBLIC:
                        case RETURN:
                        case RETURNS:
                        case RIGHT:
                        case SESSION_USER:
                        case SYSTEM_USER:
                        case ABSOLUTE:
                        case APPLY:
                        case AUTO:
                        case AVG:
                        case BASE64:
                        case BINARY_CHECKSUM:
                        case CALLER:
                        case CAST:
                        case CATCH:
                        case CHECKSUM:
                        case CHECKSUM_AGG:
                        case COMMITTED:
                        case CONCAT:
                        case CONTROL:
                        case COOKIE:
                        case COUNT:
                        case COUNT_BIG:
                        case DATEADD:
                        case DATEDIFF:
                        case DATENAME:
                        case DATEPART:
                        case DELAY:
                        case DELETED:
                        case DENSE_RANK:
                        case DISABLE:
                        case DYNAMIC:
                        case ENCRYPTION:
                        case EXPAND:
                        case FAST:
                        case FAST_FORWARD:
                        case FIRST:
                        case FOLLOWING:
                        case FORCE:
                        case FORCED:
                        case FORWARD_ONLY:
                        case FULLSCAN:
                        case GLOBAL:
                        case GO:
                        case GROUPING:
                        case GROUPING_ID:
                        case HASH:
                        case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
                        case IMPERSONATE:
                        case INPUT:
                        case INSENSITIVE:
                        case INSERTED:
                        case ISOLATION:
                        case KEEP:
                        case KEEPFIXED:
                        case KEYSET:
                        case LAST:
                        case LEVEL:
                        case LOCAL:
                        case LOCK_ESCALATION:
                        case LOGIN:
                        case LOOP:
                        case MARK:
                        case MAX:
                        case MAXDOP:
                        case MAXRECURSION:
                        case MIN:
                        case MIN_ACTIVE_ROWVERSION:
                        case MODIFY:
                        case NAME:
                        case NEXT:
                        case NOCOUNT:
                        case NOEXPAND:
                        case NORECOMPUTE:
                        case NTILE:
                        case NUMBER:
                        case OFFSET:
                        case ONLINE:
                        case ONLY:
                        case OPTIMISTIC:
                        case OPTIMIZE:
                        case OUT:
                        case OUTPUT:
                        case OWNER:
                        case PARAMETERIZATION:
                        case PARTITION:
                        case PATH:
                        case PRECEDING:
                        case PRIOR:
                        case PRIVILEGES:
                        case RANGE:
                        case RANK:
                        case READONLY:
                        case READ_ONLY:
                        case RECOMPILE:
                        case RELATIVE:
                        case REMOTE:
                        case REPEATABLE:
                        case ROBUST:
                        case ROOT:
                        case ROW:
                        case ROWGUID:
                        case ROWS:
                        case ROW_NUMBER:
                        case SAMPLE:
                        case SCHEMABINDING:
                        case SCROLL:
                        case SCROLL_LOCKS:
                        case SELF:
                        case SERIALIZABLE:
                        case SIMPLE:
                        case SIZE:
                        case SNAPSHOT:
                        case SPATIAL_WINDOW_MAX_CELLS:
                        case STATIC:
                        case STATS_STREAM:
                        case STDEV:
                        case STDEVP:
                        case SUM:
                        case TEXTIMAGE_ON:
                        case THROW:
                        case TIES:
                        case TIME:
                        case TRY:
                        case TYPE:
                        case TYPE_WARNING:
                        case UNBOUNDED:
                        case UNCOMMITTED:
                        case UNKNOWN:
                        case USING:
                        case VAR:
                        case VARP:
                        case VIEWS:
                        case VIEW_METADATA:
                        case WORK:
                        case XML:
                        case XMLNAMESPACES:
                        case DOUBLE_QUOTE_ID:
                        case SQUARE_BRACKET_ID:
                        case LOCAL_ID:
                        case DECIMAL:
                        case ID:
                        case STRING:
                        case BINARY:
                        case FLOAT:
                        case REAL:
                        case DOLLAR:
                        case LR_BRACKET:
                        case PLUS:
                        case MINUS:
                        case BIT_NOT: {
                            setState(695);
                            allDistinctExpression();
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(698);
                    match(RR_BRACKET);
                }
                break;
                case CHECKSUM_AGG:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(699);
                    match(CHECKSUM_AGG);
                    setState(700);
                    match(LR_BRACKET);
                    setState(701);
                    allDistinctExpression();
                    setState(702);
                    match(RR_BRACKET);
                }
                break;
                case GROUPING:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(704);
                    match(GROUPING);
                    setState(705);
                    match(LR_BRACKET);
                    setState(706);
                    expression(0);
                    setState(707);
                    match(RR_BRACKET);
                }
                break;
                case GROUPING_ID:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(709);
                    match(GROUPING_ID);
                    setState(710);
                    match(LR_BRACKET);
                    setState(711);
                    expressionList();
                    setState(712);
                    match(RR_BRACKET);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AllDistinctExpressionContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode ALL() {
            return getToken(SqlGrammarParser.ALL, 0);
        }

        public TerminalNode DISTINCT() {
            return getToken(SqlGrammarParser.DISTINCT, 0);
        }

        public AllDistinctExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_allDistinctExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener)
                ((SqlGrammarListener) listener).enterAllDistinctExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitAllDistinctExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitAllDistinctExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AllDistinctExpressionContext allDistinctExpression() throws RecognitionException {
        AllDistinctExpressionContext _localctx = new AllDistinctExpressionContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_allDistinctExpression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(717);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ALL || _la == DISTINCT) {
                    {
                        setState(716);
                        _la = _input.LA(1);
                        if (!(_la == ALL || _la == DISTINCT)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }

                setState(719);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TableNameContext extends ParserRuleContext {
        public IdContext table;

        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public TableNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterTableName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitTableName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitTableName(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TableNameContext tableName() throws RecognitionException {
        TableNameContext _localctx = new TableNameContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_tableName);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(721);
                ((TableNameContext) _localctx).table = id();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FuncProcNameContext extends ParserRuleContext {
        public IdContext database;
        public IdContext schema;
        public IdContext procedure;

        public List<IdContext> id() {
            return getRuleContexts(IdContext.class);
        }

        public IdContext id(int i) {
            return getRuleContext(IdContext.class, i);
        }

        public FuncProcNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_funcProcName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterFuncProcName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitFuncProcName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitFuncProcName(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FuncProcNameContext funcProcName() throws RecognitionException {
        FuncProcNameContext _localctx = new FuncProcNameContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_funcProcName);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(733);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 78, _ctx)) {
                    case 1: {
                        setState(723);
                        ((FuncProcNameContext) _localctx).database = id();
                        setState(724);
                        match(DOT);
                        setState(726);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == CALLED || _la == FORCESEEK || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (PUBLIC - 133)) | (1L << (RETURN - 133)) | (1L << (RETURNS - 133)) | (1L << (ABSOLUTE - 133)))) != 0) || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (APPLY - 202)) | (1L << (AUTO - 202)) | (1L << (AVG - 202)) | (1L << (BASE64 - 202)) | (1L << (CALLER - 202)) | (1L << (CAST - 202)) | (1L << (CATCH - 202)) | (1L << (CHECKSUM_AGG - 202)) | (1L << (COMMITTED - 202)) | (1L << (CONCAT - 202)) | (1L << (CONTROL - 202)) | (1L << (COOKIE - 202)) | (1L << (COUNT - 202)) | (1L << (COUNT_BIG - 202)) | (1L << (DELAY - 202)) | (1L << (DELETED - 202)) | (1L << (DENSE_RANK - 202)) | (1L << (DISABLE - 202)) | (1L << (DYNAMIC - 202)) | (1L << (ENCRYPTION - 202)) | (1L << (EXPAND - 202)) | (1L << (FAST - 202)) | (1L << (FAST_FORWARD - 202)) | (1L << (FIRST - 202)) | (1L << (FOLLOWING - 202)) | (1L << (FORCE - 202)) | (1L << (FORCED - 202)) | (1L << (FORWARD_ONLY - 202)) | (1L << (FULLSCAN - 202)))) != 0) || ((((_la - 267)) & ~0x3f) == 0 && ((1L << (_la - 267)) & ((1L << (GLOBAL - 267)) | (1L << (GO - 267)) | (1L << (GROUPING - 267)) | (1L << (GROUPING_ID - 267)) | (1L << (HASH - 267)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 267)) | (1L << (IMPERSONATE - 267)) | (1L << (INPUT - 267)) | (1L << (INSENSITIVE - 267)) | (1L << (INSERTED - 267)) | (1L << (ISOLATION - 267)) | (1L << (KEEP - 267)) | (1L << (KEEPFIXED - 267)) | (1L << (KEYSET - 267)) | (1L << (LAST - 267)) | (1L << (LEVEL - 267)) | (1L << (LOCAL - 267)) | (1L << (LOCK_ESCALATION - 267)) | (1L << (LOGIN - 267)) | (1L << (LOOP - 267)) | (1L << (MARK - 267)) | (1L << (MAX - 267)) | (1L << (MAXDOP - 267)) | (1L << (MAXRECURSION - 267)) | (1L << (MIN - 267)) | (1L << (MODIFY - 267)) | (1L << (NAME - 267)) | (1L << (NEXT - 267)) | (1L << (NOCOUNT - 267)) | (1L << (NOEXPAND - 267)) | (1L << (NORECOMPUTE - 267)) | (1L << (NTILE - 267)) | (1L << (NUMBER - 267)) | (1L << (OFFSET - 267)) | (1L << (ONLINE - 267)) | (1L << (ONLY - 267)) | (1L << (OPTIMISTIC - 267)) | (1L << (OPTIMIZE - 267)) | (1L << (OUT - 267)) | (1L << (OUTPUT - 267)) | (1L << (OWNER - 267)) | (1L << (PARAMETERIZATION - 267)) | (1L << (PARTITION - 267)) | (1L << (PATH - 267)))) != 0) || ((((_la - 331)) & ~0x3f) == 0 && ((1L << (_la - 331)) & ((1L << (PRECEDING - 331)) | (1L << (PRIOR - 331)) | (1L << (PRIVILEGES - 331)) | (1L << (RANGE - 331)) | (1L << (RANK - 331)) | (1L << (READONLY - 331)) | (1L << (READ_ONLY - 331)) | (1L << (RECOMPILE - 331)) | (1L << (RELATIVE - 331)) | (1L << (REMOTE - 331)) | (1L << (REPEATABLE - 331)) | (1L << (ROBUST - 331)) | (1L << (ROOT - 331)) | (1L << (ROW - 331)) | (1L << (ROWGUID - 331)) | (1L << (ROWS - 331)) | (1L << (ROW_NUMBER - 331)) | (1L << (SAMPLE - 331)) | (1L << (SCHEMABINDING - 331)) | (1L << (SCROLL - 331)) | (1L << (SCROLL_LOCKS - 331)) | (1L << (SELF - 331)) | (1L << (SERIALIZABLE - 331)) | (1L << (SIMPLE - 331)) | (1L << (SIZE - 331)) | (1L << (SNAPSHOT - 331)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 331)) | (1L << (STATIC - 331)) | (1L << (STATS_STREAM - 331)) | (1L << (STDEV - 331)) | (1L << (STDEVP - 331)) | (1L << (SUM - 331)) | (1L << (TEXTIMAGE_ON - 331)) | (1L << (THROW - 331)) | (1L << (TIES - 331)) | (1L << (TIME - 331)) | (1L << (TRY - 331)) | (1L << (TYPE - 331)) | (1L << (TYPE_WARNING - 331)) | (1L << (UNBOUNDED - 331)) | (1L << (UNCOMMITTED - 331)) | (1L << (UNKNOWN - 331)) | (1L << (USING - 331)) | (1L << (VAR - 331)) | (1L << (VARP - 331)) | (1L << (VIEWS - 331)) | (1L << (VIEW_METADATA - 331)))) != 0) || ((((_la - 395)) & ~0x3f) == 0 && ((1L << (_la - 395)) & ((1L << (WORK - 395)) | (1L << (XML - 395)) | (1L << (XMLNAMESPACES - 395)) | (1L << (DOUBLE_QUOTE_ID - 395)) | (1L << (SQUARE_BRACKET_ID - 395)) | (1L << (ID - 395)))) != 0)) {
                            {
                                setState(725);
                                ((FuncProcNameContext) _localctx).schema = id();
                            }
                        }

                        setState(728);
                        match(DOT);
                    }
                    break;
                    case 2: {
                        {
                            setState(730);
                            ((FuncProcNameContext) _localctx).schema = id();
                        }
                        setState(731);
                        match(DOT);
                    }
                    break;
                }
                setState(735);
                ((FuncProcNameContext) _localctx).procedure = id();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FullColumnNameContext extends ParserRuleContext {
        public ComplexIdContext complexId() {
            return getRuleContext(ComplexIdContext.class, 0);
        }

        public TableNameContext tableName() {
            return getRuleContext(TableNameContext.class, 0);
        }

        public FullColumnNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fullColumnName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterFullColumnName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitFullColumnName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitFullColumnName(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FullColumnNameContext fullColumnName() throws RecognitionException {
        FullColumnNameContext _localctx = new FullColumnNameContext(_ctx, getState());
        enterRule(_localctx, 82, RULE_fullColumnName);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(740);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 79, _ctx)) {
                    case 1: {
                        setState(737);
                        tableName();
                        setState(738);
                        match(DOT);
                    }
                    break;
                }
                setState(742);
                complexId();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class NullNotnullContext extends ParserRuleContext {
        public TerminalNode NULL() {
            return getToken(SqlGrammarParser.NULL, 0);
        }

        public TerminalNode NOT() {
            return getToken(SqlGrammarParser.NOT, 0);
        }

        public NullNotnullContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_nullNotnull;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterNullNotnull(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitNullNotnull(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitNullNotnull(this);
            else return visitor.visitChildren(this);
        }
    }

    public final NullNotnullContext nullNotnull() throws RecognitionException {
        NullNotnullContext _localctx = new NullNotnullContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_nullNotnull);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(745);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == NOT) {
                    {
                        setState(744);
                        match(NOT);
                    }
                }

                setState(747);
                match(NULL);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ScalarFunctionNameContext extends ParserRuleContext {
        public FuncProcNameContext funcProcName() {
            return getRuleContext(FuncProcNameContext.class, 0);
        }

        public TerminalNode RIGHT() {
            return getToken(SqlGrammarParser.RIGHT, 0);
        }

        public TerminalNode LEFT() {
            return getToken(SqlGrammarParser.LEFT, 0);
        }

        public TerminalNode BINARY_CHECKSUM() {
            return getToken(SqlGrammarParser.BINARY_CHECKSUM, 0);
        }

        public TerminalNode CHECKSUM() {
            return getToken(SqlGrammarParser.CHECKSUM, 0);
        }

        public ScalarFunctionNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_scalarFunctionName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterScalarFunctionName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitScalarFunctionName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitScalarFunctionName(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ScalarFunctionNameContext scalarFunctionName() throws RecognitionException {
        ScalarFunctionNameContext _localctx = new ScalarFunctionNameContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_scalarFunctionName);
        try {
            setState(754);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case CALLED:
                case FORCESEEK:
                case PUBLIC:
                case RETURN:
                case RETURNS:
                case ABSOLUTE:
                case APPLY:
                case AUTO:
                case AVG:
                case BASE64:
                case CALLER:
                case CAST:
                case CATCH:
                case CHECKSUM_AGG:
                case COMMITTED:
                case CONCAT:
                case CONTROL:
                case COOKIE:
                case COUNT:
                case COUNT_BIG:
                case DELAY:
                case DELETED:
                case DENSE_RANK:
                case DISABLE:
                case DYNAMIC:
                case ENCRYPTION:
                case EXPAND:
                case FAST:
                case FAST_FORWARD:
                case FIRST:
                case FOLLOWING:
                case FORCE:
                case FORCED:
                case FORWARD_ONLY:
                case FULLSCAN:
                case GLOBAL:
                case GO:
                case GROUPING:
                case GROUPING_ID:
                case HASH:
                case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
                case IMPERSONATE:
                case INPUT:
                case INSENSITIVE:
                case INSERTED:
                case ISOLATION:
                case KEEP:
                case KEEPFIXED:
                case KEYSET:
                case LAST:
                case LEVEL:
                case LOCAL:
                case LOCK_ESCALATION:
                case LOGIN:
                case LOOP:
                case MARK:
                case MAX:
                case MAXDOP:
                case MAXRECURSION:
                case MIN:
                case MODIFY:
                case NAME:
                case NEXT:
                case NOCOUNT:
                case NOEXPAND:
                case NORECOMPUTE:
                case NTILE:
                case NUMBER:
                case OFFSET:
                case ONLINE:
                case ONLY:
                case OPTIMISTIC:
                case OPTIMIZE:
                case OUT:
                case OUTPUT:
                case OWNER:
                case PARAMETERIZATION:
                case PARTITION:
                case PATH:
                case PRECEDING:
                case PRIOR:
                case PRIVILEGES:
                case RANGE:
                case RANK:
                case READONLY:
                case READ_ONLY:
                case RECOMPILE:
                case RELATIVE:
                case REMOTE:
                case REPEATABLE:
                case ROBUST:
                case ROOT:
                case ROW:
                case ROWGUID:
                case ROWS:
                case ROW_NUMBER:
                case SAMPLE:
                case SCHEMABINDING:
                case SCROLL:
                case SCROLL_LOCKS:
                case SELF:
                case SERIALIZABLE:
                case SIMPLE:
                case SIZE:
                case SNAPSHOT:
                case SPATIAL_WINDOW_MAX_CELLS:
                case STATIC:
                case STATS_STREAM:
                case STDEV:
                case STDEVP:
                case SUM:
                case TEXTIMAGE_ON:
                case THROW:
                case TIES:
                case TIME:
                case TRY:
                case TYPE:
                case TYPE_WARNING:
                case UNBOUNDED:
                case UNCOMMITTED:
                case UNKNOWN:
                case USING:
                case VAR:
                case VARP:
                case VIEWS:
                case VIEW_METADATA:
                case WORK:
                case XML:
                case XMLNAMESPACES:
                case DOUBLE_QUOTE_ID:
                case SQUARE_BRACKET_ID:
                case ID:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(749);
                    funcProcName();
                }
                break;
                case RIGHT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(750);
                    match(RIGHT);
                }
                break;
                case LEFT:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(751);
                    match(LEFT);
                }
                break;
                case BINARY_CHECKSUM:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(752);
                    match(BINARY_CHECKSUM);
                }
                break;
                case CHECKSUM:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(753);
                    match(CHECKSUM);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DataTypeContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public TerminalNode IDENTITY() {
            return getToken(SqlGrammarParser.IDENTITY, 0);
        }

        public List<TerminalNode> DECIMAL() {
            return getTokens(SqlGrammarParser.DECIMAL);
        }

        public TerminalNode DECIMAL(int i) {
            return getToken(SqlGrammarParser.DECIMAL, i);
        }

        public TerminalNode MAX() {
            return getToken(SqlGrammarParser.MAX, 0);
        }

        public DataTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dataType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterDataType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitDataType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitDataType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DataTypeContext dataType() throws RecognitionException {
        DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
        enterRule(_localctx, 88, RULE_dataType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(756);
                id();
                setState(758);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == IDENTITY) {
                    {
                        setState(757);
                        match(IDENTITY);
                    }
                }

                setState(767);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LR_BRACKET) {
                    {
                        setState(760);
                        match(LR_BRACKET);
                        setState(761);
                        _la = _input.LA(1);
                        if (!(_la == MAX || _la == DECIMAL)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(764);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == COMMA) {
                            {
                                setState(762);
                                match(COMMA);
                                setState(763);
                                match(DECIMAL);
                            }
                        }

                        setState(766);
                        match(RR_BRACKET);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ConstantContext extends ParserRuleContext {
        public Token dollar;

        public TerminalNode STRING() {
            return getToken(SqlGrammarParser.STRING, 0);
        }

        public TerminalNode BINARY() {
            return getToken(SqlGrammarParser.BINARY, 0);
        }

        public TerminalNode DECIMAL() {
            return getToken(SqlGrammarParser.DECIMAL, 0);
        }

        public SignContext sign() {
            return getRuleContext(SignContext.class, 0);
        }

        public TerminalNode REAL() {
            return getToken(SqlGrammarParser.REAL, 0);
        }

        public TerminalNode FLOAT() {
            return getToken(SqlGrammarParser.FLOAT, 0);
        }

        public ConstantContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constant;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterConstant(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitConstant(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitConstant(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ConstantContext constant() throws RecognitionException {
        ConstantContext _localctx = new ConstantContext(_ctx, getState());
        enterRule(_localctx, 90, RULE_constant);
        int _la;
        try {
            setState(784);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 88, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(769);
                    match(STRING);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(770);
                    match(BINARY);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(772);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == PLUS || _la == MINUS) {
                        {
                            setState(771);
                            sign();
                        }
                    }

                    setState(774);
                    match(DECIMAL);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(776);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == PLUS || _la == MINUS) {
                        {
                            setState(775);
                            sign();
                        }
                    }

                    setState(778);
                    _la = _input.LA(1);
                    if (!(_la == FLOAT || _la == REAL)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(780);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == PLUS || _la == MINUS) {
                        {
                            setState(779);
                            sign();
                        }
                    }

                    setState(782);
                    ((ConstantContext) _localctx).dollar = match(DOLLAR);
                    setState(783);
                    _la = _input.LA(1);
                    if (!(_la == DECIMAL || _la == FLOAT)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SignContext extends ParserRuleContext {
        public SignContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_sign;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterSign(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitSign(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor) return ((SqlGrammarVisitor<? extends T>) visitor).visitSign(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SignContext sign() throws RecognitionException {
        SignContext _localctx = new SignContext(_ctx, getState());
        enterRule(_localctx, 92, RULE_sign);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(786);
                _la = _input.LA(1);
                if (!(_la == PLUS || _la == MINUS)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ComplexIdContext extends ParserRuleContext {
        public List<SimpleIdContext> simpleId() {
            return getRuleContexts(SimpleIdContext.class);
        }

        public SimpleIdContext simpleId(int i) {
            return getRuleContext(SimpleIdContext.class, i);
        }

        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public ComplexIdContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_complexId;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterComplexId(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitComplexId(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitComplexId(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ComplexIdContext complexId() throws RecognitionException {
        ComplexIdContext _localctx = new ComplexIdContext(_ctx, getState());
        enterRule(_localctx, 94, RULE_complexId);
        try {
            int _alt;
            setState(797);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 91, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(792);
                    _errHandler.sync(this);
                    _alt = 1;
                    do {
                        switch (_alt) {
                            case 1: {
                                setState(792);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 89, _ctx)) {
                                    case 1: {
                                        setState(788);
                                        simpleId();
                                    }
                                    break;
                                    case 2: {
                                        setState(789);
                                        simpleId();
                                        setState(790);
                                        match(DOT);
                                    }
                                    break;
                                }
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                        setState(794);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 90, _ctx);
                    } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(796);
                    id();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IdContext extends ParserRuleContext {
        public SimpleIdContext simpleId() {
            return getRuleContext(SimpleIdContext.class, 0);
        }

        public TerminalNode DOUBLE_QUOTE_ID() {
            return getToken(SqlGrammarParser.DOUBLE_QUOTE_ID, 0);
        }

        public TerminalNode SQUARE_BRACKET_ID() {
            return getToken(SqlGrammarParser.SQUARE_BRACKET_ID, 0);
        }

        public IdContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_id;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterId(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitId(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor) return ((SqlGrammarVisitor<? extends T>) visitor).visitId(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IdContext id() throws RecognitionException {
        IdContext _localctx = new IdContext(_ctx, getState());
        enterRule(_localctx, 96, RULE_id);
        try {
            setState(802);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case CALLED:
                case FORCESEEK:
                case PUBLIC:
                case RETURN:
                case RETURNS:
                case ABSOLUTE:
                case APPLY:
                case AUTO:
                case AVG:
                case BASE64:
                case CALLER:
                case CAST:
                case CATCH:
                case CHECKSUM_AGG:
                case COMMITTED:
                case CONCAT:
                case CONTROL:
                case COOKIE:
                case COUNT:
                case COUNT_BIG:
                case DELAY:
                case DELETED:
                case DENSE_RANK:
                case DISABLE:
                case DYNAMIC:
                case ENCRYPTION:
                case EXPAND:
                case FAST:
                case FAST_FORWARD:
                case FIRST:
                case FOLLOWING:
                case FORCE:
                case FORCED:
                case FORWARD_ONLY:
                case FULLSCAN:
                case GLOBAL:
                case GO:
                case GROUPING:
                case GROUPING_ID:
                case HASH:
                case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
                case IMPERSONATE:
                case INPUT:
                case INSENSITIVE:
                case INSERTED:
                case ISOLATION:
                case KEEP:
                case KEEPFIXED:
                case KEYSET:
                case LAST:
                case LEVEL:
                case LOCAL:
                case LOCK_ESCALATION:
                case LOGIN:
                case LOOP:
                case MARK:
                case MAX:
                case MAXDOP:
                case MAXRECURSION:
                case MIN:
                case MODIFY:
                case NAME:
                case NEXT:
                case NOCOUNT:
                case NOEXPAND:
                case NORECOMPUTE:
                case NTILE:
                case NUMBER:
                case OFFSET:
                case ONLINE:
                case ONLY:
                case OPTIMISTIC:
                case OPTIMIZE:
                case OUT:
                case OUTPUT:
                case OWNER:
                case PARAMETERIZATION:
                case PARTITION:
                case PATH:
                case PRECEDING:
                case PRIOR:
                case PRIVILEGES:
                case RANGE:
                case RANK:
                case READONLY:
                case READ_ONLY:
                case RECOMPILE:
                case RELATIVE:
                case REMOTE:
                case REPEATABLE:
                case ROBUST:
                case ROOT:
                case ROW:
                case ROWGUID:
                case ROWS:
                case ROW_NUMBER:
                case SAMPLE:
                case SCHEMABINDING:
                case SCROLL:
                case SCROLL_LOCKS:
                case SELF:
                case SERIALIZABLE:
                case SIMPLE:
                case SIZE:
                case SNAPSHOT:
                case SPATIAL_WINDOW_MAX_CELLS:
                case STATIC:
                case STATS_STREAM:
                case STDEV:
                case STDEVP:
                case SUM:
                case TEXTIMAGE_ON:
                case THROW:
                case TIES:
                case TIME:
                case TRY:
                case TYPE:
                case TYPE_WARNING:
                case UNBOUNDED:
                case UNCOMMITTED:
                case UNKNOWN:
                case USING:
                case VAR:
                case VARP:
                case VIEWS:
                case VIEW_METADATA:
                case WORK:
                case XML:
                case XMLNAMESPACES:
                case ID:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(799);
                    simpleId();
                }
                break;
                case DOUBLE_QUOTE_ID:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(800);
                    match(DOUBLE_QUOTE_ID);
                }
                break;
                case SQUARE_BRACKET_ID:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(801);
                    match(SQUARE_BRACKET_ID);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SimpleIdContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(SqlGrammarParser.ID, 0);
        }

        public TerminalNode ABSOLUTE() {
            return getToken(SqlGrammarParser.ABSOLUTE, 0);
        }

        public TerminalNode APPLY() {
            return getToken(SqlGrammarParser.APPLY, 0);
        }

        public TerminalNode AUTO() {
            return getToken(SqlGrammarParser.AUTO, 0);
        }

        public TerminalNode AVG() {
            return getToken(SqlGrammarParser.AVG, 0);
        }

        public TerminalNode BASE64() {
            return getToken(SqlGrammarParser.BASE64, 0);
        }

        public TerminalNode CALLED() {
            return getToken(SqlGrammarParser.CALLED, 0);
        }

        public TerminalNode CALLER() {
            return getToken(SqlGrammarParser.CALLER, 0);
        }

        public TerminalNode CAST() {
            return getToken(SqlGrammarParser.CAST, 0);
        }

        public TerminalNode CATCH() {
            return getToken(SqlGrammarParser.CATCH, 0);
        }

        public TerminalNode CHECKSUM_AGG() {
            return getToken(SqlGrammarParser.CHECKSUM_AGG, 0);
        }

        public TerminalNode COMMITTED() {
            return getToken(SqlGrammarParser.COMMITTED, 0);
        }

        public TerminalNode CONCAT() {
            return getToken(SqlGrammarParser.CONCAT, 0);
        }

        public TerminalNode CONTROL() {
            return getToken(SqlGrammarParser.CONTROL, 0);
        }

        public TerminalNode COOKIE() {
            return getToken(SqlGrammarParser.COOKIE, 0);
        }

        public TerminalNode COUNT() {
            return getToken(SqlGrammarParser.COUNT, 0);
        }

        public TerminalNode COUNT_BIG() {
            return getToken(SqlGrammarParser.COUNT_BIG, 0);
        }

        public TerminalNode DELAY() {
            return getToken(SqlGrammarParser.DELAY, 0);
        }

        public TerminalNode DELETED() {
            return getToken(SqlGrammarParser.DELETED, 0);
        }

        public TerminalNode DENSE_RANK() {
            return getToken(SqlGrammarParser.DENSE_RANK, 0);
        }

        public TerminalNode DISABLE() {
            return getToken(SqlGrammarParser.DISABLE, 0);
        }

        public TerminalNode DYNAMIC() {
            return getToken(SqlGrammarParser.DYNAMIC, 0);
        }

        public TerminalNode ENCRYPTION() {
            return getToken(SqlGrammarParser.ENCRYPTION, 0);
        }

        public TerminalNode EXPAND() {
            return getToken(SqlGrammarParser.EXPAND, 0);
        }

        public TerminalNode FAST() {
            return getToken(SqlGrammarParser.FAST, 0);
        }

        public TerminalNode FAST_FORWARD() {
            return getToken(SqlGrammarParser.FAST_FORWARD, 0);
        }

        public TerminalNode FIRST() {
            return getToken(SqlGrammarParser.FIRST, 0);
        }

        public TerminalNode FOLLOWING() {
            return getToken(SqlGrammarParser.FOLLOWING, 0);
        }

        public TerminalNode FORCE() {
            return getToken(SqlGrammarParser.FORCE, 0);
        }

        public TerminalNode FORCESEEK() {
            return getToken(SqlGrammarParser.FORCESEEK, 0);
        }

        public TerminalNode FORWARD_ONLY() {
            return getToken(SqlGrammarParser.FORWARD_ONLY, 0);
        }

        public TerminalNode FULLSCAN() {
            return getToken(SqlGrammarParser.FULLSCAN, 0);
        }

        public TerminalNode GLOBAL() {
            return getToken(SqlGrammarParser.GLOBAL, 0);
        }

        public TerminalNode GO() {
            return getToken(SqlGrammarParser.GO, 0);
        }

        public TerminalNode GROUPING() {
            return getToken(SqlGrammarParser.GROUPING, 0);
        }

        public TerminalNode GROUPING_ID() {
            return getToken(SqlGrammarParser.GROUPING_ID, 0);
        }

        public TerminalNode HASH() {
            return getToken(SqlGrammarParser.HASH, 0);
        }

        public TerminalNode IMPERSONATE() {
            return getToken(SqlGrammarParser.IMPERSONATE, 0);
        }

        public TerminalNode INSENSITIVE() {
            return getToken(SqlGrammarParser.INSENSITIVE, 0);
        }

        public TerminalNode INSERTED() {
            return getToken(SqlGrammarParser.INSERTED, 0);
        }

        public TerminalNode ISOLATION() {
            return getToken(SqlGrammarParser.ISOLATION, 0);
        }

        public TerminalNode KEEP() {
            return getToken(SqlGrammarParser.KEEP, 0);
        }

        public TerminalNode KEEPFIXED() {
            return getToken(SqlGrammarParser.KEEPFIXED, 0);
        }

        public TerminalNode FORCED() {
            return getToken(SqlGrammarParser.FORCED, 0);
        }

        public TerminalNode KEYSET() {
            return getToken(SqlGrammarParser.KEYSET, 0);
        }

        public TerminalNode IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX() {
            return getToken(SqlGrammarParser.IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX, 0);
        }

        public TerminalNode INPUT() {
            return getToken(SqlGrammarParser.INPUT, 0);
        }

        public TerminalNode LAST() {
            return getToken(SqlGrammarParser.LAST, 0);
        }

        public TerminalNode LEVEL() {
            return getToken(SqlGrammarParser.LEVEL, 0);
        }

        public TerminalNode LOCAL() {
            return getToken(SqlGrammarParser.LOCAL, 0);
        }

        public TerminalNode LOCK_ESCALATION() {
            return getToken(SqlGrammarParser.LOCK_ESCALATION, 0);
        }

        public TerminalNode LOGIN() {
            return getToken(SqlGrammarParser.LOGIN, 0);
        }

        public TerminalNode LOOP() {
            return getToken(SqlGrammarParser.LOOP, 0);
        }

        public TerminalNode MARK() {
            return getToken(SqlGrammarParser.MARK, 0);
        }

        public TerminalNode MAX() {
            return getToken(SqlGrammarParser.MAX, 0);
        }

        public TerminalNode MAXDOP() {
            return getToken(SqlGrammarParser.MAXDOP, 0);
        }

        public TerminalNode MAXRECURSION() {
            return getToken(SqlGrammarParser.MAXRECURSION, 0);
        }

        public TerminalNode MIN() {
            return getToken(SqlGrammarParser.MIN, 0);
        }

        public TerminalNode MODIFY() {
            return getToken(SqlGrammarParser.MODIFY, 0);
        }

        public TerminalNode NAME() {
            return getToken(SqlGrammarParser.NAME, 0);
        }

        public TerminalNode NEXT() {
            return getToken(SqlGrammarParser.NEXT, 0);
        }

        public TerminalNode NOCOUNT() {
            return getToken(SqlGrammarParser.NOCOUNT, 0);
        }

        public TerminalNode NOEXPAND() {
            return getToken(SqlGrammarParser.NOEXPAND, 0);
        }

        public TerminalNode NORECOMPUTE() {
            return getToken(SqlGrammarParser.NORECOMPUTE, 0);
        }

        public TerminalNode NTILE() {
            return getToken(SqlGrammarParser.NTILE, 0);
        }

        public TerminalNode NUMBER() {
            return getToken(SqlGrammarParser.NUMBER, 0);
        }

        public TerminalNode OFFSET() {
            return getToken(SqlGrammarParser.OFFSET, 0);
        }

        public TerminalNode ONLINE() {
            return getToken(SqlGrammarParser.ONLINE, 0);
        }

        public TerminalNode ONLY() {
            return getToken(SqlGrammarParser.ONLY, 0);
        }

        public TerminalNode OPTIMISTIC() {
            return getToken(SqlGrammarParser.OPTIMISTIC, 0);
        }

        public TerminalNode OPTIMIZE() {
            return getToken(SqlGrammarParser.OPTIMIZE, 0);
        }

        public TerminalNode OUT() {
            return getToken(SqlGrammarParser.OUT, 0);
        }

        public TerminalNode OUTPUT() {
            return getToken(SqlGrammarParser.OUTPUT, 0);
        }

        public TerminalNode OWNER() {
            return getToken(SqlGrammarParser.OWNER, 0);
        }

        public TerminalNode PARAMETERIZATION() {
            return getToken(SqlGrammarParser.PARAMETERIZATION, 0);
        }

        public TerminalNode PARTITION() {
            return getToken(SqlGrammarParser.PARTITION, 0);
        }

        public TerminalNode PATH() {
            return getToken(SqlGrammarParser.PATH, 0);
        }

        public TerminalNode PRECEDING() {
            return getToken(SqlGrammarParser.PRECEDING, 0);
        }

        public TerminalNode PRIOR() {
            return getToken(SqlGrammarParser.PRIOR, 0);
        }

        public TerminalNode PRIVILEGES() {
            return getToken(SqlGrammarParser.PRIVILEGES, 0);
        }

        public TerminalNode PUBLIC() {
            return getToken(SqlGrammarParser.PUBLIC, 0);
        }

        public TerminalNode RANGE() {
            return getToken(SqlGrammarParser.RANGE, 0);
        }

        public TerminalNode RANK() {
            return getToken(SqlGrammarParser.RANK, 0);
        }

        public TerminalNode READONLY() {
            return getToken(SqlGrammarParser.READONLY, 0);
        }

        public TerminalNode READ_ONLY() {
            return getToken(SqlGrammarParser.READ_ONLY, 0);
        }

        public TerminalNode RECOMPILE() {
            return getToken(SqlGrammarParser.RECOMPILE, 0);
        }

        public TerminalNode RELATIVE() {
            return getToken(SqlGrammarParser.RELATIVE, 0);
        }

        public TerminalNode REMOTE() {
            return getToken(SqlGrammarParser.REMOTE, 0);
        }

        public TerminalNode REPEATABLE() {
            return getToken(SqlGrammarParser.REPEATABLE, 0);
        }

        public TerminalNode RETURN() {
            return getToken(SqlGrammarParser.RETURN, 0);
        }

        public TerminalNode RETURNS() {
            return getToken(SqlGrammarParser.RETURNS, 0);
        }

        public TerminalNode ROBUST() {
            return getToken(SqlGrammarParser.ROBUST, 0);
        }

        public TerminalNode ROOT() {
            return getToken(SqlGrammarParser.ROOT, 0);
        }

        public TerminalNode ROW() {
            return getToken(SqlGrammarParser.ROW, 0);
        }

        public TerminalNode ROWGUID() {
            return getToken(SqlGrammarParser.ROWGUID, 0);
        }

        public TerminalNode ROWS() {
            return getToken(SqlGrammarParser.ROWS, 0);
        }

        public TerminalNode ROW_NUMBER() {
            return getToken(SqlGrammarParser.ROW_NUMBER, 0);
        }

        public TerminalNode SAMPLE() {
            return getToken(SqlGrammarParser.SAMPLE, 0);
        }

        public TerminalNode SIZE() {
            return getToken(SqlGrammarParser.SIZE, 0);
        }

        public TerminalNode SCHEMABINDING() {
            return getToken(SqlGrammarParser.SCHEMABINDING, 0);
        }

        public TerminalNode SCROLL() {
            return getToken(SqlGrammarParser.SCROLL, 0);
        }

        public TerminalNode SCROLL_LOCKS() {
            return getToken(SqlGrammarParser.SCROLL_LOCKS, 0);
        }

        public TerminalNode SELF() {
            return getToken(SqlGrammarParser.SELF, 0);
        }

        public TerminalNode SERIALIZABLE() {
            return getToken(SqlGrammarParser.SERIALIZABLE, 0);
        }

        public TerminalNode SIMPLE() {
            return getToken(SqlGrammarParser.SIMPLE, 0);
        }

        public TerminalNode SNAPSHOT() {
            return getToken(SqlGrammarParser.SNAPSHOT, 0);
        }

        public TerminalNode SPATIAL_WINDOW_MAX_CELLS() {
            return getToken(SqlGrammarParser.SPATIAL_WINDOW_MAX_CELLS, 0);
        }

        public TerminalNode STATIC() {
            return getToken(SqlGrammarParser.STATIC, 0);
        }

        public TerminalNode STATS_STREAM() {
            return getToken(SqlGrammarParser.STATS_STREAM, 0);
        }

        public TerminalNode STDEV() {
            return getToken(SqlGrammarParser.STDEV, 0);
        }

        public TerminalNode STDEVP() {
            return getToken(SqlGrammarParser.STDEVP, 0);
        }

        public TerminalNode SUM() {
            return getToken(SqlGrammarParser.SUM, 0);
        }

        public TerminalNode TEXTIMAGE_ON() {
            return getToken(SqlGrammarParser.TEXTIMAGE_ON, 0);
        }

        public TerminalNode THROW() {
            return getToken(SqlGrammarParser.THROW, 0);
        }

        public TerminalNode TIES() {
            return getToken(SqlGrammarParser.TIES, 0);
        }

        public TerminalNode TIME() {
            return getToken(SqlGrammarParser.TIME, 0);
        }

        public TerminalNode TRY() {
            return getToken(SqlGrammarParser.TRY, 0);
        }

        public TerminalNode TYPE() {
            return getToken(SqlGrammarParser.TYPE, 0);
        }

        public TerminalNode TYPE_WARNING() {
            return getToken(SqlGrammarParser.TYPE_WARNING, 0);
        }

        public TerminalNode UNBOUNDED() {
            return getToken(SqlGrammarParser.UNBOUNDED, 0);
        }

        public TerminalNode UNCOMMITTED() {
            return getToken(SqlGrammarParser.UNCOMMITTED, 0);
        }

        public TerminalNode UNKNOWN() {
            return getToken(SqlGrammarParser.UNKNOWN, 0);
        }

        public TerminalNode USING() {
            return getToken(SqlGrammarParser.USING, 0);
        }

        public TerminalNode VAR() {
            return getToken(SqlGrammarParser.VAR, 0);
        }

        public TerminalNode VARP() {
            return getToken(SqlGrammarParser.VARP, 0);
        }

        public TerminalNode VIEW_METADATA() {
            return getToken(SqlGrammarParser.VIEW_METADATA, 0);
        }

        public TerminalNode VIEWS() {
            return getToken(SqlGrammarParser.VIEWS, 0);
        }

        public TerminalNode WORK() {
            return getToken(SqlGrammarParser.WORK, 0);
        }

        public TerminalNode XML() {
            return getToken(SqlGrammarParser.XML, 0);
        }

        public TerminalNode XMLNAMESPACES() {
            return getToken(SqlGrammarParser.XMLNAMESPACES, 0);
        }

        public SimpleIdContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_simpleId;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterSimpleId(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitSimpleId(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitSimpleId(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SimpleIdContext simpleId() throws RecognitionException {
        SimpleIdContext _localctx = new SimpleIdContext(_ctx, getState());
        enterRule(_localctx, 98, RULE_simpleId);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(804);
                _la = _input.LA(1);
                if (!(_la == CALLED || _la == FORCESEEK || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (PUBLIC - 133)) | (1L << (RETURN - 133)) | (1L << (RETURNS - 133)) | (1L << (ABSOLUTE - 133)))) != 0) || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (APPLY - 202)) | (1L << (AUTO - 202)) | (1L << (AVG - 202)) | (1L << (BASE64 - 202)) | (1L << (CALLER - 202)) | (1L << (CAST - 202)) | (1L << (CATCH - 202)) | (1L << (CHECKSUM_AGG - 202)) | (1L << (COMMITTED - 202)) | (1L << (CONCAT - 202)) | (1L << (CONTROL - 202)) | (1L << (COOKIE - 202)) | (1L << (COUNT - 202)) | (1L << (COUNT_BIG - 202)) | (1L << (DELAY - 202)) | (1L << (DELETED - 202)) | (1L << (DENSE_RANK - 202)) | (1L << (DISABLE - 202)) | (1L << (DYNAMIC - 202)) | (1L << (ENCRYPTION - 202)) | (1L << (EXPAND - 202)) | (1L << (FAST - 202)) | (1L << (FAST_FORWARD - 202)) | (1L << (FIRST - 202)) | (1L << (FOLLOWING - 202)) | (1L << (FORCE - 202)) | (1L << (FORCED - 202)) | (1L << (FORWARD_ONLY - 202)) | (1L << (FULLSCAN - 202)))) != 0) || ((((_la - 267)) & ~0x3f) == 0 && ((1L << (_la - 267)) & ((1L << (GLOBAL - 267)) | (1L << (GO - 267)) | (1L << (GROUPING - 267)) | (1L << (GROUPING_ID - 267)) | (1L << (HASH - 267)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 267)) | (1L << (IMPERSONATE - 267)) | (1L << (INPUT - 267)) | (1L << (INSENSITIVE - 267)) | (1L << (INSERTED - 267)) | (1L << (ISOLATION - 267)) | (1L << (KEEP - 267)) | (1L << (KEEPFIXED - 267)) | (1L << (KEYSET - 267)) | (1L << (LAST - 267)) | (1L << (LEVEL - 267)) | (1L << (LOCAL - 267)) | (1L << (LOCK_ESCALATION - 267)) | (1L << (LOGIN - 267)) | (1L << (LOOP - 267)) | (1L << (MARK - 267)) | (1L << (MAX - 267)) | (1L << (MAXDOP - 267)) | (1L << (MAXRECURSION - 267)) | (1L << (MIN - 267)) | (1L << (MODIFY - 267)) | (1L << (NAME - 267)) | (1L << (NEXT - 267)) | (1L << (NOCOUNT - 267)) | (1L << (NOEXPAND - 267)) | (1L << (NORECOMPUTE - 267)) | (1L << (NTILE - 267)) | (1L << (NUMBER - 267)) | (1L << (OFFSET - 267)) | (1L << (ONLINE - 267)) | (1L << (ONLY - 267)) | (1L << (OPTIMISTIC - 267)) | (1L << (OPTIMIZE - 267)) | (1L << (OUT - 267)) | (1L << (OUTPUT - 267)) | (1L << (OWNER - 267)) | (1L << (PARAMETERIZATION - 267)) | (1L << (PARTITION - 267)) | (1L << (PATH - 267)))) != 0) || ((((_la - 331)) & ~0x3f) == 0 && ((1L << (_la - 331)) & ((1L << (PRECEDING - 331)) | (1L << (PRIOR - 331)) | (1L << (PRIVILEGES - 331)) | (1L << (RANGE - 331)) | (1L << (RANK - 331)) | (1L << (READONLY - 331)) | (1L << (READ_ONLY - 331)) | (1L << (RECOMPILE - 331)) | (1L << (RELATIVE - 331)) | (1L << (REMOTE - 331)) | (1L << (REPEATABLE - 331)) | (1L << (ROBUST - 331)) | (1L << (ROOT - 331)) | (1L << (ROW - 331)) | (1L << (ROWGUID - 331)) | (1L << (ROWS - 331)) | (1L << (ROW_NUMBER - 331)) | (1L << (SAMPLE - 331)) | (1L << (SCHEMABINDING - 331)) | (1L << (SCROLL - 331)) | (1L << (SCROLL_LOCKS - 331)) | (1L << (SELF - 331)) | (1L << (SERIALIZABLE - 331)) | (1L << (SIMPLE - 331)) | (1L << (SIZE - 331)) | (1L << (SNAPSHOT - 331)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 331)) | (1L << (STATIC - 331)) | (1L << (STATS_STREAM - 331)) | (1L << (STDEV - 331)) | (1L << (STDEVP - 331)) | (1L << (SUM - 331)) | (1L << (TEXTIMAGE_ON - 331)) | (1L << (THROW - 331)) | (1L << (TIES - 331)) | (1L << (TIME - 331)) | (1L << (TRY - 331)) | (1L << (TYPE - 331)) | (1L << (TYPE_WARNING - 331)) | (1L << (UNBOUNDED - 331)) | (1L << (UNCOMMITTED - 331)) | (1L << (UNKNOWN - 331)) | (1L << (USING - 331)) | (1L << (VAR - 331)) | (1L << (VARP - 331)) | (1L << (VIEWS - 331)) | (1L << (VIEW_METADATA - 331)))) != 0) || ((((_la - 395)) & ~0x3f) == 0 && ((1L << (_la - 395)) & ((1L << (WORK - 395)) | (1L << (XML - 395)) | (1L << (XMLNAMESPACES - 395)) | (1L << (ID - 395)))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ComparisonOperatorContext extends ParserRuleContext {
        public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_comparisonOperator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).enterComparisonOperator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlGrammarListener) ((SqlGrammarListener) listener).exitComparisonOperator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlGrammarVisitor)
                return ((SqlGrammarVisitor<? extends T>) visitor).visitComparisonOperator(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
        ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
        enterRule(_localctx, 100, RULE_comparisonOperator);
        try {
            setState(821);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 93, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(806);
                    match(EQUAL);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(807);
                    match(GREATER);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(808);
                    match(LESS);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(809);
                    match(LESS);
                    setState(810);
                    match(EQUAL);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(811);
                    match(GREATER);
                    setState(812);
                    match(EQUAL);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(813);
                    match(LESS);
                    setState(814);
                    match(GREATER);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(815);
                    match(EXCLAMATION);
                    setState(816);
                    match(EQUAL);
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(817);
                    match(EXCLAMATION);
                    setState(818);
                    match(GREATER);
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(819);
                    match(EXCLAMATION);
                    setState(820);
                    match(LESS);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 4:
                return expression_sempred((ExpressionContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 4);
            case 1:
                return precpred(_ctx, 2);
            case 2:
                return precpred(_ctx, 1);
            case 3:
                return precpred(_ctx, 11);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u01bb\u033a\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\3\2\3\2\5\2k\n\2\6\2m\n\2\r\2\16\2n\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3" +
                    "\5\5\5y\n\5\3\5\5\5|\n\5\3\5\5\5\177\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3" +
                    "\6\3\6\6\6\u008a\n\6\r\6\16\6\u008b\3\6\3\6\5\6\u0090\n\6\3\6\3\6\3\6" +
                    "\3\6\6\6\u0096\n\6\r\6\16\6\u0097\3\6\3\6\5\6\u009c\n\6\3\6\3\6\3\6\3" +
                    "\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ad\n\6\3\6\3\6\3" +
                    "\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00bc\n\6\f\6\16\6\u00bf" +
                    "\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c9\n\7\3\b\3\b\3\t\3\t\3" +
                    "\t\7\t\u00d0\n\t\f\t\16\t\u00d3\13\t\3\n\3\n\3\n\7\n\u00d8\n\n\f\n\16" +
                    "\n\u00db\13\n\3\13\5\13\u00de\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3" +
                    "\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f4\n\f\3\f\3\f\3" +
                    "\f\3\f\3\f\3\f\3\f\5\f\u00fd\n\f\3\f\3\f\3\f\3\f\5\f\u0103\n\f\3\f\3\f" +
                    "\3\f\3\f\5\f\u0109\n\f\3\f\3\f\3\f\3\f\5\f\u010f\n\f\3\f\3\f\3\f\3\f\3" +
                    "\f\3\f\3\f\3\f\5\f\u0119\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u0120\n\r\3\r\7\r" +
                    "\u0123\n\r\f\r\16\r\u0126\13\r\3\16\3\16\5\16\u012a\n\16\3\16\3\16\5\16" +
                    "\u012e\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u0135\n\16\3\17\3\17\5\17\u0139" +
                    "\n\17\3\17\3\17\3\17\5\17\u013e\n\17\3\17\3\17\5\17\u0142\n\17\3\17\3" +
                    "\17\5\17\u0146\n\17\3\17\3\17\3\17\3\17\3\17\7\17\u014d\n\17\f\17\16\17" +
                    "\u0150\13\17\5\17\u0152\n\17\3\17\3\17\5\17\u0156\n\17\3\20\3\20\3\20" +
                    "\3\20\3\20\7\20\u015d\n\20\f\20\16\20\u0160\13\20\3\20\3\20\3\20\3\20" +
                    "\3\20\3\20\3\20\3\20\3\20\5\20\u016b\n\20\5\20\u016d\n\20\3\21\3\21\5" +
                    "\21\u0171\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u017a\n\23\f\23" +
                    "\16\23\u017d\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3" +
                    "\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3" +
                    "\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01a1\n\24\3\25" +
                    "\3\25\3\25\7\25\u01a6\n\25\f\25\16\25\u01a9\13\25\3\26\3\26\3\26\5\26" +
                    "\u01ae\n\26\3\26\3\26\3\26\5\26\u01b3\n\26\3\26\3\26\3\26\3\26\3\26\3" +
                    "\26\5\26\u01bb\n\26\3\26\5\26\u01be\n\26\5\26\u01c0\n\26\3\27\3\27\3\27" +
                    "\7\27\u01c5\n\27\f\27\16\27\u01c8\13\27\3\30\3\30\3\30\3\30\3\30\5\30" +
                    "\u01cf\n\30\3\31\3\31\7\31\u01d3\n\31\f\31\16\31\u01d6\13\31\3\32\3\32" +
                    "\5\32\u01da\n\32\3\32\3\32\3\32\5\32\u01df\n\32\5\32\u01e1\n\32\3\32\3" +
                    "\32\3\32\3\32\3\32\5\32\u01e8\n\32\3\32\3\32\5\32\u01ec\n\32\3\32\3\32" +
                    "\3\32\3\32\3\32\5\32\u01f3\n\32\5\32\u01f5\n\32\5\32\u01f7\n\32\3\33\3" +
                    "\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\5\34\u0202\n\34\3\34\3\34\5\34" +
                    "\u0206\n\34\5\34\u0208\n\34\3\34\5\34\u020b\n\34\3\34\3\34\3\34\3\34\3" +
                    "\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u021b\n\34\3\35" +
                    "\5\35\u021e\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u0225\n\36\3\37\3\37\3" +
                    "\37\3\37\5\37\u022b\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37" +
                    "\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0241\n\37" +
                    "\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37" +
                    "\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37" +
                    "\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37" +
                    "\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0275\n\37\3\37\3\37\5\37" +
                    "\u0279\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37" +
                    "\5\37\u0287\n\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\5\"\u0294\n\"\3\"\3" +
                    "\"\3#\5#\u0299\n#\3$\3$\3$\3$\7$\u029f\n$\f$\16$\u02a2\13$\3$\3$\3%\3" +
                    "%\5%\u02a8\n%\3&\3&\3&\7&\u02ad\n&\f&\16&\u02b0\13&\3\'\3\'\3\'\3\'\3" +
                    "\'\3\'\3\'\3\'\3\'\5\'\u02bb\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3" +
                    "\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u02cd\n\'\3(\5(\u02d0\n(\3(\3(\3)\3)\3" +
                    "*\3*\3*\5*\u02d9\n*\3*\3*\3*\3*\3*\5*\u02e0\n*\3*\3*\3+\3+\3+\5+\u02e7" +
                    "\n+\3+\3+\3,\5,\u02ec\n,\3,\3,\3-\3-\3-\3-\3-\5-\u02f5\n-\3.\3.\5.\u02f9" +
                    "\n.\3.\3.\3.\3.\5.\u02ff\n.\3.\5.\u0302\n.\3/\3/\3/\5/\u0307\n/\3/\3/" +
                    "\5/\u030b\n/\3/\3/\5/\u030f\n/\3/\3/\5/\u0313\n/\3\60\3\60\3\61\3\61\3" +
                    "\61\3\61\6\61\u031b\n\61\r\61\16\61\u031c\3\61\5\61\u0320\n\61\3\62\3" +
                    "\62\3\62\5\62\u0325\n\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64" +
                    "\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0338\n\64\3\64\2\3\n\65" +
                    "\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH" +
                    "JLNPRTVXZ\\^`bdf\2\30\3\2\u01b6\u01b7\3\2\u01b3\u01b5\4\2\u01b6\u01b7" +
                    "\u01b9\u01bb\5\2\4\4\7\7\u00a4\u00a4\4\2\4\4\67\67\4\2\u0160\u0160\u0162" +
                    "\u0162\4\2\u0106\u0106\u0137\u0137\4\2\t\t\65\65\4\2{{\u0112\u0112\5\2" +
                    "hh\u00e2\u00e2\u0112\u0112\5\2hh\u0112\u0112\u0126\u0126\4\2\u0109\u0109" +
                    "\u016c\u016c\4\2UU\u0161\u0161\4\2nn\u0196\u0197\5\2OOcc\u0094\u0094\6" +
                    "\2hh\u0112\u0112\u0126\u0126\u015b\u015b\7\2\u00d5\u00d5\u0128\u0128\u012e" +
                    "\u012e\u0173\u0175\u0189\u018a\3\2\u00e6\u00e7\4\2\u0128\u0128\u0197\u0197" +
                    "\3\2\u019b\u019c\4\2\u0197\u0197\u019b\u019b\60\2\22\22JJ\u0087\u0087" +
                    "\u0090\u0091\u00c4\u00c4\u00cc\u00cc\u00ce\u00ce\u00d5\u00d6\u00d9\u00db" +
                    "\u00df\u00e0\u00e2\u00e2\u00e4\u00e7\u00f3\u00f3\u00f5\u00f6\u00f8\u00f8" +
                    "\u00fb\u00fb\u00fe\u00fe\u0100\u0102\u0106\u010b\u010d\u0110\u0112\u0112" +
                    "\u0115\u0115\u0117\u0117\u0119\u011c\u011e\u012a\u012e\u012e\u0132\u0132" +
                    "\u0134\u0134\u0137\u0139\u013b\u013b\u013d\u013e\u0141\u0148\u014a\u014f" +
                    "\u0151\u0153\u0155\u0155\u0157\u0157\u015a\u015c\u015e\u0167\u0169\u016a" +
                    "\u016c\u016c\u016e\u0175\u0179\u017c\u0180\u0180\u0182\u0186\u0188\u018f" +
                    "\u0198\u0198\2\u03b1\2l\3\2\2\2\4r\3\2\2\2\6t\3\2\2\2\bv\3\2\2\2\n\u00ac" +
                    "\3\2\2\2\f\u00c8\3\2\2\2\16\u00ca\3\2\2\2\20\u00cc\3\2\2\2\22\u00d4\3" +
                    "\2\2\2\24\u00dd\3\2\2\2\26\u0118\3\2\2\2\30\u011f\3\2\2\2\32\u012d\3\2" +
                    "\2\2\34\u0136\3\2\2\2\36\u0157\3\2\2\2 \u016e\3\2\2\2\"\u0172\3\2\2\2" +
                    "$\u0174\3\2\2\2&\u01a0\3\2\2\2(\u01a2\3\2\2\2*\u01bf\3\2\2\2,\u01c1\3" +
                    "\2\2\2.\u01ce\3\2\2\2\60\u01d0\3\2\2\2\62\u01f6\3\2\2\2\64\u01f8\3\2\2" +
                    "\2\66\u021a\3\2\2\28\u021d\3\2\2\2:\u0224\3\2\2\2<\u0286\3\2\2\2>\u0288" +
                    "\3\2\2\2@\u028d\3\2\2\2B\u0293\3\2\2\2D\u0298\3\2\2\2F\u029a\3\2\2\2H" +
                    "\u02a7\3\2\2\2J\u02a9\3\2\2\2L\u02cc\3\2\2\2N\u02cf\3\2\2\2P\u02d3\3\2" +
                    "\2\2R\u02df\3\2\2\2T\u02e6\3\2\2\2V\u02eb\3\2\2\2X\u02f4\3\2\2\2Z\u02f6" +
                    "\3\2\2\2\\\u0312\3\2\2\2^\u0314\3\2\2\2`\u031f\3\2\2\2b\u0324\3\2\2\2" +
                    "d\u0326\3\2\2\2f\u0337\3\2\2\2hj\5\4\3\2ik\7\u01b1\2\2ji\3\2\2\2jk\3\2" +
                    "\2\2km\3\2\2\2lh\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\2" +
                    "\2\3q\3\3\2\2\2rs\5\6\4\2s\5\3\2\2\2tu\5\b\5\2u\7\3\2\2\2vx\5\30\r\2w" +
                    "y\5\36\20\2xw\3\2\2\2xy\3\2\2\2y{\3\2\2\2z|\5$\23\2{z\3\2\2\2{|\3\2\2" +
                    "\2|~\3\2\2\2}\177\7\u01b1\2\2~}\3\2\2\2~\177\3\2\2\2\177\t\3\2\2\2\u0080" +
                    "\u0081\b\6\1\2\u0081\u00ad\7\62\2\2\u0082\u00ad\7n\2\2\u0083\u00ad\7\u0196" +
                    "\2\2\u0084\u00ad\5\\/\2\u0085\u00ad\5<\37\2\u0086\u0087\7\24\2\2\u0087" +
                    "\u0089\5\n\6\2\u0088\u008a\5> \2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2" +
                    "\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008e" +
                    "\7<\2\2\u008e\u0090\5\n\6\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090" +
                    "\u0091\3\2\2\2\u0091\u0092\7=\2\2\u0092\u00ad\3\2\2\2\u0093\u0095\7\24" +
                    "\2\2\u0094\u0096\5@!\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095" +
                    "\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u009a\7<\2\2\u009a" +
                    "\u009c\5\n\6\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2" +
                    "\2\2\u009d\u009e\7=\2\2\u009e\u00ad\3\2\2\2\u009f\u00ad\5T+\2\u00a0\u00a1" +
                    "\7\u01ae\2\2\u00a1\u00a2\5\n\6\2\u00a2\u00a3\7\u01af\2\2\u00a3\u00ad\3" +
                    "\2\2\2\u00a4\u00a5\7\u01ae\2\2\u00a5\u00a6\5\16\b\2\u00a6\u00a7\7\u01af" +
                    "\2\2\u00a7\u00ad\3\2\2\2\u00a8\u00a9\7\u01b8\2\2\u00a9\u00ad\5\n\6\7\u00aa" +
                    "\u00ab\t\2\2\2\u00ab\u00ad\5\n\6\5\u00ac\u0080\3\2\2\2\u00ac\u0082\3\2" +
                    "\2\2\u00ac\u0083\3\2\2\2\u00ac\u0084\3\2\2\2\u00ac\u0085\3\2\2\2\u00ac" +
                    "\u0086\3\2\2\2\u00ac\u0093\3\2\2\2\u00ac\u009f\3\2\2\2\u00ac\u00a0\3\2" +
                    "\2\2\u00ac\u00a4\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad" +
                    "\u00bd\3\2\2\2\u00ae\u00af\f\6\2\2\u00af\u00b0\t\3\2\2\u00b0\u00bc\5\n" +
                    "\6\7\u00b1\u00b2\f\4\2\2\u00b2\u00b3\t\4\2\2\u00b3\u00bc\5\n\6\5\u00b4" +
                    "\u00b5\f\3\2\2\u00b5\u00b6\5f\64\2\u00b6\u00b7\5\n\6\4\u00b7\u00bc\3\2" +
                    "\2\2\u00b8\u00b9\f\r\2\2\u00b9\u00ba\7\34\2\2\u00ba\u00bc\5b\62\2\u00bb" +
                    "\u00ae\3\2\2\2\u00bb\u00b1\3\2\2\2\u00bb\u00b4\3\2\2\2\u00bb\u00b8\3\2" +
                    "\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be" +
                    "\13\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c9\7n\2\2\u00c1\u00c9\5\\/\2" +
                    "\u00c2\u00c9\5<\37\2\u00c3\u00c9\7\u0196\2\2\u00c4\u00c5\7\u01ae\2\2\u00c5" +
                    "\u00c6\5\f\7\2\u00c6\u00c7\7\u01af\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c0" +
                    "\3\2\2\2\u00c8\u00c1\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8" +
                    "\u00c4\3\2\2\2\u00c9\r\3\2\2\2\u00ca\u00cb\5\b\5\2\u00cb\17\3\2\2\2\u00cc" +
                    "\u00d1\5\22\n\2\u00cd\u00ce\7z\2\2\u00ce\u00d0\5\22\n\2\u00cf\u00cd\3" +
                    "\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2" +
                    "\21\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d9\5\24\13\2\u00d5\u00d6\7\6" +
                    "\2\2\u00d6\u00d8\5\24\13\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9" +
                    "\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\23\3\2\2\2\u00db\u00d9\3\2\2" +
                    "\2\u00dc\u00de\7m\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df" +
                    "\3\2\2\2\u00df\u00e0\5\26\f\2\u00e0\25\3\2\2\2\u00e1\u00e2\7B\2\2\u00e2" +
                    "\u00e3\7\u01ae\2\2\u00e3\u00e4\5\16\b\2\u00e4\u00e5\7\u01af\2\2\u00e5" +
                    "\u0119\3\2\2\2\u00e6\u00e7\5\n\6\2\u00e7\u00e8\5f\64\2\u00e8\u00e9\5\n" +
                    "\6\2\u00e9\u0119\3\2\2\2\u00ea\u00eb\5\n\6\2\u00eb\u00ec\5f\64\2\u00ec" +
                    "\u00ed\t\5\2\2\u00ed\u00ee\7\u01ae\2\2\u00ee\u00ef\5\16\b\2\u00ef\u00f0" +
                    "\7\u01af\2\2\u00f0\u0119\3\2\2\2\u00f1\u00f3\5\n\6\2\u00f2\u00f4\7m\2" +
                    "\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6" +
                    "\7\r\2\2\u00f6\u00f7\5\n\6\2\u00f7\u00f8\7\6\2\2\u00f8\u00f9\5\n\6\2\u00f9" +
                    "\u0119\3\2\2\2\u00fa\u00fc\5\n\6\2\u00fb\u00fd\7m\2\2\u00fc\u00fb\3\2" +
                    "\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7Y\2\2\u00ff" +
                    "\u0102\7\u01ae\2\2\u0100\u0103\5\16\b\2\u0101\u0103\5J&\2\u0102\u0100" +
                    "\3\2\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\7\u01af\2" +
                    "\2\u0105\u0119\3\2\2\2\u0106\u0108\5\n\6\2\u0107\u0109\7m\2\2\u0108\u0107" +
                    "\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\7d\2\2\u010b" +
                    "\u010e\5\n\6\2\u010c\u010d\7?\2\2\u010d\u010f\5\n\6\2\u010e\u010c\3\2" +
                    "\2\2\u010e\u010f\3\2\2\2\u010f\u0119\3\2\2\2\u0110\u0111\5\n\6\2\u0111" +
                    "\u0112\7_\2\2\u0112\u0113\5V,\2\u0113\u0119\3\2\2\2\u0114\u0115\7\u01ae" +
                    "\2\2\u0115\u0116\5\20\t\2\u0116\u0117\7\u01af\2\2\u0117\u0119\3\2\2\2" +
                    "\u0118\u00e1\3\2\2\2\u0118\u00e6\3\2\2\2\u0118\u00ea\3\2\2\2\u0118\u00f1" +
                    "\3\2\2\2\u0118\u00fa\3\2\2\2\u0118\u0106\3\2\2\2\u0118\u0110\3\2\2\2\u0118" +
                    "\u0114\3\2\2\2\u0119\27\3\2\2\2\u011a\u0120\5\34\17\2\u011b\u011c\7\u01ae" +
                    "\2\2\u011c\u011d\5\30\r\2\u011d\u011e\7\u01af\2\2\u011e\u0120\3\2\2\2" +
                    "\u011f\u011a\3\2\2\2\u011f\u011b\3\2\2\2\u0120\u0124\3\2\2\2\u0121\u0123" +
                    "\5\32\16\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2" +
                    "\u0124\u0125\3\2\2\2\u0125\31\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0129" +
                    "\7\u00b3\2\2\u0128\u012a\7\4\2\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2" +
                    "\2\u012a\u012e\3\2\2\2\u012b\u012e\7@\2\2\u012c\u012e\7]\2\2\u012d\u0127" +
                    "\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\u0134\3\2\2\2\u012f" +
                    "\u0135\5\34\17\2\u0130\u0131\7\u01ae\2\2\u0131\u0132\5\30\r\2\u0132\u0133" +
                    "\7\u01af\2\2\u0133\u0135\3\2\2\2\u0134\u012f\3\2\2\2\u0134\u0130\3\2\2" +
                    "\2\u0135\33\3\2\2\2\u0136\u0138\7\u009c\2\2\u0137\u0139\t\6\2\2\u0138" +
                    "\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013d\5(" +
                    "\25\2\u013b\u013c\7^\2\2\u013c\u013e\5P)\2\u013d\u013b\3\2\2\2\u013d\u013e" +
                    "\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u0140\7N\2\2\u0140\u0142\5,\27\2\u0141" +
                    "\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0144\7\u00bf" +
                    "\2\2\u0144\u0146\5\20\t\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146" +
                    "\u0151\3\2\2\2\u0147\u0148\7S\2\2\u0148\u0149\7\21\2\2\u0149\u014e\5\"" +
                    "\22\2\u014a\u014b\7\u01b0\2\2\u014b\u014d\5\"\22\2\u014c\u014a\3\2\2\2" +
                    "\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0152" +
                    "\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0147\3\2\2\2\u0151\u0152\3\2\2\2\u0152" +
                    "\u0155\3\2\2\2\u0153\u0154\7T\2\2\u0154\u0156\5\20\t\2\u0155\u0153\3\2" +
                    "\2\2\u0155\u0156\3\2\2\2\u0156\35\3\2\2\2\u0157\u0158\7{\2\2\u0158\u0159" +
                    "\7\21\2\2\u0159\u015e\5 \21\2\u015a\u015b\7\u01b0\2\2\u015b\u015d\5 \21" +
                    "\2\u015c\u015a\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f" +
                    "\3\2\2\2\u015f\u016c\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7\u0141\2" +
                    "\2\u0162\u0163\5\n\6\2\u0163\u016a\t\7\2\2\u0164\u0165\7E\2\2\u0165\u0166" +
                    "\t\b\2\2\u0166\u0167\5\n\6\2\u0167\u0168\t\7\2\2\u0168\u0169\7\u0143\2" +
                    "\2\u0169\u016b\3\2\2\2\u016a\u0164\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d" +
                    "\3\2\2\2\u016c\u0161\3\2\2\2\u016c\u016d\3\2\2\2\u016d\37\3\2\2\2\u016e" +
                    "\u0170\5\n\6\2\u016f\u0171\t\t\2\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2" +
                    "\2\2\u0171!\3\2\2\2\u0172\u0173\5\n\6\2\u0173#\3\2\2\2\u0174\u0175\7y" +
                    "\2\2\u0175\u0176\7\u01ae\2\2\u0176\u017b\5&\24\2\u0177\u0178\7\u01b0\2" +
                    "\2\u0178\u017a\5&\24\2\u0179\u0177\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179" +
                    "\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e" +
                    "\u017f\7\u01af\2\2\u017f%\3\2\2\2\u0180\u0181\7\u0101\2\2\u0181\u01a1" +
                    "\7\u0197\2\2\u0182\u0183\t\n\2\2\u0183\u01a1\7S\2\2\u0184\u0185\t\13\2" +
                    "\2\u0185\u01a1\7\u00b3\2\2\u0186\u0187\t\f\2\2\u0187\u01a1\7`\2\2\u0188" +
                    "\u0189\7\u0100\2\2\u0189\u01a1\7\u018b\2\2\u018a\u018b\7\u0108\2\2\u018b" +
                    "\u01a1\7{\2\2\u018c\u01a1\7\u0115\2\2\u018d\u018e\7\u011e\2\2\u018e\u01a1" +
                    "\7\u0081\2\2\u018f\u0190\7\u011f\2\2\u0190\u01a1\7\u0081\2\2\u0191\u0192" +
                    "\7\u0129\2\2\u0192\u01a1\7\u0197\2\2\u0193\u0194\7\u012a\2\2\u0194\u01a1" +
                    "\7\u0197\2\2\u0195\u0196\7\u0145\2\2\u0196\u0197\7I\2\2\u0197\u01a1\7" +
                    "\u0186\2\2\u0198\u0199\7\u014a\2\2\u0199\u01a1\t\r\2\2\u019a\u01a1\7\u0157" +
                    "\2\2\u019b\u019c\7\u015e\2\2\u019c\u01a1\7\u0081\2\2\u019d\u019e\7\u00b8" +
                    "\2\2\u019e\u019f\7\u0081\2\2\u019f\u01a1\7\u0199\2\2\u01a0\u0180\3\2\2" +
                    "\2\u01a0\u0182\3\2\2\2\u01a0\u0184\3\2\2\2\u01a0\u0186\3\2\2\2\u01a0\u0188" +
                    "\3\2\2\2\u01a0\u018a\3\2\2\2\u01a0\u018c\3\2\2\2\u01a0\u018d\3\2\2\2\u01a0" +
                    "\u018f\3\2\2\2\u01a0\u0191\3\2\2\2\u01a0\u0193\3\2\2\2\u01a0\u0195\3\2" +
                    "\2\2\u01a0\u0198\3\2\2\2\u01a0\u019a\3\2\2\2\u01a0\u019b\3\2\2\2\u01a0" +
                    "\u019d\3\2\2\2\u01a1\'\3\2\2\2\u01a2\u01a7\5*\26\2\u01a3\u01a4\7\u01b0" +
                    "\2\2\u01a4\u01a6\5*\26\2\u01a5\u01a3\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7" +
                    "\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8)\3\2\2\2\u01a9\u01a7\3\2\2\2" +
                    "\u01aa\u01ab\5P)\2\u01ab\u01ac\7\u01a9\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01aa" +
                    "\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b2\3\2\2\2\u01af\u01b3\7\u01b3\2" +
                    "\2\u01b0\u01b1\7\u01ad\2\2\u01b1\u01b3\t\16\2\2\u01b2\u01af\3\2\2\2\u01b2" +
                    "\u01b0\3\2\2\2\u01b3\u01c0\3\2\2\2\u01b4\u01b5\5H%\2\u01b5\u01b6\7\u019d" +
                    "\2\2\u01b6\u01b7\5\n\6\2\u01b7\u01c0\3\2\2\2\u01b8\u01bd\5\n\6\2\u01b9" +
                    "\u01bb\7\b\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2" +
                    "\2\2\u01bc\u01be\5H%\2\u01bd\u01ba\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0" +
                    "\3\2\2\2\u01bf\u01ad\3\2\2\2\u01bf\u01b4\3\2\2\2\u01bf\u01b8\3\2\2\2\u01c0" +
                    "+\3\2\2\2\u01c1\u01c6\5.\30\2\u01c2\u01c3\7\u01b0\2\2\u01c3\u01c5\5.\30" +
                    "\2\u01c4\u01c2\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7" +
                    "\3\2\2\2\u01c7-\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01cf\5\60\31\2\u01ca" +
                    "\u01cb\7\u01ae\2\2\u01cb\u01cc\5\60\31\2\u01cc\u01cd\7\u01af\2\2\u01cd" +
                    "\u01cf\3\2\2\2\u01ce\u01c9\3\2\2\2\u01ce\u01ca\3\2\2\2\u01cf/\3\2\2\2" +
                    "\u01d0\u01d4\5\62\32\2\u01d1\u01d3\5\66\34\2\u01d2\u01d1\3\2\2\2\u01d3" +
                    "\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\61\3\2\2" +
                    "\2\u01d6\u01d4\3\2\2\2\u01d7\u01d9\58\35\2\u01d8\u01da\5B\"\2\u01d9\u01d8" +
                    "\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01f7\3\2\2\2\u01db\u01e0\5:\36\2\u01dc" +
                    "\u01de\5B\"\2\u01dd\u01df\5F$\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2" +
                    "\2\u01df\u01e1\3\2\2\2\u01e0\u01dc\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01f7" +
                    "\3\2\2\2\u01e2\u01e3\5\64\33\2\u01e3\u01e4\5B\"\2\u01e4\u01f7\3\2\2\2" +
                    "\u01e5\u01e7\5<\37\2\u01e6\u01e8\5B\"\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8" +
                    "\3\2\2\2\u01e8\u01f7\3\2\2\2\u01e9\u01eb\7\u0196\2\2\u01ea\u01ec\5B\"" +
                    "\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01f7\3\2\2\2\u01ed\u01ee" +
                    "\7\u0196\2\2\u01ee\u01ef\7\u01a9\2\2\u01ef\u01f4\5<\37\2\u01f0\u01f2\5" +
                    "B\"\2\u01f1\u01f3\5F$\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3" +
                    "\u01f5\3\2\2\2\u01f4\u01f0\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2" +
                    "\2\2\u01f6\u01d7\3\2\2\2\u01f6\u01db\3\2\2\2\u01f6\u01e2\3\2\2\2\u01f6" +
                    "\u01e5\3\2\2\2\u01f6\u01e9\3\2\2\2\u01f6\u01ed\3\2\2\2\u01f7\63\3\2\2" +
                    "\2\u01f8\u01f9\7\25\2\2\u01f9\u01fa\7\u01ae\2\2\u01fa\u01fb\7\26\2\2\u01fb" +
                    "\u01fc\5P)\2\u01fc\u01fd\7\u01b0\2\2\u01fd\u01fe\t\17\2\2\u01fe\u01ff" +
                    "\7\u01af\2\2\u01ff\65\3\2\2\2\u0200\u0202\7[\2\2\u0201\u0200\3\2\2\2\u0201" +
                    "\u0202\3\2\2\2\u0202\u0208\3\2\2\2\u0203\u0205\t\20\2\2\u0204\u0206\7" +
                    "|\2\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0208\3\2\2\2\u0207" +
                    "\u0201\3\2\2\2\u0207\u0203\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u020b\t\21" +
                    "\2\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c" +
                    "\u020d\7`\2\2\u020d\u020e\5.\30\2\u020e\u020f\7s\2\2\u020f\u0210\5\20" +
                    "\t\2\u0210\u021b\3\2\2\2\u0211\u0212\7\'\2\2\u0212\u0213\7`\2\2\u0213" +
                    "\u021b\5.\30\2\u0214\u0215\7\'\2\2\u0215\u0216\7\u00cc\2\2\u0216\u021b" +
                    "\5.\30\2\u0217\u0218\7|\2\2\u0218\u0219\7\u00cc\2\2\u0219\u021b\5.\30" +
                    "\2\u021a\u0207\3\2\2\2\u021a\u0211\3\2\2\2\u021a\u0214\3\2\2\2\u021a\u0217" +
                    "\3\2\2\2\u021b\67\3\2\2\2\u021c\u021e\5P)\2\u021d\u021c\3\2\2\2\u021d" +
                    "\u021e\3\2\2\2\u021e9\3\2\2\2\u021f\u0225\5\16\b\2\u0220\u0221\7\u01ae" +
                    "\2\2\u0221\u0222\5\16\b\2\u0222\u0223\7\u01af\2\2\u0223\u0225\3\2\2\2" +
                    "\u0224\u021f\3\2\2\2\u0224\u0220\3\2\2\2\u0225;\3\2\2\2\u0226\u0287\5" +
                    "L\'\2\u0227\u0228\5X-\2\u0228\u022a\7\u01ae\2\2\u0229\u022b\5J&\2\u022a" +
                    "\u0229\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\7\u01af" +
                    "\2\2\u022d\u0287\3\2\2\2\u022e\u022f\7\u00d7\2\2\u022f\u0230\7\u01ae\2" +
                    "\2\u0230\u0231\7\u01b3\2\2\u0231\u0287\7\u01af\2\2\u0232\u0233\7\u00da" +
                    "\2\2\u0233\u0234\7\u01ae\2\2\u0234\u0235\5\n\6\2\u0235\u0236\7\b\2\2\u0236" +
                    "\u0237\5Z.\2\u0237\u0238\7\u01af\2\2\u0238\u0287\3\2\2\2\u0239\u023a\7" +
                    "%\2\2\u023a\u023b\7\u01ae\2\2\u023b\u023c\5Z.\2\u023c\u023d\7\u01b0\2" +
                    "\2\u023d\u0240\5\n\6\2\u023e\u023f\7\u01b0\2\2\u023f\u0241\5\n\6\2\u0240" +
                    "\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\7\u01af" +
                    "\2\2\u0243\u0287\3\2\2\2\u0244\u0245\7\u00de\2\2\u0245\u0246\7\u01ae\2" +
                    "\2\u0246\u0247\7\u01b3\2\2\u0247\u0287\7\u01af\2\2\u0248\u0249\7\33\2" +
                    "\2\u0249\u024a\7\u01ae\2\2\u024a\u024b\5J&\2\u024b\u024c\7\u01af\2\2\u024c" +
                    "\u0287\3\2\2\2\u024d\u0287\7+\2\2\u024e\u0287\7,\2\2\u024f\u0250\7\u00ea" +
                    "\2\2\u0250\u0251\7\u01ae\2\2\u0251\u0252\7\u0198\2\2\u0252\u0253\7\u01b0" +
                    "\2\2\u0253\u0254\5\n\6\2\u0254\u0255\7\u01b0\2\2\u0255\u0256\5\n\6\2\u0256" +
                    "\u0257\7\u01af\2\2\u0257\u0287\3\2\2\2\u0258\u0259\7\u00eb\2\2\u0259\u025a" +
                    "\7\u01ae\2\2\u025a\u025b\7\u0198\2\2\u025b\u025c\7\u01b0\2\2\u025c\u025d" +
                    "\5\n\6\2\u025d\u025e\7\u01b0\2\2\u025e\u025f\5\n\6\2\u025f\u0260\7\u01af" +
                    "\2\2\u0260\u0287\3\2\2\2\u0261\u0262\7\u00ec\2\2\u0262\u0263\7\u01ae\2" +
                    "\2\u0263\u0264\7\u0198\2\2\u0264\u0265\7\u01b0\2\2\u0265\u0266\5\n\6\2" +
                    "\u0266\u0267\7\u01af\2\2\u0267\u0287\3\2\2\2\u0268\u0269\7\u00ed\2\2\u0269" +
                    "\u026a\7\u01ae\2\2\u026a\u026b\7\u0198\2\2\u026b\u026c\7\u01b0\2\2\u026c" +
                    "\u026d\5\n\6\2\u026d\u026e\7\u01af\2\2\u026e\u0287\3\2\2\2\u026f\u0270" +
                    "\7U\2\2\u0270\u0271\7\u01ae\2\2\u0271\u0274\5Z.\2\u0272\u0273\7\u01b0" +
                    "\2\2\u0273\u0275\7\u0197\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275" +
                    "\u0278\3\2\2\2\u0276\u0277\7\u01b0\2\2\u0277\u0279\7\u0197\2\2\u0278\u0276" +
                    "\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027b\7\u01af\2" +
                    "\2\u027b\u0287\3\2\2\2\u027c\u0287\7\u0130\2\2\u027d\u027e\7o\2\2\u027e" +
                    "\u027f\7\u01ae\2\2\u027f\u0280\5\n\6\2\u0280\u0281\7\u01b0\2\2\u0281\u0282" +
                    "\5\n\6\2\u0282\u0283\7\u01af\2\2\u0283\u0287\3\2\2\2\u0284\u0287\7\u00a0" +
                    "\2\2\u0285\u0287\7\u00a6\2\2\u0286\u0226\3\2\2\2\u0286\u0227\3\2\2\2\u0286" +
                    "\u022e\3\2\2\2\u0286\u0232\3\2\2\2\u0286\u0239\3\2\2\2\u0286\u0244\3\2" +
                    "\2\2\u0286\u0248\3\2\2\2\u0286\u024d\3\2\2\2\u0286\u024e\3\2\2\2\u0286" +
                    "\u024f\3\2\2\2\u0286\u0258\3\2\2\2\u0286\u0261\3\2\2\2\u0286\u0268\3\2" +
                    "\2\2\u0286\u026f\3\2\2\2\u0286\u027c\3\2\2\2\u0286\u027d\3\2\2\2\u0286" +
                    "\u0284\3\2\2\2\u0286\u0285\3\2\2\2\u0287=\3\2\2\2\u0288\u0289\7\u00be" +
                    "\2\2\u0289\u028a\5\n\6\2\u028a\u028b\7\u00aa\2\2\u028b\u028c\5\n\6\2\u028c" +
                    "?\3\2\2\2\u028d\u028e\7\u00be\2\2\u028e\u028f\5\20\t\2\u028f\u0290\7\u00aa" +
                    "\2\2\u0290\u0291\5\n\6\2\u0291A\3\2\2\2\u0292\u0294\7\b\2\2\u0293\u0292" +
                    "\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\5D#\2\u0296" +
                    "C\3\2\2\2\u0297\u0299\5b\62\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2" +
                    "\u0299E\3\2\2\2\u029a\u029b\7\u01ae\2\2\u029b\u02a0\5H%\2\u029c\u029d" +
                    "\7\u01b0\2\2\u029d\u029f\5H%\2\u029e\u029c\3\2\2\2\u029f\u02a2\3\2\2\2" +
                    "\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2\u02a0" +
                    "\3\2\2\2\u02a3\u02a4\7\u01af\2\2\u02a4G\3\2\2\2\u02a5\u02a8\5b\62\2\u02a6" +
                    "\u02a8\7\u0199\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a6\3\2\2\2\u02a8I\3\2" +
                    "\2\2\u02a9\u02ae\5\n\6\2\u02aa\u02ab\7\u01b0\2\2\u02ab\u02ad\5\n\6\2\u02ac" +
                    "\u02aa\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2" +
                    "\2\2\u02afK\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b2\t\22\2\2\u02b2\u02b3" +
                    "\7\u01ae\2\2\u02b3\u02b4\5N(\2\u02b4\u02b5\7\u01af\2\2\u02b5\u02cd\3\2" +
                    "\2\2\u02b6\u02b7\t\23\2\2\u02b7\u02ba\7\u01ae\2\2\u02b8\u02bb\7\u01b3" +
                    "\2\2\u02b9\u02bb\5N(\2\u02ba\u02b8\3\2\2\2\u02ba\u02b9\3\2\2\2\u02bb\u02bc" +
                    "\3\2\2\2\u02bc\u02cd\7\u01af\2\2\u02bd\u02be\7\u00df\2\2\u02be\u02bf\7" +
                    "\u01ae\2\2\u02bf\u02c0\5N(\2\u02c0\u02c1\7\u01af\2\2\u02c1\u02cd\3\2\2" +
                    "\2\u02c2\u02c3\7\u010f\2\2\u02c3\u02c4\7\u01ae\2\2\u02c4\u02c5\5\n\6\2" +
                    "\u02c5\u02c6\7\u01af\2\2\u02c6\u02cd\3\2\2\2\u02c7\u02c8\7\u0110\2\2\u02c8" +
                    "\u02c9\7\u01ae\2\2\u02c9\u02ca\5J&\2\u02ca\u02cb\7\u01af\2\2\u02cb\u02cd" +
                    "\3\2\2\2\u02cc\u02b1\3\2\2\2\u02cc\u02b6\3\2\2\2\u02cc\u02bd\3\2\2\2\u02cc" +
                    "\u02c2\3\2\2\2\u02cc\u02c7\3\2\2\2\u02cdM\3\2\2\2\u02ce\u02d0\t\6\2\2" +
                    "\u02cf\u02ce\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2" +
                    "\5\n\6\2\u02d2O\3\2\2\2\u02d3\u02d4\5b\62\2\u02d4Q\3\2\2\2\u02d5\u02d6" +
                    "\5b\62\2\u02d6\u02d8\7\u01a9\2\2\u02d7\u02d9\5b\62\2\u02d8\u02d7\3\2\2" +
                    "\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\7\u01a9\2\2\u02db" +
                    "\u02e0\3\2\2\2\u02dc\u02dd\5b\62\2\u02dd\u02de\7\u01a9\2\2\u02de\u02e0" +
                    "\3\2\2\2\u02df\u02d5\3\2\2\2\u02df\u02dc\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0" +
                    "\u02e1\3\2\2\2\u02e1\u02e2\5b\62\2\u02e2S\3\2\2\2\u02e3\u02e4\5P)\2\u02e4" +
                    "\u02e5\7\u01a9\2\2\u02e5\u02e7\3\2\2\2\u02e6\u02e3\3\2\2\2\u02e6\u02e7" +
                    "\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\5`\61\2\u02e9U\3\2\2\2\u02ea" +
                    "\u02ec\7m\2\2\u02eb\u02ea\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\3\2" +
                    "\2\2\u02ed\u02ee\7n\2\2\u02eeW\3\2\2\2\u02ef\u02f5\5R*\2\u02f0\u02f5\7" +
                    "\u0094\2\2\u02f1\u02f5\7c\2\2\u02f2\u02f5\7\u00d7\2\2\u02f3\u02f5\7\u00de" +
                    "\2\2\u02f4\u02ef\3\2\2\2\u02f4\u02f0\3\2\2\2\u02f4\u02f1\3\2\2\2\u02f4" +
                    "\u02f2\3\2\2\2\u02f4\u02f3\3\2\2\2\u02f5Y\3\2\2\2\u02f6\u02f8\5b\62\2" +
                    "\u02f7\u02f9\7U\2\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u0301" +
                    "\3\2\2\2\u02fa\u02fb\7\u01ae\2\2\u02fb\u02fe\t\24\2\2\u02fc\u02fd\7\u01b0" +
                    "\2\2\u02fd\u02ff\7\u0197\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff" +
                    "\u0300\3\2\2\2\u0300\u0302\7\u01af\2\2\u0301\u02fa\3\2\2\2\u0301\u0302" +
                    "\3\2\2\2\u0302[\3\2\2\2\u0303\u0313\7\u0199\2\2\u0304\u0313\7\u019a\2" +
                    "\2\u0305\u0307\5^\60\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308" +
                    "\3\2\2\2\u0308\u0313\7\u0197\2\2\u0309\u030b\5^\60\2\u030a\u0309\3\2\2" +
                    "\2\u030a\u030b\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u0313\t\25\2\2\u030d" +
                    "\u030f\5^\60\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\3\2" +
                    "\2\2\u0310\u0311\7\u01ad\2\2\u0311\u0313\t\26\2\2\u0312\u0303\3\2\2\2" +
                    "\u0312\u0304\3\2\2\2\u0312\u0306\3\2\2\2\u0312\u030a\3\2\2\2\u0312\u030e" +
                    "\3\2\2\2\u0313]\3\2\2\2\u0314\u0315\t\2\2\2\u0315_\3\2\2\2\u0316\u031b" +
                    "\5d\63\2\u0317\u0318\5d\63\2\u0318\u0319\7\u01a9\2\2\u0319\u031b\3\2\2" +
                    "\2\u031a\u0316\3\2\2\2\u031a\u0317\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031a" +
                    "\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u0320\3\2\2\2\u031e\u0320\5b\62\2\u031f" +
                    "\u031a\3\2\2\2\u031f\u031e\3\2\2\2\u0320a\3\2\2\2\u0321\u0325\5d\63\2" +
                    "\u0322\u0325\7\u0194\2\2\u0323\u0325\7\u0195\2\2\u0324\u0321\3\2\2\2\u0324" +
                    "\u0322\3\2\2\2\u0324\u0323\3\2\2\2\u0325c\3\2\2\2\u0326\u0327\t\27\2\2" +
                    "\u0327e\3\2\2\2\u0328\u0338\7\u019d\2\2\u0329\u0338\7\u019e\2\2\u032a" +
                    "\u0338\7\u019f\2\2\u032b\u032c\7\u019f\2\2\u032c\u0338\7\u019d\2\2\u032d" +
                    "\u032e\7\u019e\2\2\u032e\u0338\7\u019d\2\2\u032f\u0330\7\u019f\2\2\u0330" +
                    "\u0338\7\u019e\2\2\u0331\u0332\7\u01a0\2\2\u0332\u0338\7\u019d\2\2\u0333" +
                    "\u0334\7\u01a0\2\2\u0334\u0338\7\u019e\2\2\u0335\u0336\7\u01a0\2\2\u0336" +
                    "\u0338\7\u019f\2\2\u0337\u0328\3\2\2\2\u0337\u0329\3\2\2\2\u0337\u032a" +
                    "\3\2\2\2\u0337\u032b\3\2\2\2\u0337\u032d\3\2\2\2\u0337\u032f\3\2\2\2\u0337" +
                    "\u0331\3\2\2\2\u0337\u0333\3\2\2\2\u0337\u0335\3\2\2\2\u0338g\3\2\2\2" +
                    "`jnx{~\u008b\u008f\u0097\u009b\u00ac\u00bb\u00bd\u00c8\u00d1\u00d9\u00dd" +
                    "\u00f3\u00fc\u0102\u0108\u010e\u0118\u011f\u0124\u0129\u012d\u0134\u0138" +
                    "\u013d\u0141\u0145\u014e\u0151\u0155\u015e\u016a\u016c\u0170\u017b\u01a0" +
                    "\u01a7\u01ad\u01b2\u01ba\u01bd\u01bf\u01c6\u01ce\u01d4\u01d9\u01de\u01e0" +
                    "\u01e7\u01eb\u01f2\u01f4\u01f6\u0201\u0205\u0207\u020a\u021a\u021d\u0224" +
                    "\u022a\u0240\u0274\u0278\u0286\u0293\u0298\u02a0\u02a7\u02ae\u02ba\u02cc" +
                    "\u02cf\u02d8\u02df\u02e6\u02eb\u02f4\u02f8\u02fe\u0301\u0306\u030a\u030e" +
                    "\u0312\u031a\u031c\u031f\u0324\u0337";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
	}
}