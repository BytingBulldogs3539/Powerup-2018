package Profiles;
public class reverse 
{
  public static final int kNumPoints = 223;
  public static double Points[][] = new double[][] {
      {0,0.338201418017977,10, 0},
      {5.63669020692979E-05,2.98549110343747,10, 4.150238},
      {0.000553948771004941,3.46939668039197,10, 4.002502},
      {0.00113218153862096,3.99680966600917,10, 4.133423},
      {0.00179831645307748,4.56837949594874,10, 3.97937},
      {0.00255971298593837,5.18479313306891,10, 4.139984},
      {0.00342384520466153,5.84666200777729,10, 4.088226},
      {0.00439828876307049,6.55442688538725,10, 4.13031},
      {0.00549069326388726,7.30866812282983,10, 4.103485},
      {0.00670880441850328,8.10972131365166,10, 4.130463},
      {0.00806042495614754,8.95802722316611,10, 4.059174},
      {0.00955342981204422,10.3296276875226,10, 4.126984},
      {0.0112750338689023,11.8341604845129,10, 4.070709},
      {0.0132473939098166,13.4722843718397,10, 4.111938},
      {0.0154927752758612,15.2485246037939,10, 4.094208},
      {0.0180341952464044,17.1594238975705,10, 4.089447},
      {0.0208941004244665,19.2018882910132,10, 4.092926},
      {0.0240944135461238,21.3707232549517,10, 4.082306},
      {0.027656200834958,23.6597446895011,10, 4.078796},
      {0.0315994927319996,26.0634339452282,10, 4.08078},
      {0.0359433994253202,28.5754615939887,10, 4.072052},
      {0.0407059754015447,31.1891788679103,10, 4.043335},
      {0.0459041696486135,33.8978088807865,10, 4.045654},
      {0.0515538057368872,36.6942190746179,10, 4.019196},
      {0.0576695081192344,39.5712214372009,10, 3.98996},
      {0.0642647140823686,42.5211365173489,10, 3.973907},
      {0.0713515701685934,45.5362236730293,10, 3.9263},
      {0.0789409401433604,48.6085089721087,10, 3.884247},
      {0.0870423611736994,51.7297125282233,10, 3.839783},
      {0.0956639761039754,54.8915085618744,10, 3.767181},
      {0.104812557358562,58.0852423927658,10, 3.702698},
      {0.11449343523382,61.3021752031877,10, 3.609924},
      {0.124710466027863,64.5332430990605,10, 3.510132},
      {0.135466000170327,67.7693898351602,10, 3.388672},
      {0.146760906125042,71.0011767234747,10, 3.258728},
      {0.15859443494155,74.2221251831725,10, 3.102417},
      {0.170964785951722,77.429466328467,10, 2.932281},
      {0.183869696369062,80.6204389224278,10, 2.728058},
      {0.197306441288704,83.7922970258358,10, 2.502197},
      {0.211271817752297,86.9425394628562,10, 2.248932},
      {0.225762240358702,90.0686803553661,10, 1.967194},
      {0.240773693458642,93.1685856726073,10, 1.648376},
      {0.256301794895172,96.2403661472064,10, 1.292236},
      {0.272341843809018,99.2825379011451,10, 0.9020691},
      {0.288888932184399,102.29391536178,10, 0.4633484},
      {0.305937912978792,105.274131384035,10, -0.01678837},
      {0.323483623214556,108.223782578659,10, -0.5484322},
      {0.34152089991405,111.145140655814,10, -1.134422},
      {0.360045090023353,114.041632302883,10, -1.774377},
      {0.379052050412258,116.916722451525,10, -2.48324},
      {0.398538147874278,119.774770949526,10, -3.251164},
      {0.418500609699199,122.620527736315,10, -4.095292},
      {0.438937364321918,125.459194033812,10, -5.014512},
      {0.459847232543839,128.296315262444,10, -6.016297},
      {0.481229959403102,131.138194079361,10, -7.102187},
      {0.503086341655516,133.99135495853,10, -8.28161},
      {0.525418227774558,136.862490648742,10, -9.546921},
      {0.548228613562068,139.758898158397,10, -10.83811},
      {0.571521801499413,142.687828602758,10, -12.15485},
      {0.595303113915395,145.656716669627,10, -13.48322},
      {0.619579179818342,148.673379489595,10, -14.82848},
      {0.644358094247272,151.745068177925,10, -16.18397},
      {0.669648972088634,154.879400994957,10, -17.54794},
      {0.695462203038175,158.08317012461,10, -18.91413},
      {0.721809387860469,161.363290132494,10, -20.28495},
      {0.748703274648455,164.725696530681,10, -21.65455},
      {0.776157567602043,168.175024525763,10, -23.01701},
      {0.804186735806718,171.714853782239,10, -24.3728},
      {0.832805885752614,175.346851750664,10, -25.71691},
      {0.862030315151257,179.072639988461,10, -27.04602},
      {0.891875767897426,182.892692724686,10, -28.35888},
      {0.922357860404973,186.806994661628,10, -29.64977},
      {0.953492400309142,190.814383173212,10, -30.91924},
      {0.985294749061924,194.913236702015,10, -32.16066},
      {1.01778033185578,199.101015827923,10, -33.37501},
      {1.05096380899758,203.374263268133,10, -34.55795},
      {1.08485952209188,207.728710961127,10, -35.70715},
      {1.11948092037675,212.150499180262,10, -36.82375},
      {1.15483941339535,216.621530732802,10, -37.90164},
      {1.19094303244624,221.125819510202,10, -38.94215},
      {1.22779725920938,225.64751708332,10, -39.9422},
      {1.26540515322708,230.168663938822,10, -40.90176},
      {1.30376671449934,234.671790090146,10, -41.81752},
      {1.34287862852199,239.137880481863,10, -42.68999},
      {1.38273490369136,243.547415234066,10, -43.51999},
      {1.42332623389959,247.880660298883,10, -44.30277},
      {1.46463961609189,252.11711674287,10, -45.04084},
      {1.50665911515209,256.236147953177,10, -45.72892},
      {1.54936509901705,260.217132614665,10, -46.37213},
      {1.5927346211195,264.038776312889,10, -46.96295},
      {1.63674116542611,267.680518923557,10, -47.50616},
      {1.68135451895662,271.121708536107,10, -47.99616},
      {1.72654153666939,274.341999194209,10, -48.43671},
      {1.77226512161396,277.321809827109,10, -48.8243},
      {1.81848549974037,280.041834722859,10, -49.15976},
      {1.86515907257076,282.48334948255,10, -49.4422},
      {1.9122396920087,284.628486379119,10, -49.67089},
      {1.95967776797265,286.473788129762,10, -49.8461},
      {2.00742345541922,288.024945483165,10, -49.96748},
      {2.05542754670966,289.293003387052,10, -50.03224},
      {2.10364300138104,290.289312743375,10, -50.04198},
      {2.15202469118434,291.028375782662,10, -49.99661},
      {2.2005294000845,291.523195559711,10, -49.892},
      {2.24911646166505,291.789436931125,10, -49.73146},
      {2.29774814157088,291.842703562661,10, -49.51158},
      {2.34638849017991,291.699792341577,10, -49.23179},
      {2.39500512733608,291.378265040705,10, -48.89048},
      {2.4435682225019,290.895714028301,10, -48.48955},
      {2.49205074972035,290.270649535312,10, -48.03053},
      {2.54042925250042,289.522866800455,10, -47.55011},
      {2.58868307893154,288.671365581445,10, -47.05263},
      {2.63679489160732,287.735941116999,10, -46.54087},
      {2.68475092258738,286.737000554293,10, -46.01205},
      {2.73254046347366,285.694553300005,10, -45.46751},
      {2.78015612037225,284.628853524196,10, -44.9068},
      {2.82759432381713,283.560522542004,10, -44.33161},
      {2.87485456388458,282.509692141799,10, -43.73842},
      {2.92193939019319,281.492027180185,10, -43.13028},
      {2.9688546668657,280.517991291845,10, -42.50545},
      {3.01560778779604,279.590919377892,10, -41.86604},
      {3.06220614687809,278.712830736249,10, -41.20933},
      {3.10865841281506,277.886111809913,10, -40.53728},
      {3.15497274438643,277.112445347152,10, -39.84907},
      {3.20115806525726,276.389506095814,10, -39.14581},
      {3.24722304413074,275.711358543827,10, -38.42791},
      {3.29317481993892,275.071761224888,10, -37.69401},
      {3.33902027665199,274.465176367424,10, -36.94532},
      {3.38476451350713,273.88554607767,10, -36.18198},
      {3.43041211981778,273.326965438977,10, -35.40425},
      {3.47596641008813,272.782978817081,10, -34.61403},
      {3.52143044386046,272.247497722794,10, -33.80785},
      {3.56680498602036,271.713515804237,10, -32.99128},
      {3.61209054649155,271.170385854186,10, -32.15937},
      {3.65728559550287,270.605471962921,10, -31.31828},
      {3.7023865635883,270.005709884798,10, -30.46427},
      {3.74738733166323,269.358127160442,10, -29.6019},
      {3.79228050583375,268.649353589978,10, -28.73099},
      {3.8370553777018,267.865743614725,10, -27.85003},
      {3.88169970909815,266.994018821076,10, -26.96626},
      {3.92619871223499,266.019554596814,10, -26.07606},
      {3.97053530466779,264.929347887139,10, -25.18306},
      {4.01469010929529,263.707366690371,10, -24.28998},
      {4.05864145435947,262.336844714677,10, -23.4025},
      {4.10236409863633,260.810347272255,10, -22.5332},
      {4.14583254593998,259.13163760014,10, -21.67471},
      {4.18902130008455,257.302949164216,10, -20.83298},
      {4.23190511984601,255.326377750962,10, -20.00387},
      {4.27445927392407,253.205074688951,10, -19.18884},
      {4.31666030582772,250.941151062375,10, -18.3874},
      {4.35848373921851,248.537391054733,10, -17.60127},
      {4.39990688249102,245.996640040366,10, -16.82573},
      {4.44090627915423,243.322385897505,10, -16.06592},
      {4.48146000248829,240.521818550566,10, -15.32092},
      {4.52154663569707,237.603627099697,10, -14.58829},
      {4.561147311603,234.577494996294,10, -13.86885},
      {4.60024367295227,231.452753844389,10, -13.16411},
      {4.63881889226219,228.239025904532,10, -12.47062},
      {4.67685920159238,224.946040521254,10, -11.78918},
      {4.71434981315505,221.583725909336,10, -11.12221},
      {4.75128052847582,218.162178558387,10, -10.46441},
      {4.78764114908036,214.690944240398,10, -9.817523},
      {4.82342300626547,211.181893979514,10, -9.184755},
      {4.85861998094653,207.64829089163,10, -8.559698},
      {4.89322799373381,204.098181573008,10, -7.945979},
      {4.927243985085,200.531734298475,10, -7.343353},
      {4.96066591530523,196.951167236204,10, -6.7505},
      {4.99349123477591,193.357581821422,10, -6.167861},
      {5.02571739387845,189.752110084785,10, -5.595414},
      {5.0573428628417,186.136526560828,10, -5.029727},
      {5.08836560197079,182.511978577916,10, -4.478884},
      {5.11878459141829,178.879445189588,10, -3.931711},
      {5.14859779148933,175.240241999033,10, -3.400047},
      {5.17780418233646,171.595149189541,10, -2.87285},
      {5.20640325403598,167.946094272763,10, -2.356165},
      {5.23439449666416,164.294408149603,10, -1.850808},
      {5.26177689037357,160.641482911809,10, -1.352937},
      {5.28855043516421,156.988924819092,10, -0.8631687},
      {5.31471513103608,153.337361077624,10, -0.3864178},
      {5.3402714879129,149.687495382135,10, 0.08331299},
      {5.36521950579467,146.040383274721,10, 0.5455322},
      {5.3895596946051,142.396330709613,10, 0.994873},
      {5.41329205434419,138.755674236464,10, 1.437714},
      {5.43641811478311,135.119316420253,10, 1.8685},
      {5.45893787592184,131.486614757098,10, 2.275452},
      {5.48085235760782,127.85819645317,10, 2.648224},
      {5.50216206976478,124.233724958816,10, 2.986511},
      {5.52286803224014,120.613299709161,10, 3.295746},
      {5.5429702450339,116.996568856839,10, 3.576416},
      {5.56246972799351,113.383356478169,10, 3.825623},
      {5.58136648111896,109.773195992949,10, 4.056061},
      {5.5996620341814,106.166056805755,10, 4.253082},
      {5.61735638718083,102.56101340504,10, 4.436462},
      {5.63445005004097,98.95787456941,10, 4.590851},
      {5.65094302276183,95.3551793674145,10, 4.73172},
      {5.66683581526711,91.7512756462085,10, 4.853241},
      {5.68212740770939,88.1452608408117,10, 4.953217},
      {5.69681831001238,84.5350544624565,10, 5.045654},
      {5.71090750232864,80.9197080530283,10, 5.116608},
      {5.72439396481074,77.2976230016725,10, 5.180817},
      {5.73727718753497,73.6668564990252,10, 5.228424},
      {5.74955513080645,70.0266895526447,10, 5.271362},
      {5.76122575493031,66.3812448957873,10, 5.299103},
      {5.77228956983028,62.7396935065136,10, 5.325073},
      {5.78274606558262,59.1111145766147,10, 5.343781},
      {5.79259779180594,55.504545229175,10, 5.348053},
      {5.80184882788996,51.9294623964856,10, 5.35318},
      {5.81050376314816,48.3949682169049,10, 5.355072},
      {5.81856973651257,44.9106505311324,10, 5.359009},
      {5.82605439683896,41.4859289050408,10, 5.341766},
      {5.83296896244911,38.1305288587332,10, 5.343781},
      {5.8393241417411,34.8540955993274,10, 5.328644},
      {5.84513319273158,31.6666625133712,10, 5.317139},
      {5.85041090320835,28.5772399529538,10, 5.304657},
      {5.85517359073039,25.5931306631153,10, 5.308594},
      {5.8594391026278,23.916709911088,10, 5.284668},
      {5.86342517632799,22.2574876112447,10, 5.293915},
      {5.86713487137326,20.6201505999546,10, 5.270142},
      {5.87057175722964,19.0097509464495,10, 5.268158},
      {5.87373991328686,17.4332127774091,10, 5.238831},
      {5.87664545862953,15.9001038552865,10, 5.285889},
      {5.8792955321897,14.4217062423329,10, 5.209137},
      {5.8816993125943,13.0042394143909,10, 5.311035},
      {5.88386648839394,11.6472740794308,10, 5.221252},
  }; 
}; 