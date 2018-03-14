package org.usfirst.frc.team3539.robot.profiles;
public class forwardscale implements IProfile
{
  public static final int kNumPoints = 184;
  public static double PointsR[][] = new double[][] {
      {0,66.4783471197043,10},
      {0.0110797241215728,65.7914416278682,10},
      {0.0220449643928842,31.0771747607523,10},
      {0.0272244926432448,2.04945281831633,10},
      {0.0275660698259892,1.08677966375304,10},
      {0.0277471983158687,9.85984739592252,10},
      {0.0293905071712961,0.477102248414691,10},
      {0.0294700234010036,8.14081104400915,10},
      {0.0308268268351834,2.66310091602453,10},
      {0.0312706755935315,8.85556219525204,10},
      {0.0327466039805583,6.72039319190291,10},
      {0.0338666673613015,8.79065209302952,10},
      {0.0353317777963358,12.4521775130225,10},
      {0.0374071394403636,13.5272347077512,10},
      {0.0396616795144291,14.7907243325333,10},
      {0.0421267981649529,17.8072456486693,10},
      {0.0450946737145404,19.4357291094132,10},
      {0.0483339641303589,22.4069749360715,10},
      {0.0520684582001747,25.359169375237,10},
      {0.0562949848358693,26.5121846640137,10},
      {0.0607136849888413,31.536683595169,10},
      {0.065969799399423,33.2514767443476,10},
      {0.0715117101185825,37.3733839244214,10},
      {0.0777406115824496,40.2183261080719,10},
      {0.0844436624280693,43.9478431630531,10},
      {0.0917683023178402,47.6159628528212,10},
      {0.0997043009071786,50.8424605573753,10},
      {0.108178037959361,54.6213662740211,10},
      {0.117281602510757,58.4911136261414,10},
      {0.127030124954173,61.1252227495283,10},
      {0.137217667815736,65.8920164323017,10},
      {0.148199655894146,68.700362665552,10},
      {0.159649722075047,72.0209757158474,10},
      {0.171653214840665,76.0896162643846,10},
      {0.18433482647506,79.4929287431943,10},
      {0.197583648569664,82.9488577008008,10},
      {0.211408445438371,86.4593535954237,10},
      {0.22581834790275,89.7514823068561,10},
      {0.240776928287226,93.3481349127984,10},
      {0.256334955871929,96.7362567640619,10},
      {0.272457660233369,100.397580445484,10},
      {0.28919058393357,103.386095476242,10},
      {0.306421607495133,106.906588425348,10},
      {0.324239362034216,110.234368453494,10},
      {0.342611754226847,113.825169684777,10},
      {0.361582637512734,116.605911197577,10},
      {0.38101694584719,120.276895383829,10},
      {0.401063098902256,123.376318823157,10},
      {0.421625804683213,126.543396391713,10},
      {0.442716377122545,129.571020021989,10},
      {0.464311550950637,132.830044485677,10},
      {0.486449889148632,135.961899073443,10},
      {0.509110198012016,138.80984343298,10},
      {0.532245182115987,142.041087252536,10},
      {0.55591870940617,144.838319698362,10},
      {0.580058434455134,147.862340717574,10},
      {0.604702155358444,150.776723038273,10},
      {0.629831578602733,153.45033467725,10},
      {0.655406675176172,156.34378972858,10},
      {0.681463968365032,159.144464159499,10},
      {0.707988032976855,161.736477805192,10},
      {0.734944130458384,164.530834281251,10},
      {0.762365915774977,166.982965652742,10},
      {0.790196404951197,169.787541000101,10},
      {0.818494302955028,172.127999077446,10},
      {0.847182356343259,174.688132292316,10},
      {0.876297024661697,177.06414225125,10},
      {0.905807712487286,179.549653229292,10},
      {0.935732649592931,181.855614967144,10},
      {0.966041941700689,184.271689632566,10},
      {0.996753882323928,186.310629815715,10},
      {1.02780562336446,188.808531940095,10},
      {1.05927371712038,190.855748185181,10},
      {1.09108301358381,192.151464351508,10},
      {1.12310826274163,193.581907463253,10},
      {1.15537190123742,194.67283316537,10},
      {1.18781732753851,195.682313851317,10},
      {1.22043115614733,196.590095351034,10},
      {1.2531961771384,197.427247316632,10},
      {1.28610066226623,197.992757818646,10},
      {1.31909948328181,198.60324359255,10},
      {1.35220003407905,198.977257341671,10},
      {1.38536292305075,199.331644126903,10},
      {1.41858483569276,199.591154505245,10},
      {1.45184996436984,199.779148082199,10},
      {1.48514658083647,199.921386203976,10},
      {1.51846678127505,199.892106384113,10},
      {1.5517821374383,199.659550573481,10},
      {1.58505873939902,199.405516775866,10},
      {1.61829301769119,198.960047416203,10},
      {1.65145297460152,198.616843258097,10},
      {1.68455582005548,198.490071122674,10},
      {1.71763750367516,198.16632565363,10},
      {1.75066513538078,198.294505178514,10},
      {1.78371431136347,198.471591487149,10},
      {1.81679280795992,198.65814707922,10},
      {1.84990253738407,198.341407962056,10},
      {1.88295948970345,196.613867994747,10},
      {1.91572846260334,193.634118552694,10},
      {1.94800076980232,188.576327976828,10},
      {1.97943017309617,181.715686799807,10},
      {2.00971607245338,173.769611799108,10},
      {2.03867769991608,164.748949052202,10},
      {2.06613594477848,154.969535111273,10},
      {2.09196409099676,144.393584628852,10},
      {2.11602968588529,133.116249370634,10},
      {2.1382158294318,121.457450377782,10},
      {2.15845865369069,109.216634652177,10},
      {2.17666140063653,96.945651839442,10},
      {2.19281909851309,84.8417429831476,10},
      {2.20695928320111,72.8705417743489,10},
      {2.21910439134416,61.6033565477291,10},
      {2.22937170539729,56.3192172076837,10},
      {2.23875812622833,64.6759554498948,10},
      {2.24953765865575,75.5810744400962,10},
      {2.26213430425071,86.9396940885122,10},
      {2.27662429660898,98.2077589335448,10},
      {2.29299233801903,109.177931442014,10},
      {2.3111887109184,119.596935053026,10},
      {2.33112137407608,129.458000529229,10},
      {2.35269777633732,138.430246019152,10},
      {2.37576952990031,146.750701914049,10},
      {2.40022802101322,154.190376770074,10},
      {2.42592639164538,160.847405406673,10},
      {2.45273435628696,166.697280889977,10},
      {2.48051704011465,171.858988820245,10},
      {2.50916022021574,176.246280699888,10},
      {2.53853463092781,179.952625546333,10},
      {2.56852681422371,183.071018147955,10},
      {2.5990386097878,185.613834353377,10},
      {2.62997415196119,187.685312768945,10},
      {2.66125516745323,189.086063022616,10},
      {2.69276947304606,190.103314946019,10},
      {2.72445332827497,190.894650265593,10},
      {2.75626899878487,191.030662218779,10},
      {2.78810761586207,190.970618701036,10},
      {2.81993603446491,188.996678494164,10},
      {2.85143555226992,184.441693100764,10},
      {2.88217579365949,179.520954722468,10},
      {2.91209582274935,174.836275330743,10},
      {2.94123515862763,170.108563476493,10},
      {2.96958666236227,165.561594083933,10},
      {2.99718041945261,160.717359560983,10},
      {3.02396645737433,156.447523510444,10},
      {3.05004115171005,151.799879878325,10},
      {3.07534101695693,147.358128145647,10},
      {3.09990072792778,142.89404175414,10},
      {3.12371646019469,138.573509087601,10},
      {3.14681192521055,134.206930309366,10},
      {3.16917998404331,129.855817517485,10},
      {3.19082242142597,125.655325993298,10},
      {3.21176498850628,121.142317520328,10},
      {3.23195541810319,117.160262019033,10},
      {3.25148218198168,112.687930161013,10},
      {3.2702634373851,108.772947475907,10},
      {3.2883922453919,104.330989224124,10},
      {3.30578089912265,100.057382287694,10},
      {3.32245693445811,96.151524687514,10},
      {3.33848230712996,92.0048352147666,10},
      {3.35381647820266,87.4754505416069,10},
      {3.3683957072115,83.6433355598427,10},
      {3.38233625676409,79.4560842049818,10},
      {3.3955789757092,75.3196747943805,10},
      {3.40813227778817,71.0039456092611,10},
      {3.41996607750165,67.0122066565696,10},
      {3.43113493668743,62.7402365752728,10},
      {3.44159168740163,58.5072756583696,10},
      {3.45134270369073,54.6093613949004,10},
      {3.46044433212551,50.0078709584587,10},
      {3.46877903528908,46.0598911095898,10},
      {3.47645568189513,42.0606792248174,10},
      {3.48346585820232,37.1868206834953,10},
      {3.48966347106558,33.3641979317335,10},
      {3.49522418920561,29.3263631497836,10},
      {3.50011206300031,26.4036091564516,10},
      {3.50451270468287,22.5872947984808,10},
      {3.50827721652778,19.1438659834057,10},
      {3.51146780922857,15.3393834491939,10},
      {3.51402431178658,14.5943915905833,10},
      {3.51645664791935,10.2522633359033,10},
      {3.5181654022969,9.23373405358732,10},
      {3.51970435207651,5.61332218942979,10},
      {3.52064006209824,3.47457328255663,10},
      {3.52121908047953,4.06267396298819,10},
  }; 
  public static double PointsL[][] = new double[][] {
      {0,67.2238734421114,10},
      {0.0112039791858831,64.6244480551838,10},
      {0.0219747204089004,32.9561314767538,10},
      {0.0274674095460884,0.682662408614676,10},
      {0.0275811862755696,5.02399649694237,10},
      {0.0284185188657088,4.54170458952721,10},
      {0.0291754687541987,7.43477719806916,10},
      {0.0304145993229927,0.754176042898536,10},
      {0.030540295519372,8.42741558167933,10},
      {0.0319448644642829,4.72969673232068,10},
      {0.0327331467749495,9.65178130923137,10},
      {0.0343417768338036,10.6655922036482,10},
      {0.036119374897007,10.3990620879292,10},
      {0.0378525538238758,13.0278762909139,10},
      {0.0400238647861653,15.7829960491203,10},
      {0.0426543660398993,17.1062662622285,10},
      {0.0455054093014793,20.1352437399754,10},
      {0.0488612850110046,22.1485028898993,10},
      {0.0525527024780235,24.5093222212862,10},
      {0.0566375898336069,28.9937354469848,10},
      {0.0614698779593129,29.9465916537158,10},
      {0.0664609754528074,34.5335741229882,10},
      {0.0722165681123,37.0571802271607,10},
      {0.0783927721469802,41.1959454853371,10},
      {0.0852587595554775,44.6596609781107,10},
      {0.0927020363851626,48.2278560161852,10},
      {0.100740011750455,52.2743148830084,10},
      {0.109452401070016,55.8085145816422,10},
      {0.118753816023826,59.2832253045758,10},
      {0.128634352937184,64.0158936173606,10},
      {0.139303670133589,66.6498421147764,10},
      {0.150411975877909,71.2601593307692,10},
      {0.162288672924132,75.3767199606643,10},
      {0.174851456397219,78.7663639342248,10},
      {0.187979187544018,82.8369319944144,10},
      {0.201785340326802,86.8704948904203,10},
      {0.216263763790728,90.8636565302838,10},
      {0.231407701446538,95.0829718885051,10},
      {0.2472548557791,99.0119902239364,10},
      {0.263756863710825,103.157394688915,10},
      {0.2809497704745,107.043877737446,10},
      {0.29879040784041,111.604270871871,10},
      {0.317391118377579,115.642201264518,10},
      {0.336664832611234,119.879017204726,10},
      {0.356644663712784,123.862487744337,10},
      {0.377288415494602,128.653738643414,10},
      {0.398730707818123,132.566143664127,10},
      {0.420825065095477,137.053084836655,10},
      {0.443667225504638,141.474077574791,10},
      {0.467246257555909,146.034707823745,10},
      {0.49158536277844,150.370675881214,10},
      {0.516647157389688,154.837638242489,10},
      {0.542453408758344,159.584808785801,10},
      {0.569050902385497,163.957873793723,10},
      {0.596377204485977,168.763634572183,10},
      {0.624504469265818,173.345192090506,10},
      {0.65339534481271,178.041054109357,10},
      {0.683068825785132,182.977151390026,10},
      {0.713565068675841,187.698468800858,10},
      {0.74484812386275,192.520246283287,10},
      {0.776934818828538,197.550914016615,10},
      {0.809859955866929,202.3898861268,10},
      {0.843591601005111,207.576422242876,10},
      {0.878187694325491,212.422752552306,10},
      {0.91359150681449,217.74412269778,10},
      {0.949882140388797,222.856908546585,10},
      {0.98702498397608,228.177467913348,10},
      {1.02505458490821,233.401177468434,10},
      {1.06395475310714,238.833746678997,10},
      {1.10376035460707,244.185742842948,10},
      {1.14445800391042,249.939824056672,10},
      {1.18611469224557,255.280591700362,10},
      {1.22866145242972,261.097393531345,10},
      {1.2721777050819,267.646007286352,10},
      {1.31678532197058,274.031210886829,10},
      {1.36245714965782,280.733138306759,10},
      {1.40924609272932,287.490106892762,10},
      {1.45716107485012,294.338678175388,10},
      {1.50621752121268,301.250581983736,10},
      {1.55642588525322,308.429461453651,10},
      {1.60783078529702,315.582579577354,10},
      {1.66042788699248,322.993433544863,10},
      {1.71426015141281,330.470312435321,10},
      {1.76933854191794,338.103595128431,10},
      {1.82568919209838,345.897870937649,10},
      {1.88333874546839,353.843532900138,10},
      {1.94231269821383,361.740670521663,10},
      {2.00260289155524,369.466351392395,10},
      {2.06418051480256,377.059492890458,10},
      {2.12702376871687,384.728602823963,10},
      {2.19114527391019,392.21557820403,10},
      {2.25651443495945,399.44751013752,10},
      {2.32308905567703,406.882412107548,10},
      {2.39090279102829,413.914953668997,10},
      {2.45988858604436,420.995591235486,10},
      {2.53005459950474,427.896358309842,10},
      {2.60137074591008,434.16976623448,10},
      {2.67373223593642,440.541966780159,10},
      {2.74715589706645,446.867478710258,10},
      {2.82163382548254,452.060592842291,10},
      {2.89697734940919,455.3833475722,10},
      {2.97287439553125,458.168020596862,10},
      {3.04923572719816,461.050048257682,10},
      {3.12607740700701,463.82685825862,10},
      {3.20338209755141,466.671804266698,10},
      {3.28116050722942,469.625364026617,10},
      {3.3594315032186,472.510940756511,10},
      {3.43818335727344,475.689285089606,10},
      {3.51746476710897,478.765471305125,10},
      {3.59725916020437,481.6662845557,10},
      {3.67753696098402,484.596255244444,10},
      {3.75830301372324,487.126527326415,10},
      {3.83949051841502,484.032718147217,10},
      {3.9201627451902,467.910796518684,10},
      {3.99814792893569,450.1468797257,10},
      {4.073172495577,432.648959540746,10},
      {4.14528055351572,415.712312391714,10},
      {4.21456592871586,399.349910737978,10},
      {4.28112423187448,383.67679337022,10},
      {4.34507019582802,368.537321371367,10},
      {4.40649305722706,354.210555595091,10},
      {4.46552845578048,340.320478292061,10},
      {4.52224829073243,327.090894981916,10},
      {4.57676372545337,314.350379509286,10},
      {4.62915532789065,302.132250289876,10},
      {4.67951080492371,290.249936433905,10},
      {4.72788573823775,278.834386352041,10},
      {4.77435814616157,267.7765273611,10},
      {4.81898768977011,256.984634382765,10},
      {4.86181822250309,246.482158808807,10},
      {4.90289869703739,236.14540334382,10},
      {4.94225613933005,226.242062641812,10},
      {4.97996295854896,216.475988305335,10},
      {5.01604261118513,206.72294761908,10},
      {5.05049611708598,197.440479837103,10},
      {5.08340302435147,188.207974380972,10},
      {5.11477098183735,180.831540264399,10},
      {5.14490951324019,176.135540566144,10},
      {5.17426582166029,171.945711546891,10},
      {5.20292302466361,167.612741840881,10},
      {5.23085868560658,163.414086042077,10},
      {5.25809422128533,159.130895089375,10},
      {5.28461637368321,155.23349712367,10},
      {5.3104883733412,150.836001670439,10},
      {5.33562761261705,146.882920034776,10},
      {5.36010803044981,142.782138994321,10},
      {5.38390515050104,138.771782726701,10},
      {5.40703376055854,134.679078877932,10},
      {5.42948060260566,130.653088349132,10},
      {5.45125587511675,126.681175230579,10},
      {5.47236926664245,122.56897444847,10},
      {5.49279783061545,118.826970636454,10},
      {5.51260224795816,114.567024556418,10},
      {5.53169685148602,110.816018041169,10},
      {5.55016577861243,106.533668462601,10},
      {5.56792183238169,102.786256909562,10},
      {5.58505271967322,98.8934023641799,10},
      {5.601534983996,94.6331885741916,10},
      {5.61730692458023,90.6126363818391,10},
      {5.63240933532329,86.9823441082492,10},
      {5.6469064666136,82.6433318061858,10},
      {5.66068001614869,78.659073434431,10},
      {5.67379015492723,74.610182231475,10},
      {5.68622515470372,70.7252748472315,10},
      {5.69801255135891,66.5057070767701,10},
      {5.70909676320757,62.5131879407907,10},
      {5.71951552460482,58.46865658562,10},
      {5.72926067677117,54.0650191012112,10},
      {5.73827153878422,50.28693563656,10},
      {5.74665264500608,45.8312859329599,10},
      {5.75429079237146,41.3149081390259,10},
      {5.76117680225343,37.769005691074,10},
      {5.76747181054674,33.4907253037724,10},
      {5.77305343555919,29.845477604951,10},
      {5.77802774142401,25.478902651144,10},
      {5.78227438614388,22.4355395879201,10},
      {5.78601365676477,19.4099237822813,10},
      {5.78924861282898,17.1754023572604,10},
      {5.79211081465567,12.2774881645621,10},
      {5.79415713853425,11.4292453581077,10},
      {5.79606221354306,7.63854749614215,10},
      {5.7973349831421,6.90460823410969,10},
      {5.79848588097264,5.0693699873846,10},
      {5.79933082457264,0.873471182786346,10},
   }; 
}; 
