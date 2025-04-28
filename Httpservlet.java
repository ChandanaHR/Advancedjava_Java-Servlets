// Compiled from HttpServlet.java (version 1.8 : 52.0, super bit)
public abstract class javax.servlet.http.HttpServlet extends javax.servlet.GenericServlet {
  
  // Field descriptor #396 J
  private static final long serialVersionUID = 1L;
  
  // Field descriptor #401 Ljava/lang/String;
  private static final java.lang.String METHOD_DELETE = "DELETE";
  
  // Field descriptor #401 Ljava/lang/String;
  private static final java.lang.String METHOD_HEAD = "HEAD";
  
  // Field descriptor #401 Ljava/lang/String;
  private static final java.lang.String METHOD_GET = "GET";
  
  // Field descriptor #401 Ljava/lang/String;
  private static final java.lang.String METHOD_OPTIONS = "OPTIONS";
  
  // Field descriptor #401 Ljava/lang/String;
  private static final java.lang.String METHOD_POST = "POST";
  
  // Field descriptor #401 Ljava/lang/String;
  private static final java.lang.String METHOD_PUT = "PUT";
  
  // Field descriptor #401 Ljava/lang/String;
  private static final java.lang.String METHOD_TRACE = "TRACE";
  
  // Field descriptor #401 Ljava/lang/String;
  private static final java.lang.String HEADER_IFMODSINCE = "If-Modified-Since";
  
  // Field descriptor #401 Ljava/lang/String;
  private static final java.lang.String HEADER_LASTMOD = "Last-Modified";
  
  // Field descriptor #401 Ljava/lang/String;
  private static final java.lang.String LSTRING_FILE = "javax.servlet.http.LocalStrings";
  
  // Field descriptor #12 Ljava/util/ResourceBundle;
  private static final java.util.ResourceBundle lStrings;
  
  // Field descriptor #292 Ljava/util/List;
  // Signature: Ljava/util/List<Ljava/lang/String;>;
  private static final java.util.List SENSITIVE_HTTP_HEADERS;
  
  // Method descriptor #6 ()V
  // Stack: 1, Locals: 1
  public HttpServlet();
    0  aload_0 [this]
    1  invokespecial javax.servlet.GenericServlet() [1]
    4  return
      Line numbers:
        [pc: 0, line: 93]
        [pc: 4, line: 95]
      Local variable table:
        [pc: 0, pc: 5] local: this index: 0 type: javax.servlet.http.HttpServlet
  
  // Method descriptor #46 (Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V
  // Stack: 4, Locals: 4
  protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException;
     0  getstatic javax.servlet.http.HttpServlet.lStrings : java.util.ResourceBundle [7]
     3  ldc <String "http.method_get_not_supported"> [13]
     5  invokevirtual java.util.ResourceBundle.getString(java.lang.String) : java.lang.String [15]
     8  astore_3 [msg]
     9  aload_0 [this]
    10  aload_1 [req]
    11  aload_2 [resp]
    12  aload_3 [msg]
    13  invokespecial javax.servlet.http.HttpServlet.sendMethodNotAllowed(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String) : void [21]
    16  return
      Line numbers:
        [pc: 0, line: 139]
        [pc: 9, line: 140]
        [pc: 16, line: 141]
      Local variable table:
        [pc: 0, pc: 17] local: this index: 0 type: javax.servlet.http.HttpServlet
        [pc: 0, pc: 17] local: req index: 1 type: javax.servlet.http.HttpServletRequest
        [pc: 0, pc: 17] local: resp index: 2 type: javax.servlet.http.HttpServletResponse
        [pc: 9, pc: 17] local: msg index: 3 type: java.lang.String
  
  // Method descriptor #315 (Ljavax/servlet/http/HttpServletRequest;)J
  // Stack: 2, Locals: 2
  protected long getLastModified(javax.servlet.http.HttpServletRequest req);
    0  ldc2_w <Long -1> [25]
    3  lreturn
      Line numbers:
        [pc: 0, line: 158]
      Local variable table:
        [pc: 0, pc: 4] local: this index: 0 type: javax.servlet.http.HttpServlet
        [pc: 0, pc: 4] local: req index: 1 type: javax.servlet.http.HttpServletRequest
  
  // Method descriptor #46 (Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V
  // Stack: 4, Locals: 4
  protected void doHead(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException;
     0  getstatic javax.servlet.DispatcherType.INCLUDE : javax.servlet.DispatcherType [27]
     3  aload_1 [req]
     4  invokeinterface javax.servlet.http.HttpServletRequest.getDispatcherType() : javax.servlet.DispatcherType [33] [nargs: 1]
     9  invokevirtual javax.servlet.DispatcherType.equals(java.lang.Object) : boolean [39]
    12  ifeq 24
    15  aload_0 [this]
    16  aload_1 [req]
    17  aload_2 [resp]
    18  invokevirtual javax.servlet.http.HttpServlet.doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse) : void [43]
    21  goto 75
    24  new javax.servlet.http.HttpServlet$NoBodyResponse [47]
    27  dup
    28  aload_2 [resp]
    29  aconst_null
    30  invokespecial javax.servlet.http.HttpServlet$NoBodyResponse(javax.servlet.http.HttpServletResponse, javax.servlet.http.HttpServlet$1) [49]
    33  astore_3 [response]
    34  aload_0 [this]
    35  aload_1 [req]
    36  aload_3 [response]
    37  invokevirtual javax.servlet.http.HttpServlet.doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse) : void [43]
    40  aload_1 [req]
    41  invokeinterface javax.servlet.http.HttpServletRequest.isAsyncStarted() : boolean [52] [nargs: 1]
    46  ifeq 71
    49  aload_1 [req]
    50  invokeinterface javax.servlet.http.HttpServletRequest.getAsyncContext() : javax.servlet.AsyncContext [56] [nargs: 1]
    55  new javax.servlet.http.HttpServlet$NoBodyAsyncContextListener [60]
    58  dup
    59  aload_3 [response]
    60  invokespecial javax.servlet.http.HttpServlet$NoBodyAsyncContextListener(javax.servlet.http.HttpServlet$NoBodyResponse) [62]
    63  invokeinterface javax.servlet.AsyncContext.addListener(javax.servlet.AsyncListener) : void [65] [nargs: 2]
    68  goto 75
    71  aload_3 [response]
    72  invokestatic javax.servlet.http.HttpServlet$NoBodyResponse.access$100(javax.servlet.http.HttpServlet$NoBodyResponse) : void [71]
    75  return
      Line numbers:
        [pc: 0, line: 182]
        [pc: 15, line: 183]
        [pc: 24, line: 185]
        [pc: 34, line: 186]
        [pc: 40, line: 187]
        [pc: 49, line: 188]
        [pc: 71, line: 190]
        [pc: 75, line: 193]
      Local variable table:
        [pc: 34, pc: 75] local: response index: 3 type: javax.servlet.http.HttpServlet.NoBodyResponse
        [pc: 0, pc: 76] local: this index: 0 type: javax.servlet.http.HttpServlet
        [pc: 0, pc: 76] local: req index: 1 type: javax.servlet.http.HttpServletRequest
        [pc: 0, pc: 76] local: resp index: 2 type: javax.servlet.http.HttpServletResponse
      Stack map table: number of frames 3
        [pc: 24, same]
        [pc: 71, append: {javax.servlet.http.HttpServlet$NoBodyResponse}]
        [pc: 75, chop 1 local(s)]
  
  // Method descriptor #46 (Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V
  // Stack: 4, Locals: 4
  protected void doPost(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException;
     0  getstatic javax.servlet.http.HttpServlet.lStrings : java.util.ResourceBundle [7]
     3  ldc <String "http.method_post_not_supported"> [74]
     5  invokevirtual java.util.ResourceBundle.getString(java.lang.String) : java.lang.String [15]
     8  astore_3 [msg]
     9  aload_0 [this]
    10  aload_1 [req]
    11  aload_2 [resp]
    12  aload_3 [msg]
    13  invokespecial javax.servlet.http.HttpServlet.sendMethodNotAllowed(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String) : void [21]
    16  return
      Line numbers:
        [pc: 0, line: 233]
        [pc: 9, line: 234]
        [pc: 16, line: 235]
      Local variable table:
        [pc: 0, pc: 17] local: this index: 0 type: javax.servlet.http.HttpServlet
        [pc: 0, pc: 17] local: req index: 1 type: javax.servlet.http.HttpServletRequest
        [pc: 0, pc: 17] local: resp index: 2 type: javax.servlet.http.HttpServletResponse
        [pc: 9, pc: 17] local: msg index: 3 type: java.lang.String
  
  // Method descriptor #46 (Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V
  // Stack: 4, Locals: 4
  protected void doPut(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException;
     0  getstatic javax.servlet.http.HttpServlet.lStrings : java.util.ResourceBundle [7]
     3  ldc <String "http.method_put_not_supported"> [76]
     5  invokevirtual java.util.ResourceBundle.getString(java.lang.String) : java.lang.String [15]
     8  astore_3 [msg]
     9  aload_0 [this]
    10  aload_1 [req]
    11  aload_2 [resp]
    12  aload_3 [msg]
    13  invokespecial javax.servlet.http.HttpServlet.sendMethodNotAllowed(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String) : void [21]
    16  return
      Line numbers:
        [pc: 0, line: 262]
        [pc: 9, line: 263]
        [pc: 16, line: 264]
      Local variable table:
        [pc: 0, pc: 17] local: this index: 0 type: javax.servlet.http.HttpServlet
        [pc: 0, pc: 17] local: req index: 1 type: javax.servlet.http.HttpServletRequest
        [pc: 0, pc: 17] local: resp index: 2 type: javax.servlet.http.HttpServletResponse
        [pc: 9, pc: 17] local: msg index: 3 type: java.lang.String
  
  // Method descriptor #46 (Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V
  // Stack: 4, Locals: 4
  protected void doDelete(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException;
     0  getstatic javax.servlet.http.HttpServlet.lStrings : java.util.ResourceBundle [7]
     3  ldc <String "http.method_delete_not_supported"> [78]
     5  invokevirtual java.util.ResourceBundle.getString(java.lang.String) : java.lang.String [15]
     8  astore_3 [msg]
     9  aload_0 [this]
    10  aload_1 [req]
    11  aload_2 [resp]
    12  aload_3 [msg]
    13  invokespecial javax.servlet.http.HttpServlet.sendMethodNotAllowed(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String) : void [21]
    16  return
      Line numbers:
        [pc: 0, line: 285]
        [pc: 9, line: 286]
        [pc: 16, line: 287]
      Local variable table:
        [pc: 0, pc: 17] local: this index: 0 type: javax.servlet.http.HttpServlet
        [pc: 0, pc: 17] local: req index: 1 type: javax.servlet.http.HttpServletRequest
        [pc: 0, pc: 17] local: resp index: 2 type: javax.servlet.http.HttpServletResponse
        [pc: 9, pc: 17] local: msg index: 3 type: java.lang.String
  
  // Method descriptor #24 (Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;Ljava/lang/String;)V
  // Stack: 3, Locals: 5
  private void sendMethodNotAllowed(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp, java.lang.String msg) throws java.io.IOException;
     0  aload_1 [req]
     1  invokeinterface javax.servlet.http.HttpServletRequest.getProtocol() : java.lang.String [80] [nargs: 1]
     6  astore 4 [protocol]
     8  aload 4 [protocol]
    10  invokevirtual java.lang.String.length() : int [84]
    13  ifeq 36
    16  aload 4 [protocol]
    18  ldc <String "0.9"> [90]
    20  invokevirtual java.lang.String.endsWith(java.lang.String) : boolean [92]
    23  ifne 36
    26  aload 4 [protocol]
    28  ldc <String "1.0"> [96]
    30  invokevirtual java.lang.String.endsWith(java.lang.String) : boolean [92]
    33  ifeq 49
    36  aload_2 [resp]
    37  sipush 400
    40  aload_3 [msg]
    41  invokeinterface javax.servlet.http.HttpServletResponse.sendError(int, java.lang.String) : void [100] [nargs: 3]
    46  goto 59
    49  aload_2 [resp]
    50  sipush 405
    53  aload_3 [msg]
    54  invokeinterface javax.servlet.http.HttpServletResponse.sendError(int, java.lang.String) : void [100] [nargs: 3]
    59  return
      Line numbers:
        [pc: 0, line: 291]
        [pc: 8, line: 294]
        [pc: 36, line: 295]
        [pc: 49, line: 297]
        [pc: 59, line: 299]
      Local variable table:
        [pc: 0, pc: 60] local: this index: 0 type: javax.servlet.http.HttpServlet
        [pc: 0, pc: 60] local: req index: 1 type: javax.servlet.http.HttpServletRequest
        [pc: 0, pc: 60] local: resp index: 2 type: javax.servlet.http.HttpServletResponse
        [pc: 0, pc: 60] local: msg index: 3 type: java.lang.String
        [pc: 8, pc: 60] local: protocol index: 4 type: java.lang.String
      Stack map table: number of frames 3
        [pc: 36, append: {java.lang.String}]
        [pc: 49, same]
        [pc: 59, same]
  
  // Method descriptor #116 (Ljava/lang/Class;)[Ljava/lang/reflect/Method;
  // Signature: (Ljava/lang/Class<*>;)[Ljava/lang/reflect/Method;
  // Stack: 5, Locals: 4
  private static java.lang.reflect.Method[] getAllDeclaredMethods(java.lang.Class c);
     0  aload_0 [c]
     1  ldc <Class javax.servlet.http.HttpServlet> [8]
     3  invokevirtual java.lang.Object.equals(java.lang.Object) : boolean [104]
     6  ifeq 11
     9  aconst_null
    10  areturn
    11  aload_0 [c]
    12  invokevirtual java.lang.Class.getSuperclass() : java.lang.Class [107]
    15  invokestatic javax.servlet.http.HttpServlet.getAllDeclaredMethods(java.lang.Class) : java.lang.reflect.Method[] [113]
    18  astore_1 [parentMethods]
    19  aload_0 [c]
    20  invokevirtual java.lang.Class.getDeclaredMethods() : java.lang.reflect.Method[] [117]
    23  astore_2 [thisMethods]
    24  aload_1 [parentMethods]
    25  ifnull 63
    28  aload_1 [parentMethods]
    29  arraylength
    30  ifle 63
    33  aload_1 [parentMethods]
    34  arraylength
    35  aload_2 [thisMethods]
    36  arraylength
    37  iadd
    38  anewarray java.lang.reflect.Method [121]
    41  astore_3 [allMethods]
    42  aload_1 [parentMethods]
    43  iconst_0
    44  aload_3 [allMethods]
    45  iconst_0
    46  aload_1 [parentMethods]
    47  arraylength
    48  invokestatic java.lang.System.arraycopy(java.lang.Object, int, java.lang.Object, int, int) : void [123]
    51  aload_2 [thisMethods]
    52  iconst_0
    53  aload_3 [allMethods]
    54  aload_1 [parentMethods]
    55  arraylength
    56  aload_2 [thisMethods]
    57  arraylength
    58  invokestatic java.lang.System.arraycopy(java.lang.Object, int, java.lang.Object, int, int) : void [123]
    61  aload_3 [allMethods]
    62  astore_2 [thisMethods]
    63  aload_2 [thisMethods]
    64  areturn
      Line numbers:
        [pc: 0, line: 304]
        [pc: 9, line: 305]
        [pc: 11, line: 308]
        [pc: 19, line: 309]
        [pc: 24, line: 311]
        [pc: 33, line: 312]
        [pc: 42, line: 313]
        [pc: 51, line: 314]
        [pc: 61, line: 315]
        [pc: 63, line: 318]
      Local variable table:
        [pc: 42, pc: 63] local: allMethods index: 3 type: java.lang.reflect.Method[]
        [pc: 0, pc: 65] local: c index: 0 type: java.lang.Class
        [pc: 19, pc: 65] local: parentMethods index: 1 type: java.lang.reflect.Method[]
        [pc: 24, pc: 65] local: thisMethods index: 2 type: java.lang.reflect.Method[]
      Local variable type table:
        [pc: 0, pc: 65] local: c index: 0 type: java.lang.Class<?>
      Stack map table: number of frames 2
        [pc: 11, same]
        [pc: 63, append: {java.lang.reflect.Method[], java.lang.reflect.Method[]}]
  
  // Method descriptor #46 (Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V
  // Stack: 3, Locals: 14
  protected void doOptions(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException;
      0  aload_0 [this]
      1  invokevirtual java.lang.Object.getClass() : java.lang.Class [129]
      4  invokestatic javax.servlet.http.HttpServlet.getAllDeclaredMethods(java.lang.Class) : java.lang.reflect.Method[] [113]
      7  astore_3 [methods]
      8  iconst_0
      9  istore 4 [ALLOW_GET]
     11  iconst_0
     12  istore 5 [ALLOW_HEAD]
     14  iconst_0
     15  istore 6 [ALLOW_POST]
     17  iconst_0
     18  istore 7 [ALLOW_PUT]
     20  iconst_0
     21  istore 8 [ALLOW_DELETE]
     23  iconst_1
     24  istore 9 [ALLOW_TRACE]
     26  iconst_1
     27  istore 10 [ALLOW_OPTIONS]
     29  aconst_null
     30  astore 11 [clazz]
     32  ldc <String "org.apache.catalina.connector.RequestFacade"> [132]
     34  invokestatic java.lang.Class.forName(java.lang.String) : java.lang.Class [134]
     37  astore 11 [clazz]
     39  aload 11 [clazz]
     41  ldc <String "getAllowTrace"> [138]
     43  aconst_null
     44  checkcast java.lang.Class[] [140]
     47  invokevirtual java.lang.Class.getMethod(java.lang.String, java.lang.Class[]) : java.lang.reflect.Method [142]
     50  astore 12 [getAllowTrace]
     52  aload 12 [getAllowTrace]
     54  aload_1 [req]
     55  aconst_null
     56  checkcast java.lang.Object[] [146]
     59  invokevirtual java.lang.reflect.Method.invoke(java.lang.Object, java.lang.Object[]) : java.lang.Object [148]
     62  checkcast java.lang.Boolean [152]
     65  invokevirtual java.lang.Boolean.booleanValue() : boolean [154]
     68  istore 9 [ALLOW_TRACE]
     70  goto 75
     73  astore 12
     75  iconst_0
     76  istore 12 [i]
     78  iload 12 [i]
     80  aload_3 [methods]
     81  arraylength
     82  if_icmpge 164
     85  aload_3 [methods]
     86  iload 12 [i]
     88  aaload
     89  astore 13 [m]
     91  aload 13 [m]
     93  invokevirtual java.lang.reflect.Method.getName() : java.lang.String [169]
     96  ldc <String "doGet"> [172]
     98  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [173]
    101  ifeq 110
    104  iconst_1
    105  istore 4 [ALLOW_GET]
    107  iconst_1
    108  istore 5 [ALLOW_HEAD]
    110  aload 13 [m]
    112  invokevirtual java.lang.reflect.Method.getName() : java.lang.String [169]
    115  ldc <String "doPost"> [174]
    117  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [173]
    120  ifeq 126
    123  iconst_1
    124  istore 6 [ALLOW_POST]
    126  aload 13 [m]
    128  invokevirtual java.lang.reflect.Method.getName() : java.lang.String [169]
    131  ldc <String "doPut"> [176]
    133  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [173]
    136  ifeq 142
    139  iconst_1
    140  istore 7 [ALLOW_PUT]
    142  aload 13 [m]
    144  invokevirtual java.lang.reflect.Method.getName() : java.lang.String [169]
    147  ldc <String "doDelete"> [178]
    149  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [173]
    152  ifeq 158
    155  iconst_1
    156  istore 8 [ALLOW_DELETE]
    158  iinc 12 1 [i]
    161  goto 78
    164  aconst_null
    165  astore 12 [allow]
    167  iload 4 [ALLOW_GET]
    169  ifeq 176
    172  ldc <String "GET"> [180]
    174  astore 12 [allow]
    176  iload 5 [ALLOW_HEAD]
    178  ifeq 215
    181  aload 12 [allow]
    183  ifnonnull 193
    186  ldc <String "HEAD"> [182]
    188  astore 12 [allow]
    190  goto 215
    193  new java.lang.StringBuilder [184]
    196  dup
    197  invokespecial java.lang.StringBuilder() [186]
    200  aload 12 [allow]
    202  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [187]
    205  ldc <String ", HEAD"> [191]
    207  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [187]
    210  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [193]
    213  astore 12 [allow]
    215  iload 6 [ALLOW_POST]
    217  ifeq 254
    220  aload 12 [allow]
    222  ifnonnull 232
    225  ldc <String "POST"> [196]
    227  astore 12 [allow]
    229  goto 254
    232  new java.lang.StringBuilder [184]
    235  dup
    236  invokespecial java.lang.StringBuilder() [186]
    239  aload 12 [allow]
    241  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [187]
    244  ldc <String ", POST"> [198]
    246  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [187]
    249  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [193]
    252  astore 12 [allow]
    254  iload 7 [ALLOW_PUT]
    256  ifeq 293
    259  aload 12 [allow]
    261  ifnonnull 271
    264  ldc <String "PUT"> [200]
    266  astore 12 [allow]
    268  goto 293
    271  new java.lang.StringBuilder [184]
    274  dup
    275  invokespecial java.lang.StringBuilder() [186]
    278  aload 12 [allow]
    280  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [187]
    283  ldc <String ", PUT"> [202]
    285  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [187]
    288  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [193]
    291  astore 12 [allow]
    293  iload 8 [ALLOW_DELETE]
    295  ifeq 332
    298  aload 12 [allow]
    300  ifnonnull 310
    303  ldc <String "DELETE"> [204]
    305  astore 12 [allow]
    307  goto 332
    310  new java.lang.StringBuilder [184]
    313  dup
    314  invokespecial java.lang.StringBuilder() [186]
    317  aload 12 [allow]
    319  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [187]
    322  ldc <String ", DELETE"> [206]
    324  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [187]
    327  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [193]
    330  astore 12 [allow]
    332  iload 9 [ALLOW_TRACE]
    334  ifeq 371
    337  aload 12 [allow]
    339  ifnonnull 349
    342  ldc <String "TRACE"> [208]
    344  astore 12 [allow]
    346  goto 371
    349  new java.lang.StringBuilder [184]
    352  dup
    353  invokespecial java.lang.StringBuilder() [186]
    356  aload 12 [allow]
    358  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [187]
    361  ldc <String ", TRACE"> [210]
    363  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [187]
    366  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [193]
    369  astore 12 [allow]
    371  iload 10 [ALLOW_OPTIONS]
    373  ifeq 410
    376  aload 12 [allow]
    378  ifnonnull 388
    381  ldc <String "OPTIONS"> [212]
    383  astore 12 [allow]
    385  goto 410
    388  new java.lang.StringBuilder [184]
    391  dup
    392  invokespecial java.lang.StringBuilder() [186]
    395  aload 12 [allow]
    397  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [187]
    400  ldc <String ", OPTIONS"> [214]
    402  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [187]
    405  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [193]
    408  astore 12 [allow]
    410  aload_2 [resp]
    411  ldc <String "Allow"> [216]
    413  aload 12 [allow]
    415  invokeinterface javax.servlet.http.HttpServletResponse.setHeader(java.lang.String, java.lang.String) : void [218] [nargs: 3]
    420  return
      Exception Table:
        [pc: 32, pc: 70] -> 73 when : java.lang.ClassNotFoundException
        [pc: 32, pc: 70] -> 73 when : java.lang.NoSuchMethodException
        [pc: 32, pc: 70] -> 73 when : java.lang.SecurityException
        [pc: 32, pc: 70] -> 73 when : java.lang.IllegalAccessException
        [pc: 32, pc: 70] -> 73 when : java.lang.IllegalArgumentException
        [pc: 32, pc: 70] -> 73 when : java.lang.reflect.InvocationTargetException
      Line numbers:
        [pc: 0, line: 340]
        [pc: 8, line: 342]
        [pc: 11, line: 343]
        [pc: 14, line: 344]
        [pc: 17, line: 345]
        [pc: 20, line: 346]
        [pc: 23, line: 347]
        [pc: 26, line: 348]
        [pc: 29, line: 351]
        [pc: 32, line: 353]
        [pc: 39, line: 354]
        [pc: 52, line: 355]
        [pc: 70, line: 359]
        [pc: 73, line: 356]
        [pc: 75, line: 362]
        [pc: 85, line: 363]
        [pc: 91, line: 365]
        [pc: 104, line: 366]
        [pc: 107, line: 367]
        [pc: 110, line: 369]
        [pc: 123, line: 370]
        [pc: 126, line: 372]
        [pc: 139, line: 373]
        [pc: 142, line: 375]
        [pc: 155, line: 376]
        [pc: 158, line: 362]
        [pc: 164, line: 380]
        [pc: 167, line: 381]
        [pc: 172, line: 382]
        [pc: 176, line: 384]
        [pc: 181, line: 385]
        [pc: 186, line: 386]
        [pc: 193, line: 388]
        [pc: 215, line: 391]
        [pc: 220, line: 392]
        [pc: 225, line: 393]
        [pc: 232, line: 395]
        [pc: 254, line: 398]
        [pc: 259, line: 399]
        [pc: 264, line: 400]
        [pc: 271, line: 402]
        [pc: 293, line: 405]
        [pc: 298, line: 406]
        [pc: 303, line: 407]
        [pc: 310, line: 409]
        [pc: 332, line: 412]
        [pc: 337, line: 413]
        [pc: 342, line: 414]
        [pc: 349, line: 416]
        [pc: 371, line: 419]
        [pc: 376, line: 420]
        [pc: 381, line: 421]
        [pc: 388, line: 423]
        [pc: 410, line: 427]
        [pc: 420, line: 428]
      Local variable table:
        [pc: 52, pc: 70] local: getAllowTrace index: 12 type: java.lang.reflect.Method
        [pc: 91, pc: 158] local: m index: 13 type: java.lang.reflect.Method
        [pc: 78, pc: 164] local: i index: 12 type: int
        [pc: 0, pc: 421] local: this index: 0 type: javax.servlet.http.HttpServlet
        [pc: 0, pc: 421] local: req index: 1 type: javax.servlet.http.HttpServletRequest
        [pc: 0, pc: 421] local: resp index: 2 type: javax.servlet.http.HttpServletResponse
        [pc: 8, pc: 421] local: methods index: 3 type: java.lang.reflect.Method[]
        [pc: 11, pc: 421] local: ALLOW_GET index: 4 type: boolean
        [pc: 14, pc: 421] local: ALLOW_HEAD index: 5 type: boolean
        [pc: 17, pc: 421] local: ALLOW_POST index: 6 type: boolean
        [pc: 20, pc: 421] local: ALLOW_PUT index: 7 type: boolean
        [pc: 23, pc: 421] local: ALLOW_DELETE index: 8 type: boolean
        [pc: 26, pc: 421] local: ALLOW_TRACE index: 9 type: boolean
        [pc: 29, pc: 421] local: ALLOW_OPTIONS index: 10 type: boolean
        [pc: 32, pc: 421] local: clazz index: 11 type: java.lang.Class
        [pc: 167, pc: 421] local: allow index: 12 type: java.lang.String
      Local variable type table:
        [pc: 32, pc: 421] local: clazz index: 11 type: java.lang.Class<?>
      Stack map table: number of frames 21
        [pc: 73, full, stack: {java.lang.Exception}, locals: {javax.servlet.http.HttpServlet, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.reflect.Method[], int, int, int, int, int, int, int, java.lang.Class}]
        [pc: 75, same]
        [pc: 78, append: {int}]
        [pc: 110, append: {java.lang.reflect.Method}]
        [pc: 126, same]
        [pc: 142, same]
        [pc: 158, chop 1 local(s)]
        [pc: 164, chop 1 local(s)]
        [pc: 176, append: {java.lang.String}]
        [pc: 193, same]
        [pc: 215, same]
        [pc: 232, same]
        [pc: 254, same]
        [pc: 271, same]
        [pc: 293, same]
        [pc: 310, same]
        [pc: 332, same]
        [pc: 349, same]
        [pc: 371, same]
        [pc: 388, same]
        [pc: 410, same]
  
  // Method descriptor #46 (Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V
  // Stack: 3, Locals: 10
  protected void doTrace(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException;
      0  ldc <String "\r\n"> [222]
      2  astore 4 [CRLF]
      4  new java.lang.StringBuilder [184]
      7  dup
      8  ldc <String "TRACE "> [224]
     10  invokespecial java.lang.StringBuilder(java.lang.String) [226]
     13  aload_1 [req]
     14  invokeinterface javax.servlet.http.HttpServletRequest.getRequestURI() : java.lang.String [229] [nargs: 1]
     19  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [187]
     22  bipush 32
     24  invokevirtual java.lang.StringBuilder.append(char) : java.lang.StringBuilder [232]
     27  aload_1 [req]
     28  invokeinterface javax.servlet.http.HttpServletRequest.getProtocol() : java.lang.String [80] [nargs: 1]
     33  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [187]
     36  astore 5 [buffer]
     38  aload_1 [req]
     39  invokeinterface javax.servlet.http.HttpServletRequest.getHeaderNames() : java.util.Enumeration [235] [nargs: 1]
     44  astore 6 [reqHeaderNames]
     46  aload 6 [reqHeaderNames]
     48  invokeinterface java.util.Enumeration.hasMoreElements() : boolean [239] [nargs: 1]
     53  ifeq 138
     56  aload 6 [reqHeaderNames]
     58  invokeinterface java.util.Enumeration.nextElement() : java.lang.Object [244] [nargs: 1]
     63  checkcast java.lang.String [85]
     66  astore 7 [headerName]
     68  aload_0 [this]
     69  aload 7 [headerName]
     71  invokespecial javax.servlet.http.HttpServlet.isSensitiveHeader(java.lang.String) : boolean [248]
     74  ifne 135
     77  aload_1 [req]
     78  aload 7 [headerName]
     80  invokeinterface javax.servlet.http.HttpServletRequest.getHeaders(java.lang.String) : java.util.Enumeration [251] [nargs: 2]
     85  astore 8 [headerValues]
     87  aload 8 [headerValues]
     89  invokeinterface java.util.Enumeration.hasMoreElements() : boolean [239] [nargs: 1]
     94  ifeq 135
     97  aload 8 [headerValues]
     99  invokeinterface java.util.Enumeration.nextElement() : java.lang.Object [244] [nargs: 1]
    104  checkcast java.lang.String [85]
    107  astore 9 [headerValue]
    109  aload 5 [buffer]
    111  aload 4 [CRLF]
    113  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [187]
    116  aload 7 [headerName]
    118  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [187]
    121  ldc <String ": "> [255]
    123  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [187]
    126  aload 9 [headerValue]
    128  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [187]
    131  pop
    132  goto 87
    135  goto 46
    138  aload 5 [buffer]
    140  aload 4 [CRLF]
    142  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [187]
    145  pop
    146  aload 5 [buffer]
    148  invokevirtual java.lang.StringBuilder.length() : int [257]
    151  istore_3 [responseLength]
    152  aload_2 [resp]
    153  ldc_w <String "message/http"> [258]
    156  invokeinterface javax.servlet.http.HttpServletResponse.setContentType(java.lang.String) : void [260] [nargs: 2]
    161  aload_2 [resp]
    162  iload_3 [responseLength]
    163  invokeinterface javax.servlet.http.HttpServletResponse.setContentLength(int) : void [263] [nargs: 2]
    168  aload_2 [resp]
    169  invokeinterface javax.servlet.http.HttpServletResponse.getOutputStream() : javax.servlet.ServletOutputStream [267] [nargs: 1]
    174  astore 7 [out]
    176  aload 7 [out]
    178  aload 5 [buffer]
    180  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [193]
    183  invokevirtual javax.servlet.ServletOutputStream.print(java.lang.String) : void [271]
    186  aload 7 [out]
    188  invokevirtual javax.servlet.ServletOutputStream.close() : void [276]
    191  return
      Line numbers:
        [pc: 0, line: 446]
        [pc: 4, line: 447]
        [pc: 14, line: 448]
        [pc: 38, line: 450]
        [pc: 46, line: 452]
        [pc: 56, line: 453]
        [pc: 68, line: 455]
        [pc: 77, line: 456]
        [pc: 87, line: 457]
        [pc: 97, line: 458]
        [pc: 109, line: 459]
        [pc: 132, line: 460]
        [pc: 135, line: 462]
        [pc: 138, line: 464]
        [pc: 146, line: 466]
        [pc: 152, line: 468]
        [pc: 161, line: 469]
        [pc: 168, line: 470]
        [pc: 176, line: 471]
        [pc: 186, line: 472]
        [pc: 191, line: 473]
      Local variable table:
        [pc: 109, pc: 132] local: headerValue index: 9 type: java.lang.String
        [pc: 87, pc: 135] local: headerValues index: 8 type: java.util.Enumeration
        [pc: 68, pc: 135] local: headerName index: 7 type: java.lang.String
        [pc: 0, pc: 192] local: this index: 0 type: javax.servlet.http.HttpServlet
        [pc: 0, pc: 192] local: req index: 1 type: javax.servlet.http.HttpServletRequest
        [pc: 0, pc: 192] local: resp index: 2 type: javax.servlet.http.HttpServletResponse
        [pc: 152, pc: 192] local: responseLength index: 3 type: int
        [pc: 4, pc: 192] local: CRLF index: 4 type: java.lang.String
        [pc: 38, pc: 192] local: buffer index: 5 type: java.lang.StringBuilder
        [pc: 46, pc: 192] local: reqHeaderNames index: 6 type: java.util.Enumeration
        [pc: 176, pc: 192] local: out index: 7 type: javax.servlet.ServletOutputStream
      Local variable type table:
        [pc: 87, pc: 135] local: headerValues index: 8 type: java.util.Enumeration<java.lang.String>
        [pc: 46, pc: 192] local: reqHeaderNames index: 6 type: java.util.Enumeration<java.lang.String>
      Stack map table: number of frames 4
        [pc: 46, full, stack: {}, locals: {javax.servlet.http.HttpServlet, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, _, java.lang.String, java.lang.StringBuilder, java.util.Enumeration}]
        [pc: 87, append: {java.lang.String, java.util.Enumeration}]
        [pc: 135, chop 2 local(s)]
        [pc: 138, same]
  
  // Method descriptor #95 (Ljava/lang/String;)Z
  // Stack: 2, Locals: 5
  private boolean isSensitiveHeader(java.lang.String headerName);
     0  aload_1 [headerName]
     1  getstatic java.util.Locale.ENGLISH : java.util.Locale [279]
     4  invokevirtual java.lang.String.toLowerCase(java.util.Locale) : java.lang.String [285]
     7  astore_2 [lcHeaderName]
     8  getstatic javax.servlet.http.HttpServlet.SENSITIVE_HTTP_HEADERS : java.util.List [289]
    11  invokeinterface java.util.List.iterator() : java.util.Iterator [293] [nargs: 1]
    16  astore_3
    17  aload_3
    18  invokeinterface java.util.Iterator.hasNext() : boolean [299] [nargs: 1]
    23  ifeq 51
    26  aload_3
    27  invokeinterface java.util.Iterator.next() : java.lang.Object [304] [nargs: 1]
    32  checkcast java.lang.String [85]
    35  astore 4 [sensitiveHeaderName]
    37  aload_2 [lcHeaderName]
    38  aload 4 [sensitiveHeaderName]
    40  invokevirtual java.lang.String.startsWith(java.lang.String) : boolean [307]
    43  ifeq 48
    46  iconst_1
    47  ireturn
    48  goto 17
    51  iconst_0
    52  ireturn
      Line numbers:
        [pc: 0, line: 497]
        [pc: 8, line: 498]
        [pc: 37, line: 499]
        [pc: 46, line: 500]
        [pc: 48, line: 502]
        [pc: 51, line: 503]
      Local variable table:
        [pc: 37, pc: 48] local: sensitiveHeaderName index: 4 type: java.lang.String
        [pc: 0, pc: 53] local: this index: 0 type: javax.servlet.http.HttpServlet
        [pc: 0, pc: 53] local: headerName index: 1 type: java.lang.String
        [pc: 8, pc: 53] local: lcHeaderName index: 2 type: java.lang.String
      Stack map table: number of frames 3
        [pc: 17, append: {java.lang.String, java.util.Iterator}]
        [pc: 48, same]
        [pc: 51, chop 1 local(s)]
  
  // Method descriptor #46 (Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V
  // Stack: 6, Locals: 9
  protected void service(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException;
      0  aload_1 [req]
      1  invokeinterface javax.servlet.http.HttpServletRequest.getMethod() : java.lang.String [310] [nargs: 1]
      6  astore_3 [method]
      7  aload_3 [method]
      8  ldc <String "GET"> [180]
     10  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [173]
     13  ifeq 106
     16  aload_0 [this]
     17  aload_1 [req]
     18  invokevirtual javax.servlet.http.HttpServlet.getLastModified(javax.servlet.http.HttpServletRequest) : long [312]
     21  lstore 4 [lastModified]
     23  lload 4 [lastModified]
     25  ldc2_w <Long -1> [25]
     28  lcmp
     29  ifne 41
     32  aload_0 [this]
     33  aload_1 [req]
     34  aload_2 [resp]
     35  invokevirtual javax.servlet.http.HttpServlet.doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse) : void [43]
     38  goto 103
     41  aload_1 [req]
     42  ldc_w <String "If-Modified-Since"> [316]
     45  invokeinterface javax.servlet.http.HttpServletRequest.getDateHeader(java.lang.String) : long [318] [nargs: 2]
     50  lstore 6 [ifModifiedSince]
     52  goto 62
     55  astore 8 [iae]
     57  ldc2_w <Long -1> [25]
     60  lstore 6 [ifModifiedSince]
     62  lload 6 [ifModifiedSince]
     64  lload 4 [lastModified]
     66  ldc2_w <Long 1000> [322]
     69  ldiv
     70  ldc2_w <Long 1000> [322]
     73  lmul
     74  lcmp
     75  ifge 94
     78  aload_0 [this]
     79  aload_2 [resp]
     80  lload 4 [lastModified]
     82  invokespecial javax.servlet.http.HttpServlet.maybeSetLastModified(javax.servlet.http.HttpServletResponse, long) : void [324]
     85  aload_0 [this]
     86  aload_1 [req]
     87  aload_2 [resp]
     88  invokevirtual javax.servlet.http.HttpServlet.doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse) : void [43]
     91  goto 103
     94  aload_2 [resp]
     95  sipush 304
     98  invokeinterface javax.servlet.http.HttpServletResponse.setStatus(int) : void [328] [nargs: 2]
    103  goto 270
    106  aload_3 [method]
    107  ldc <String "HEAD"> [182]
    109  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [173]
    112  ifeq 138
    115  aload_0 [this]
    116  aload_1 [req]
    117  invokevirtual javax.servlet.http.HttpServlet.getLastModified(javax.servlet.http.HttpServletRequest) : long [312]
    120  lstore 4 [lastModified]
    122  aload_0 [this]
    123  aload_2 [resp]
    124  lload 4 [lastModified]
    126  invokespecial javax.servlet.http.HttpServlet.maybeSetLastModified(javax.servlet.http.HttpServletResponse, long) : void [324]
    129  aload_0 [this]
    130  aload_1 [req]
    131  aload_2 [resp]
    132  invokevirtual javax.servlet.http.HttpServlet.doHead(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse) : void [331]
    135  goto 270
    138  aload_3 [method]
    139  ldc <String "POST"> [196]
    141  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [173]
    144  ifeq 156
    147  aload_0 [this]
    148  aload_1 [req]
    149  aload_2 [resp]
    150  invokevirtual javax.servlet.http.HttpServlet.doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse) : void [334]
    153  goto 270
    156  aload_3 [method]
    157  ldc <String "PUT"> [200]
    159  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [173]
    162  ifeq 174
    165  aload_0 [this]
    166  aload_1 [req]
    167  aload_2 [resp]
    168  invokevirtual javax.servlet.http.HttpServlet.doPut(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse) : void [336]
    171  goto 270
    174  aload_3 [method]
    175  ldc <String "DELETE"> [204]
    177  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [173]
    180  ifeq 192
    183  aload_0 [this]
    184  aload_1 [req]
    185  aload_2 [resp]
    186  invokevirtual javax.servlet.http.HttpServlet.doDelete(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse) : void [338]
    189  goto 270
    192  aload_3 [method]
    193  ldc <String "OPTIONS"> [212]
    195  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [173]
    198  ifeq 210
    201  aload_0 [this]
    202  aload_1 [req]
    203  aload_2 [resp]
    204  invokevirtual javax.servlet.http.HttpServlet.doOptions(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse) : void [340]
    207  goto 270
    210  aload_3 [method]
    211  ldc <String "TRACE"> [208]
    213  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [173]
    216  ifeq 228
    219  aload_0 [this]
    220  aload_1 [req]
    221  aload_2 [resp]
    222  invokevirtual javax.servlet.http.HttpServlet.doTrace(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse) : void [343]
    225  goto 270
    228  getstatic javax.servlet.http.HttpServlet.lStrings : java.util.ResourceBundle [7]
    231  ldc_w <String "http.method_not_implemented"> [346]
    234  invokevirtual java.util.ResourceBundle.getString(java.lang.String) : java.lang.String [15]
    237  astore 4 [errMsg]
    239  iconst_1
    240  anewarray java.lang.Object [105]
    243  astore 5 [errArgs]
    245  aload 5 [errArgs]
    247  iconst_0
    248  aload_3 [method]
    249  aastore
    250  aload 4 [errMsg]
    252  aload 5 [errArgs]
    254  invokestatic java.text.MessageFormat.format(java.lang.String, java.lang.Object[]) : java.lang.String [348]
    257  astore 4 [errMsg]
    259  aload_2 [resp]
    260  sipush 501
    263  aload 4 [errMsg]
    265  invokeinterface javax.servlet.http.HttpServletResponse.sendError(int, java.lang.String) : void [100] [nargs: 3]
    270  return
      Exception Table:
        [pc: 41, pc: 52] -> 55 when : java.lang.IllegalArgumentException
      Line numbers:
        [pc: 0, line: 522]
        [pc: 7, line: 524]
        [pc: 16, line: 525]
        [pc: 23, line: 526]
        [pc: 32, line: 529]
        [pc: 41, line: 533]
        [pc: 52, line: 537]
        [pc: 55, line: 534]
        [pc: 57, line: 536]
        [pc: 62, line: 538]
        [pc: 78, line: 542]
        [pc: 85, line: 543]
        [pc: 94, line: 545]
        [pc: 103, line: 549]
        [pc: 115, line: 550]
        [pc: 122, line: 551]
        [pc: 129, line: 552]
        [pc: 135, line: 554]
        [pc: 147, line: 555]
        [pc: 156, line: 557]
        [pc: 165, line: 558]
        [pc: 174, line: 560]
        [pc: 183, line: 561]
        [pc: 192, line: 563]
        [pc: 201, line: 564]
        [pc: 210, line: 566]
        [pc: 219, line: 567]
        [pc: 228, line: 575]
        [pc: 239, line: 576]
        [pc: 245, line: 577]
        [pc: 250, line: 578]
        [pc: 259, line: 580]
        [pc: 270, line: 582]
      Local variable table:
        [pc: 52, pc: 55] local: ifModifiedSince index: 6 type: long
        [pc: 57, pc: 62] local: iae index: 8 type: java.lang.IllegalArgumentException
        [pc: 62, pc: 103] local: ifModifiedSince index: 6 type: long
        [pc: 23, pc: 103] local: lastModified index: 4 type: long
        [pc: 122, pc: 135] local: lastModified index: 4 type: long
        [pc: 239, pc: 270] local: errMsg index: 4 type: java.lang.String
        [pc: 245, pc: 270] local: errArgs index: 5 type: java.lang.Object[]
        [pc: 0, pc: 271] local: this index: 0 type: javax.servlet.http.HttpServlet
        [pc: 0, pc: 271] local: req index: 1 type: javax.servlet.http.HttpServletRequest
        [pc: 0, pc: 271] local: resp index: 2 type: javax.servlet.http.HttpServletResponse
        [pc: 7, pc: 271] local: method index: 3 type: java.lang.String
      Stack map table: number of frames 13
        [pc: 41, append: {java.lang.String, long}]
        [pc: 55, same_locals_1_stack_item, stack: {java.lang.IllegalArgumentException}]
        [pc: 62, append: {long}]
        [pc: 94, same]
        [pc: 103, chop 2 local(s)]
        [pc: 106, same]
        [pc: 138, same]
        [pc: 156, same]
        [pc: 174, same]
        [pc: 192, same]
        [pc: 210, same]
        [pc: 228, same]
        [pc: 270, same]
  
  // Method descriptor #327 (Ljavax/servlet/http/HttpServletResponse;J)V
  // Stack: 4, Locals: 4
  private void maybeSetLastModified(javax.servlet.http.HttpServletResponse resp, long lastModified);
     0  aload_1 [resp]
     1  ldc_w <String "Last-Modified"> [354]
     4  invokeinterface javax.servlet.http.HttpServletResponse.containsHeader(java.lang.String) : boolean [356] [nargs: 2]
     9  ifeq 13
    12  return
    13  lload_2 [lastModified]
    14  lconst_0
    15  lcmp
    16  iflt 29
    19  aload_1 [resp]
    20  ldc_w <String "Last-Modified"> [354]
    23  lload_2 [lastModified]
    24  invokeinterface javax.servlet.http.HttpServletResponse.setDateHeader(java.lang.String, long) : void [359] [nargs: 4]
    29  return
      Line numbers:
        [pc: 0, line: 591]
        [pc: 12, line: 592]
        [pc: 13, line: 594]
        [pc: 19, line: 595]
        [pc: 29, line: 597]
      Local variable table:
        [pc: 0, pc: 30] local: this index: 0 type: javax.servlet.http.HttpServlet
        [pc: 0, pc: 30] local: resp index: 1 type: javax.servlet.http.HttpServletResponse
        [pc: 0, pc: 30] local: lastModified index: 2 type: long
      Stack map table: number of frames 2
        [pc: 13, same]
        [pc: 29, same]
  
  // Method descriptor #478 (Ljavax/servlet/ServletRequest;Ljavax/servlet/ServletResponse;)V
  // Stack: 4, Locals: 6
  public void service(javax.servlet.ServletRequest req, javax.servlet.ServletResponse res) throws javax.servlet.ServletException, java.io.IOException;
     0  aload_1 [req]
     1  checkcast javax.servlet.http.HttpServletRequest [34]
     4  astore_3 [request]
     5  aload_2 [res]
     6  checkcast javax.servlet.http.HttpServletResponse [98]
     9  astore 4 [response]
    11  goto 33
    14  astore 5 [e]
    16  new javax.servlet.ServletException [365]
    19  dup
    20  getstatic javax.servlet.http.HttpServlet.lStrings : java.util.ResourceBundle [7]
    23  ldc_w <String "http.non_http"> [367]
    26  invokevirtual java.util.ResourceBundle.getString(java.lang.String) : java.lang.String [15]
    29  invokespecial javax.servlet.ServletException(java.lang.String) [369]
    32  athrow
    33  aload_0 [this]
    34  aload_3 [request]
    35  aload 4 [response]
    37  invokevirtual javax.servlet.http.HttpServlet.service(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse) : void [370]
    40  return
      Exception Table:
        [pc: 0, pc: 11] -> 14 when : java.lang.ClassCastException
      Line numbers:
        [pc: 0, line: 618]
        [pc: 5, line: 619]
        [pc: 11, line: 622]
        [pc: 14, line: 620]
        [pc: 16, line: 621]
        [pc: 33, line: 623]
        [pc: 40, line: 624]
      Local variable table:
        [pc: 5, pc: 14] local: request index: 3 type: javax.servlet.http.HttpServletRequest
        [pc: 11, pc: 14] local: response index: 4 type: javax.servlet.http.HttpServletResponse
        [pc: 16, pc: 33] local: e index: 5 type: java.lang.ClassCastException
        [pc: 0, pc: 41] local: this index: 0 type: javax.servlet.http.HttpServlet
        [pc: 0, pc: 41] local: req index: 1 type: javax.servlet.ServletRequest
        [pc: 0, pc: 41] local: res index: 2 type: javax.servlet.ServletResponse
        [pc: 33, pc: 41] local: request index: 3 type: javax.servlet.http.HttpServletRequest
        [pc: 33, pc: 41] local: response index: 4 type: javax.servlet.http.HttpServletResponse
      Stack map table: number of frames 2
        [pc: 14, same_locals_1_stack_item, stack: {java.lang.ClassCastException}]
        [pc: 33, append: {javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse}]
  
  // Method descriptor #6 ()V
  // Stack: 4, Locals: 0
  static {};
     0  ldc_w <String "javax.servlet.http.LocalStrings"> [373]
     3  invokestatic java.util.ResourceBundle.getBundle(java.lang.String) : java.util.ResourceBundle [375]
     6  putstatic javax.servlet.http.HttpServlet.lStrings : java.util.ResourceBundle [7]
     9  iconst_5
    10  anewarray java.lang.String [85]
    13  dup
    14  iconst_0
    15  ldc_w <String "authorization"> [379]
    18  aastore
    19  dup
    20  iconst_1
    21  ldc_w <String "cookie"> [381]
    24  aastore
    25  dup
    26  iconst_2
    27  ldc_w <String "x-forwarded"> [383]
    30  aastore
    31  dup
    32  iconst_3
    33  ldc_w <String "forwarded"> [385]
    36  aastore
    37  dup
    38  iconst_4
    39  ldc_w <String "proxy-authorization"> [387]
    42  aastore
    43  invokestatic java.util.Arrays.asList(java.lang.Object[]) : java.util.List [389]
    46  putstatic javax.servlet.http.HttpServlet.SENSITIVE_HTTP_HEADERS : java.util.List [289]
    49  return
      Line numbers:
        [pc: 0, line: 84]
        [pc: 9, line: 86]
        [pc: 43, line: 87]
        [pc: 49, line: 86]

  Inner classes:
    [inner class info: #47 javax/servlet/http/HttpServlet$NoBodyResponse, outer class info: #8 javax/servlet/http/HttpServlet
     inner name: #489 NoBodyResponse, accessflags: 10 private static],
    [inner class info: #490 javax/servlet/http/HttpServlet$1, outer class info: #0
     inner name: #0, accessflags: 4104 static],
    [inner class info: #60 javax/servlet/http/HttpServlet$NoBodyAsyncContextListener, outer class info: #8 javax/servlet/http/HttpServlet
     inner name: #492 NoBodyAsyncContextListener, accessflags: 10 private static],
    [inner class info: #493 javax/servlet/http/HttpServlet$NoBodyPrintWriter, outer class info: #8 javax/servlet/http/HttpServlet
     inner name: #495 NoBodyPrintWriter, accessflags: 10 private static],
    [inner class info: #496 javax/servlet/http/HttpServlet$NoBodyOutputStream, outer class info: #8 javax/servlet/http/HttpServlet
     inner name: #498 NoBodyOutputStream, accessflags: 10 private static]
}
