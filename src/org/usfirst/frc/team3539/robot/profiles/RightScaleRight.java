package org.usfirst.frc.team3539.robot.profiles;
public class RightScaleRight implements IProfile
{
  public static final int kNumPoints = 428;
  public static double PointsR[][] = new double[][] {
      {0,86.8656990578567,10},
      {0.0144776167486695,87.6290778096157,10},
      {0.02908246344865,33.9596575284897,10},
      {0.0347424055733092,11.9694945578565,10},
      {0.0367373227671124,16.1872313834695,10},
      {0.0394351937082503,1.54129307827606,10},
      {0.0396920757485307,7.29502447636179,10},
      {0.0409079131612577,13.7509484411204,10},
      {0.043199737423391,5.81945550588021,10},
      {0.044169648188207,2.29096304877964,10},
      {0.0445514734906275,5.11272943849363,10},
      {0.0454035958604656,10.7386206101567,10},
      {0.0471933643686467,6.04131726004769,10},
      {0.0482002525705442,13.7264176045801,10},
      {0.0504879894753789,10.6553054487534,10},
      {0.0522638745135936,13.1106541201998,10},
      {0.0544489813027106,17.127235600304,10},
      {0.0573035223222907,17.6489219832218,10},
      {0.0602450093194944,20.0476719903397,10},
      {0.0635862884626045,21.3259086090337,10},
      {0.0671406041738427,25.1428081044704,10},
      {0.0713310696416358,26.7805275585487,10},
      {0.0757944956819288,30.5346548069488,10},
      {0.0808836060912295,31.7486429494438,10},
      {0.0861750446705895,35.5693668727623,10},
      {0.0921032743949305,38.4530887551334,10},
      {0.0985121231581907,40.7157503205081,10},
      {0.105298076445705,44.8944808500485,10},
      {0.112780489920713,46.0801146842284,10},
      {0.120460506803835,50.7093475205241,10},
      {0.128912070141862,52.6102296815715,10},
      {0.137680439524541,56.0821256255842,10},
      {0.147027452813282,59.0423322411619,10},
      {0.156867849168998,61.5926328519488,10},
      {0.167133282878419,65.0117555156215,10},
      {0.177968572277333,67.9918491561842,10},
      {0.189300559247385,70.6186345001776,10},
      {0.201070331664082,73.9964533427278,10},
      {0.213403075800083,76.6584234232331,10},
      {0.226179469505481,80.3437109697622,10},
      {0.239570098198916,82.3876229091581,10},
      {0.253301355935683,86.3574402412316,10},
      {0.26769427156622,88.7700652727044,10},
      {0.282489293918287,92.0989314383685,10},
      {0.297839113275064,94.848098474577,10},
      {0.313647130962302,98.163196699867,10},
      {0.330007650997521,101.196832330774,10},
      {0.346873792268935,104.235110817129,10},
      {0.364246319662121,107.030048606226,10},
      {0.382084662371302,110.559368334883,10},
      {0.400511202088691,113.132558146542,10},
      {0.419366651393015,116.189140344739,10},
      {0.438731482620952,119.689386772639,10},
      {0.458679730322246,122.516457404798,10},
      {0.479099147538568,125.363522145923,10},
      {0.499993048774083,128.836133257949,10},
      {0.521465745299263,131.484320100369,10},
      {0.543379812672227,134.94475423402,10},
      {0.565870571899522,137.805472182682,10},
      {0.588838173543203,140.869710885499,10},
      {0.612316463790023,143.933934290603,10},
      {0.636305442639983,147.178609500879,10},
      {0.660835195592418,149.889532258271,10},
      {0.685816804699078,153.478405977902,10},
      {0.71139655432644,156.201444522822,10},
      {0.737430136062433,159.271802310249,10},
      {0.763975426249,162.505769122456,10},
      {0.791059705805031,165.573006176732,10},
      {0.818655183887919,168.643302773313,10},
      {0.846762434161846,171.712130789587,10},
      {0.875381137924489,174.637099126663,10},
      {0.904487265020657,178.008699449477,10},
      {0.934155391794045,181.075936503753,10},
      {0.964334717094289,183.864770505951,10},
      {0.994978837863091,187.361766170151,10},
      {1.02620580144107,190.158233730401,10},
      {1.0578988352969,193.369269273029,10},
      {1.09012703409431,196.445593167951,10},
      {1.12286796118973,199.521962956009,10},
      {1.15612161658316,202.596848866048,10},
      {1.18988787279367,205.801627644661,10},
      {1.22418801913647,208.876467661566,10},
      {1.25900076629635,211.954275434506,10},
      {1.2943264967161,215.030660520275,10},
      {1.33016495543386,218.10540875091,10},
      {1.36651588748777,221.186337257003,10},
      {1.40338031272526,224.332984731814,10},
      {1.44076906702534,226.901363413198,10},
      {1.47858602976724,229.567693341488,10},
      {1.51684726354807,231.978459701011,10},
      {1.55551031721834,234.35563228602,10},
      {1.59456958161715,236.367158970113,10},
      {1.63396412086026,238.566832208276,10},
      {1.6737252952563,240.396285529776,10},
      {1.71379140403544,242.083424240942,10},
      {1.75413860826389,243.732379864137,10},
      {1.79476066137611,245.021808671027,10},
      {1.83559764733527,246.485616091612,10},
      {1.87667850431237,247.588351627027,10},
      {1.91794331627057,248.441841548536,10},
      {1.95935026946504,249.46351451057,10},
      {2.00092753718118,250.02166681334,10},
      {2.04259773849485,250.642585626505,10},
      {2.08437158180411,251.012576077494,10},
      {2.12620699840227,251.338233760479,10},
      {2.16809672187634,251.40837376783,10},
      {2.20999817359592,251.298077267721,10},
      {2.25188101309981,251.498263120762,10},
      {2.29379750756906,251.389450498671,10},
      {2.33569564478448,251.380088299216,10},
      {2.3775925071906,251.480884920467,10},
      {2.41950594211754,251.370573122647,10},
      {2.46140101979065,251.468325499304,10},
      {2.50331241502273,251.562957142809,10},
      {2.54523961789005,251.348682097452,10},
      {2.58713087113527,251.449478718702,10},
      {2.62903920682504,251.541142606172,10},
      {2.67096284022634,251.43392094608,10},
      {2.71286837133566,251.421560395166,10},
      {2.75477186275011,251.626442645645,10},
      {2.7967097740155,251.409108057983,10},
      {2.83861122573508,251.506921625486,10},
      {2.88052899501362,251.497666510012,10},
      {2.92244523452101,251.595495375227,10},
      {2.96437779158736,251.485290661387,10},
      {3.00629224636174,251.476081439048,10},
      {3.04820491640311,251.57088135738,10},
      {3.09013339407972,251.561687432752,10},
      {3.13206034198518,251.552508805836,10},
      {3.17398576011948,251.442380580554,10},
      {3.21589282099995,251.641281425827,10},
      {3.25783302692207,251.63520823435,10},
      {3.29977221299675,251.522051062186,10},
      {3.34169253189388,251.509904679234,10},
      {3.38361081109614,251.61096136158,10},
      {3.42554591778108,251.595770734034,10},
      {3.46747847484743,251.586745084233,10},
      {3.50940975710449,251.583823221332,10},
      {3.55134027447597,251.568693784631,10},
      {3.59326849719072,251.666813306365,10},
      {3.63521303746444,251.550764866722,10},
      {3.67713794567503,251.648899686167,10},
      {3.71907942640644,251.636952173464,10},
      {3.76101912240483,251.628064203067,10},
      {3.80295703367022,251.619191530382,10},
      {3.84489367012631,251.607289910814,10},
      {3.88682801192568,251.598463131263,10},
      {3.92876107891575,251.693721980941,10},
      {3.97071020850292,251.577857113836,10},
      {4.01263970602697,251.673161856649,10},
      {4.05458526614812,251.658384267314,10},
      {4.09652827665068,251.65273941176,10},
      {4.13847052226766,251.641036662442,10},
      {4.18041072818978,251.736524977793,10},
      {4.22236674174714,251.623903225532,10},
      {4.26430414308881,251.609171529332,10},
      {4.30623899481189,251.496610967917,10},
      {4.34815523431928,251.484984707156,10},
      {4.3900694341318,251.479492828718,10},
      {4.43198261409688,251.259710607211,10},
      {4.4738590795543,251.150071908698,10},
      {4.51571718775789,251.248589170931,10},
      {4.55759212344416,251.031790003172,10},
      {4.59943085454648,251.02314679616,10},
      {4.64126805587764,250.916429960548,10},
      {4.6830874098787,250.809713124936,10},
      {4.72488891654964,250.800916940808,10},
      {4.76668940337314,250.694154212062,10},
      {4.80847153294281,250.691415921699,10},
      {4.85025366251248,250.477385639726,10},
      {4.8919995874982,250.477645700822,10},
      {4.93374602240765,250.474723837921,10},
      {4.97549194739337,250.263753098253,10},
      {5.01720217771886,250.266812640559,10},
      {5.05891342789179,250.156684415277,10},
      {5.10060632081089,250.159743957582,10},
      {5.14229972365371,250.055658328353,10},
      {5.18397527916641,249.954494562026,10},
      {5.22563451712014,249.95443337118,10},
      {5.26729375507388,249.749138082489,10},
      {5.30891831821483,249.856084383773,10},
      {5.3505612386096,249.754798235754,10},
      {5.39218682159798,249.549441756217,10},
      {5.433778749621,249.558237940345,10},
      {5.47537169749146,249.557870795268,10},
      {5.51696464536191,249.459491212439,10},
      {5.5585412756734,249.364232362761,10},
      {5.60010209834965,249.369892516026,10},
      {5.64166343094962,249.170395060004,10},
      {5.68319212843166,249.176024617846,10},
      {5.72472133583742,249.184606634012,10},
      {5.76625207301433,249.089240700354,10},
      {5.807767002556,248.993737087291,10},
      {5.84926612446242,248.898264069652,10},
      {5.89074892880988,248.909890330412,10},
      {5.93223377285222,248.713467714407,10},
      {5.97368598177662,248.933158149645,10},
      {6.0151749052087,248.632680499833,10},
      {6.05661385611645,248.647396898322,10},
      {6.09805484671907,248.554983422988,10},
      {6.13948104953388,248.569715119189,10},
      {6.18090929204356,248.477408727836,10},
      {6.22232223684172,248.495245859476,10},
      {6.26373773125846,248.30202046518,10},
      {6.30512161040472,248.319949383089,10},
      {6.34650803916956,248.233884458039,10},
      {6.38788069999402,248.251920459929,10},
      {6.42925591043708,248.165977916571,10},
      {6.47061684301604,248.077037021754,10},
      {6.5119629878072,248.101390978505,10},
      {6.55331321198809,247.908593920131,10},
      {6.59463131097478,248.043259674703,10},
      {6.63597184660504,247.847586646562,10},
      {6.67727974711738,247.878411535289,10},
      {6.71859274686689,247.897105338775,10},
      {6.75990931608243,247.70790324261,10},
      {6.80119376010376,247.635070838031,10},
      {6.84246647587958,247.764290607298,10},
      {6.88376009852783,247.685583881492,10},
      {6.92504148300685,247.509201267587,10},
      {6.96629278198654,247.52876704063,10},
      {7.00754765043225,247.560678066875,10},
      {7.04880761811514,247.384830872874,10},
      {7.09003852014612,247.514983802545,10},
      {7.13129083897325,247.339519051331,10},
      {7.17251409214847,247.372194963153,10},
      {7.21374295448458,247.203277632473,10},
      {7.25494326109252,247.432161992338,10},
      {7.29618232190298,247.159679154621,10},
      {7.33737548957887,247.095505254766,10},
      {7.37855794885668,247.337362074006,10},
      {7.41978069210819,247.059555632678,10},
      {7.46095754222511,247.100125163647,10},
      {7.50214102135036,247.037022103598,10},
      {7.54331379207755,247.072023267572,10},
      {7.58449217196562,247.009623902254,10},
      {7.62566086330307,246.959585087849,10},
      {7.66682037601359,246.885727736598,10},
      {7.70796816047862,247.032096240487,10},
      {7.74914042128208,246.879103827506,10},
      {7.79028667597595,246.812344614403,10},
      {7.83142222227175,246.96610191296,10},
      {7.87258326475343,246.704358068735,10},
      {7.9137004537954,246.956739713505,10},
      {7.95485996650593,246.695623075453,10},
      {7.99597613570046,246.753448425025,10},
      {8.03710148352191,246.701344419564,10},
      {8.07821816264016,246.85138437422,10},
      {8.11936033794429,246.702522343351,10},
      {8.16047752698626,246.651871620486,10},
      {8.20158604732503,246.711884542806,10},
      {8.24270476613815,246.668331958089,10},
      {8.28381583609551,246.625391281833,10},
      {8.32492027704454,246.778766137602,10},
      {8.36605021417945,246.547357655334,10},
      {8.40714139711182,247.215056870348,10},
      {8.44834374341462,247.564120051969,10},
      {8.48960473094494,248.455884847717,10},
      {8.53101359635336,248.900206879016,10},
      {8.57249691062454,249.661115050363,10},
      {8.61410770582511,250.114783983404,10},
      {8.65579294988844,250.84852341908,10},
      {8.69760159549142,251.488273715135,10},
      {8.73951630522766,251.918751317501,10},
      {8.78150240428436,252.561974194072,10},
      {8.82359660716918,253.276805658301,10},
      {8.86580911235647,253.690088632911,10},
      {8.90809096716935,254.401462814334,10},
      {8.95049112428471,254.915573005619,10},
      {8.99297694858462,255.520046778892,10},
      {9.0355637377806,256.018798067803,10},
      {9.07823313461883,256.620288787329,10},
      {9.12100349635314,257.092054913106,10},
      {9.16385238633995,257.801042651532,10},
      {9.20681855878181,258.276342548672,10},
      {9.24986529917103,258.86102108323,10},
      {9.29300790521916,259.322369467458,10},
      {9.33622903951979,259.808041213013,10},
      {9.37952972192037,260.574181201703,10},
      {9.42295890509777,260.844736527767,10},
      {9.46643296156231,261.500641207194,10},
      {9.51001716154985,262.071184656301,10},
      {9.55369518750142,262.538101407525,10},
      {9.59745174170549,263.079242655077,10},
      {9.64129804248386,263.548025727107,10},
      {9.68522287151473,264.103730396032,10},
      {9.7292405066622,264.661148408649,10},
      {9.77334992807882,265.110472791617,10},
      {9.81753583805309,265.66605507885,10},
      {9.86181251444907,266.230540634193,10},
      {9.90618505650396,266.675826421317,10},
      {9.95063102757418,267.23480480051,10},
      {9.995169804761,267.687586466282,10},
      {10.039784050658,268.359094811467,10},
      {10.0845104797729,268.809092293742,10},
      {10.129312377598,269.27655976258,10},
      {10.1741917838281,269.946140596112,10},
      {10.2191833732761,270.309767199106,10},
      {10.2642341138754,270.980480063291,10},
      {10.3093980575399,271.456759013969,10},
      {10.354640529457,271.934873690031,10},
      {10.3999635693214,272.624310953124,10},
      {10.4454008320986,273.109003645142,10},
      {10.4909186628231,273.707633692612,10},
      {10.5365364385963,274.200158812932,10},
      {10.5822368220117,274.809497258471,10},
      {10.6280381703232,275.424404071006,10},
      {10.6739425232257,275.935255849735,10},
      {10.7199315234652,276.564787274489,10},
      {10.7660255679906,277.203068990237,10},
      {10.8122266964967,277.634219691911,10},
      {10.8584981944758,278.488505094418,10},
      {10.9049134909432,278.952637662144,10},
      {10.9514052759683,279.720185040294,10},
      {10.9980255617702,280.176668752257,10},
      {11.0447213162823,280.870052824924,10},
      {11.091533333402,281.683768696463,10},
      {11.1384809902306,282.184309817622,10},
      {11.1855112547014,282.998301047968,10},
      {11.2326781787286,283.61859265496,10},
      {11.2799470874992,284.363009893282,10},
      {11.3273414375044,285.026288069665,10},
      {11.3748459310326,285.678827252555,10},
      {11.4224585283888,286.652893736318,10},
      {11.4702343013348,287.267892335122,10},
      {11.5181120590242,287.941083428575,10},
      {11.5661019999314,288.985855935015,10},
      {11.6142663347501,289.490833392518,10},
      {11.6625153169059,290.466429647433,10},
      {11.7109264548039,291.307895567681,10},
      {11.7594773118005,292.081715007557,10},
      {11.8081576894214,292.980424964339,10},
      {11.8569879846152,293.800015157103,10},
      {11.9059549393654,295.184672218248,10},
      {11.9551523796358,297.131244819199,10},
      {12.0046741313907,298.986214723526,10},
      {12.0545048969183,300.970205526871,10},
      {12.1046671128624,302.911821669287,10},
      {12.155151600596,304.4191969723,10},
      {12.2058890104936,305.874468269853,10},
      {12.2568681242332,307.340080820398,10},
      {12.3080909815098,308.177385763111,10},
      {12.3594535578851,309.049661274374,10},
      {12.4109619724435,309.786674420316,10},
      {12.4625937885416,310.055302234728,10},
      {12.5142694580795,310.299759664928,10},
      {12.5659859215147,310.520077306338,10},
      {12.6177390994576,310.195000936392,10},
      {12.6694382254864,309.798545444461,10},
      {12.721071061432,309.292772505959,10},
      {12.7726202698879,308.458129365052,10},
      {12.8240297592451,307.437098906901,10},
      {12.8752689340807,306.375498917782,10},
      {12.92633167531,304.783557865447,10},
      {12.9771292562062,303.29848662584,10},
      {13.0276790141757,301.359226331,10},
      {13.0779054805082,299.228377496996,10},
      {13.1277770399333,296.729526914502,10},
      {13.1772314817574,294.231777767238,10},
      {13.2262708456754,291.629331082284,10},
      {13.2748757545861,288.935771227476,10},
      {13.3230309107778,286.266534733995,10},
      {13.3707424333353,283.326651128181,10},
      {13.4179634092765,277.429138571182,10},
      {13.4642012522903,270.555417850805,10},
      {13.5092938066344,263.696168765533,10},
      {13.5532441318511,256.866933790277,10},
      {13.5960552874828,250.249862776187,10},
      {13.6377629681897,243.978382363201,10},
      {13.6784263251231,237.433256486422,10},
      {13.7179984453008,231.24978380785,10},
      {13.7565405195691,225.241301651435,10},
      {13.7940800838086,219.262665330208,10},
      {13.8306242769515,213.270444641145,10},
      {13.8661690196079,207.522681382282,10},
      {13.9007561255228,202.128983656709,10},
      {13.9344447458473,196.221971220851,10},
      {13.9671481935495,191.19688715223,10},
      {13.9990143465074,185.483146003803,10},
      {14.029927961961,180.416008526194,10},
      {14.0599971437382,175.253688687465,10},
      {14.0892065941277,170.051273546825,10},
      {14.1175481543498,165.230612797337,10},
      {14.1450870946405,160.388825908231,10},
      {14.1718183157626,155.235868268957,10},
      {14.1976908253443,150.905422685348,10},
      {14.2228412829419,145.7178616226,10},
      {14.247127929762,141.474612994695,10},
      {14.2707068024621,136.951232673309,10},
      {14.2935320079077,132.012794842777,10},
      {14.3155341964731,128.176671860592,10},
      {14.3368969406967,123.491625323791,10},
      {14.3574795016324,119.071282738395,10},
      {14.3773247128725,115.14624180796,10},
      {14.3965151820593,110.500716908889,10},
      {14.4149326068902,106.895444042501,10},
      {14.4327483217344,102.321497135663,10},
      {14.4498011906972,98.4651352811289,10},
      {14.4662125756232,94.6964752067783,10},
      {14.4819957345292,90.3479783235682,10},
      {14.4970527620614,86.6746918317319,10},
      {14.51149890098,82.3039673736733,10},
      {14.5252168688298,79.1086655273504,10},
      {14.5384014564711,75.2282939145747,10},
      {14.5509394608386,71.0280089094929,10},
      {14.5627768300181,67.7397428702211,10},
      {14.5740675609724,63.5943231075305,10},
      {14.5846658155182,60.6315388275605,10},
      {14.5947714837529,55.9918423565804,10},
      {14.6041030877843,53.0995384580427,10},
      {14.6129533238263,49.0014039216817,10},
      {14.6211202620868,45.7198115090635,10},
      {14.628740562122,42.2450472441395,10},
      {14.6357805689667,38.2582800476942,10},
      {14.6421576749785,34.3280952617591,10},
      {14.6478790190896,31.2312628723208,10},
      {14.6530843203985,28.9539174160942,10},
      {14.6579092186141,23.9072195932995,10},
      {14.6618937625431,20.6781251022137,10},
      {14.6653408468738,19.9004487268189,10},
      {14.6686573907329,15.1444131596768,10},
      {14.6711815131348,13.9229081041802,10},
      {14.6735016660497,10.201571500438,10},
      {14.6752017517241,10.5531377701071,10},
      {14.6769609885497,5.59143737893013,10},
      {14.6778931291054,7.19177830905288,10},
      {14.6790914498416,0.129082224316421,10},
      {14.6791128666378,9.96227035512988,10},
  }; 
  public static double PointsL[][] = new double[][] {
      {0,87.4639390136829,10},
      {0.0145773227705692,86.7005602619239,10},
      {0.0290274155898275,35.4619310447089,10},
      {0.0349377382273681,14.1526128038262,10},
      {0.0372965059125477,13.0419320194862,10},
      {0.0394701593369148,5.78962592450975,10},
      {0.0404350983454846,12.8545446143515,10},
      {0.04257752292593,6.64643162499132,10},
      {0.0436852604943127,3.04128353056323,10},
      {0.0441921406046864,8.56014904406329,10},
      {0.0456188354584047,7.96585685391796,10},
      {0.0469464776299864,4.80443704835968,10},
      {0.0477472172177219,12.214246469003,10},
      {0.0497829243251511,7.48771492880795,10},
      {0.0510308749807474,13.7700141702178,10},
      {0.0533258782985573,14.7797893371125,10},
      {0.0557891763620582,14.4836782278353,10},
      {0.0582031233707688,17.9456861135598,10},
      {0.061194072968576,19.789150226605,10},
      {0.064492263557552,23.0178775726141,10},
      {0.0683285750521606,23.9724700696035,10},
      {0.0723239867304279,27.372524135858,10},
      {0.0768860750425112,28.9237598900329,10},
      {0.081706702646957,33.2922298478553,10},
      {0.0872554057093855,35.2160050342027,10},
      {0.093124739244348,38.1150246281007,10},
      {0.0994772414368175,41.6642810993048,10},
      {0.10642129497945,43.327838388152,10},
      {0.113642595640834,48.0108312071811,10},
      {0.12164440625997,49.27054420943,10},
      {0.129856162034697,53.2810075610304,10},
      {0.138736332192452,55.7394721850934,10},
      {0.148026234024826,58.7241551391142,10},
      {0.157813598313916,62.1372084357387,10},
      {0.168169798445063,64.693570764718,10},
      {0.178952071712466,67.6981407437237,10},
      {0.190235090070516,71.0744833571116,10},
      {0.20208084112113,73.7058044725727,10},
      {0.214365142503963,77.0653272521368,10},
      {0.227209356063797,79.4074221846148,10},
      {0.240443932164541,83.4034597942454,10},
      {0.254344500510655,85.4793821950113,10},
      {0.268591068034251,89.1188377978059,10},
      {0.283444221690121,91.8541757027941,10},
      {0.298753247149492,95.1693351189301,10},
      {0.314614806827075,97.9276195912087,10},
      {0.330936062736041,100.973493391337,10},
      {0.347764979576073,104.020835771772,10},
      {0.365101780438798,107.314685475751,10},
      {0.382987577923944,109.880065805675,10},
      {0.401300914576034,113.407901656314,10},
      {0.420202225144707,116.45235276927,10},
      {0.439610941682587,119.062096462623,10},
      {0.45945465502178,122.345130684552,10},
      {0.479845484639686,125.614389317252,10},
      {0.500781231490273,128.26095460225,10},
      {0.522158062356552,131.732143027104,10},
      {0.544113401680406,134.400063917393,10},
      {0.566513394485975,137.667808076652,10},
      {0.589458049562365,140.735091024062,10},
      {0.612913903165613,143.805433513778,10},
      {0.636881465219435,146.698276656647,10},
      {0.661331160148212,150.125101718073,10},
      {0.686352033381125,152.67978894764,10},
      {0.711798692918203,156.103554466762,10},
      {0.737815957095234,159.176956498783,10},
      {0.764345439646557,162.092746208942,10},
      {0.791360879500717,165.175280974744,10},
      {0.818890067500322,168.257815740547,10},
      {0.846933067385836,171.341834384367,10},
      {0.875490006638189,174.575908280555,10},
      {0.90458599900047,177.363151320754,10},
      {0.934146531869452,180.454772927204,10},
      {0.964222342655031,183.828055998286,10},
      {0.994860344339223,186.492871453135,10},
      {1.02594248958141,189.861473424491,10},
      {1.05758606083664,192.815415627198,10},
      {1.08972202718164,195.907129019917,10},
      {1.12237320770277,198.998796519501,10},
      {1.15553966614049,202.091947897103,10},
      {1.18922165745668,205.058174162166,10},
      {1.22339801981704,208.154339188939,10},
      {1.25809042497957,211.250611299693,10},
      {1.29329887294428,214.348306097618,10},
      {1.32902349119209,217.44456291066,10},
      {1.36526427972301,220.540789128279,10},
      {1.4020211110561,223.280440987918,10},
      {1.43923445159733,226.164029015313,10},
      {1.4769285227233,228.658948085945,10},
      {1.51503830916001,231.124877993233,10},
      {1.55355909411308,233.333683965178,10},
      {1.59244804399023,235.620645945313,10},
      {1.63171816184626,237.428636577541,10},
      {1.67128964461936,239.310086820521,10},
      {1.71117460299784,241.049329537148,10},
      {1.75134958049068,242.526859004972,10},
      {1.79177072365818,244.079484938682,10},
      {1.83245052563141,245.157728837943,10},
      {1.87331020319601,246.30335915648,10},
      {1.9143607197119,247.407670356183,10},
      {1.95559531868984,248.043840987741,10},
      {1.99693598180103,248.849892705804,10},
      {2.0384110098118,249.293281576699,10},
      {2.07995984928069,249.696988183894,10},
      {2.12157599868029,249.842071680015,10},
      {2.16321649693741,249.936749216655,10},
      {2.20487242038698,250.049753411704,10},
      {2.24654746597596,249.833841511213,10},
      {2.28818656194286,249.933123659023,10},
      {2.32984197546871,249.929880544179,10},
      {2.37149687907085,249.816463310919,10},
      {2.41313291549544,249.914230985287,10},
      {2.45478552444085,249.803903889755,10},
      {2.49641926620871,249.690532549629,10},
      {2.53803439576088,249.892309364669,10},
      {2.57968318027841,249.785103002289,10},
      {2.62131411746582,249.668672119857,10},
      {2.66292542259011,249.769529931954,10},
      {2.70455381015894,249.763303763363,10},
      {2.74618092291847,249.545923282566,10},
      {2.78777183109405,249.744717043858,10},
      {2.82939613927314,249.634481734595,10},
      {2.87100183523653,249.625226619121,10},
      {2.91260600142877,249.514991309858,10},
      {2.95419181036718,249.606731685885,10},
      {2.99579291701712,249.603641548157,10},
      {3.03739351374334,249.490392589723,10},
      {3.078975243292,249.481198665095,10},
      {3.12055544306952,249.472020038179,10},
      {3.16213411307588,249.569940689663,10},
      {3.20372910064121,249.352743781404,10},
      {3.24528788362259,249.340551505317,10},
      {3.2868446269091,249.441562294529,10},
      {3.32841819767828,249.429400613865,10},
      {3.36998998371446,249.316304632547,10},
      {3.41154264761123,249.307233089612,10},
      {3.45309378173684,249.298176844388,10},
      {3.4946433860913,249.289166492298,10},
      {3.53619171563647,249.280156140209,10},
      {3.57773826044863,249.164092402855,10},
      {3.61926568312138,249.262196626876,10},
      {3.66080942335309,249.14620937808,10},
      {3.70233378648353,249.140335056853,10},
      {3.74385712976654,249.125328001845,10},
      {3.78537817839282,249.11645532916,10},
      {3.82689744228608,249.110672794203,10},
      {3.86841594129377,249.095726930041,10},
      {3.90993189068288,248.982936902953,10},
      {3.95142897289443,249.075120912614,10},
      {3.99294160777937,248.962392076373,10},
      {4.03443537548676,248.953657083091,10},
      {4.07592761342299,248.941954333773,10},
      {4.11741781166436,248.930251584455,10},
      {4.15890622517271,248.817614534482,10},
      {4.20037577150352,248.906922574376,10},
      {4.24186036058399,248.898417046767,10},
      {4.28334341989331,248.993798278137,10},
      {4.32484254179974,248.982156719665,10},
      {4.36633962401129,248.976664841227,10},
      {4.40783568637541,249.173072159521,10},
      {4.44936438385745,249.271467040062,10},
      {4.49090939889845,249.16184363926,10},
      {4.53243656660934,249.361234011302,10},
      {4.57399687936187,249.358587507207,10},
      {4.61555668219069,249.453922845443,10},
      {4.65713229265474,249.555254886597,10},
      {4.69872473060148,249.546443404758,10},
      {4.74031563877707,249.653833339676,10},
      {4.78192490420648,249.644975964702,10},
      {4.82353212994103,249.853284902564,10},
      {4.86517454041209,249.853407284256,10},
      {4.90681695088315,249.844488718436,10},
      {4.94845732165934,250.061716222118,10},
      {4.99013440694319,250.052659976894,10},
      {5.03180996245589,250.156684415277,10},
      {5.07350285537499,250.159743957582,10},
      {5.11519574829408,250.269810992018,10},
      {5.15690750839073,250.370699399538,10},
      {5.19863609597006,250.370500529288,10},
      {5.24036468354938,250.581410078109,10},
      {5.2821279459415,250.486304205547,10},
      {5.3238759106221,250.587070231374,10},
      {5.36564019286165,250.803915292268,10},
      {5.40744118960888,250.806592391785,10},
      {5.4492421863561,250.812344331319,10},
      {5.49104420295075,250.922120709236,10},
      {5.53286457679924,251.034788354632,10},
      {5.57470381782528,251.034314125574,10},
      {5.6165425489276,251.257140591675,10},
      {5.65841901438502,251.262647767825,10},
      {5.70029598976616,251.271352165683,10},
      {5.74217449491845,251.383912727098,10},
      {5.78407186724829,251.496565074782,10},
      {5.82598810675568,251.609125636197,10},
      {5.8679227035169,251.626870981568,10},
      {5.90986035982043,251.840319950503,10},
      {5.95183371078418,251.644004418478,10},
      {5.99377442663002,251.967673398964,10},
      {6.03576919438991,251.982313308895,10},
      {6.07776651176839,252.098009901173,10},
      {6.11978269632442,252.112741597374,10},
      {6.16180143049904,252.234541976551,10},
      {6.20384056162237,252.246321214426,10},
      {6.24588173244056,252.469132382816,10},
      {6.28795961776642,252.487061300725,10},
      {6.3300410725583,252.60904525244,10},
      {6.37214241437516,252.62096216972,10},
      {6.4142457958869,252.749187587738,10},
      {6.45637059419477,252.868295569687,10},
      {6.49851527952763,252.892634228726,10},
      {6.54066404425023,253.109815839273,10},
      {6.58284901355677,253.036432717079,10},
      {6.6250217446941,253.25685744247,10},
      {6.6672317002628,253.287697628908,10},
      {6.70944624514497,253.306391432394,10},
      {6.75166384956944,253.53328708976,10},
      {6.79391918834901,253.668549455081,10},
      {6.83619747369587,253.589720347583,10},
      {6.87846250102607,253.706870222456,10},
      {6.92074690545754,253.946585362082,10},
      {6.96307108393898,253.978389304347,10},
      {7.00540087158131,253.998138649928,10},
      {7.04773422868967,254.238373911746,10},
      {7.090107359848,254.160585048632,10},
      {7.13246723298967,254.401202753238,10},
      {7.17486739010502,254.421762877531,10},
      {7.2172711166864,254.669050384363,10},
      {7.2597161470889,254.494105755341,10},
      {7.30213160191579,254.83363846268,10},
      {7.34460365827532,254.965412949773,10},
      {7.38709815127843,254.803456077838,10},
      {7.42956510840079,255.137680479277,10},
      {7.47208815713208,255.178448880497,10},
      {7.51461783487169,255.323562972041,10},
      {7.55717198894976,255.358793601687,10},
      {7.59973175218871,255.492159050778,10},
      {7.64231395207124,255.638389875264,10},
      {7.68492011836849,255.784758379153,10},
      {7.72755076100418,255.723399258219,10},
      {7.77017171508925,255.962502489384,10},
      {7.81283193330056,256.116259787941,10},
      {7.85551815762147,256.049791231357,10},
      {7.89819316362059,256.412622353351,10},
      {7.94092834061839,256.249059221706,10},
      {7.98363649165915,256.60066182344,10},
      {8.02640328392744,256.64624900379,10},
      {8.06917772505149,256.802836378979,10},
      {8.11197817228513,256.745347579061,10},
      {8.15476893096814,257.00051340733,10},
      {8.19760252324343,257.158630553671,10},
      {8.24046212162831,257.206848940404,10},
      {8.28332987879267,257.359887246519,10},
      {8.32622364206663,257.525775630317,10},
      {8.36914443129762,257.471254586435,10},
      {8.41205604190169,257.840510747271,10},
      {8.45502986319931,257.271711237278,10},
      {8.49790832876174,257.020614600276,10},
      {8.54074498057933,256.235230090485,10},
      {8.58345109192522,255.87099157903,10},
      {8.62609601242501,255.186510774471,10},
      {8.66862671001206,254.807173421739,10},
      {8.71109519690557,254.119403609202,10},
      {8.75344844103891,253.52216565348,10},
      {8.79570174012361,253.131875139295,10},
      {8.8378907888199,252.525305579542,10},
      {8.87997785277267,251.818612497846,10},
      {8.92194763427041,251.411127355905,10},
      {8.96385010583742,250.689335432931,10},
      {9.00563121555966,250.174276783533,10},
      {9.04732665809734,249.541196289704,10},
      {9.08891705634921,249.011329455547,10},
      {9.13041872787422,248.375816625586,10},
      {9.17181535511342,247.843425669027,10},
      {9.21312223577832,247.083068215294,10},
      {9.25430265536126,246.542462387646,10},
      {9.29539332836992,245.878373432552,10},
      {9.33637283800815,245.324259725625,10},
      {9.37726056137721,244.757265345592,10},
      {9.41805343893481,243.883643635715,10},
      {9.45870047830919,243.518594345549,10},
      {9.49928734668489,242.743321623078,10},
      {9.53974469443633,242.053884359984,10},
      {9.5800867994276,241.469358802542,10},
      {9.62033099906511,240.787616288346,10},
      {9.66046301548474,240.192749477911,10},
      {9.70049508685574,239.501308214607,10},
      {9.74041191546656,238.799158553235,10},
      {9.78021146162235,238.209141117354,10},
      {9.81991310242436,237.505109837464,10},
      {9.85949746077134,236.797468297653,10},
      {9.89896351681584,236.20281565518,10},
      {9.93833064765913,235.488963244489,10},
      {9.97757845635251,234.901010999665,10},
      {10.0167293795396,234.078330669172,10},
      {10.0557416034754,233.486232744524,10},
      {10.0946559220575,232.886577750381,10},
      {10.1334713154384,232.083876231142,10},
      {10.1721510691104,231.58621107975,10},
      {10.2107492349876,230.794768676195,10},
      {10.2492148206983,230.199029896203,10},
      {10.2875814812077,229.615942323644,10},
      {10.3258512562108,228.825876714127,10},
      {10.3639884510473,228.257123097268,10},
      {10.4020308000724,227.580474721011,10},
      {10.4399609658796,227.01640220388,10},
      {10.4777973057228,226.368314655044,10},
      {10.5155255417378,225.71204283054,10},
      {10.5531446540773,225.181961828422,10},
      {10.5906740198425,224.557493946183,10},
      {10.6281003810168,223.925499589872,10},
      {10.6654216979052,223.537396648435,10},
      {10.7026777445578,222.744699832535,10},
      {10.7398022308912,222.357055822444,10},
      {10.7768614469888,221.686327660547,10},
      {10.813809499716,221.368303535615,10},
      {10.8507035005291,220.835010014076,10},
      {10.8875097944628,220.206350558879,10},
      {10.9242110441107,219.912129673082,10},
      {10.9608633410817,219.344706957127,10},
      {10.9974207922412,219.009029273092,10},
      {11.0339221517918,218.57859756386,10},
      {11.0703511021745,218.258217591352,10},
      {11.106728040338,217.99089008242,10},
      {11.1430601052143,217.452884865731,10},
      {11.1793024235164,217.293100268833,10},
      {11.2155172059377,217.133988771241,10},
      {11.2517064921732,216.635696413676,10},
      {11.2878121509189,216.733877126256,10},
      {11.3239351470711,216.394757457128,10},
      {11.3600000119194,216.245926021683,10},
      {11.3960414202768,216.219537469299,10},
      {11.432077729397,216.115895473704,10},
      {11.4680977209582,216.137449949245,10},
      {11.5041207720617,215.573025584749,10},
      {11.5400489773537,214.260650210569,10},
      {11.5757589352947,212.871449729101,10},
      {11.6112373878678,211.171415047118,10},
      {11.6464333427014,209.288863368908,10},
      {11.6813141646776,207.429334746545,10},
      {11.7158859728809,205.167537501872,10},
      {11.7500804375333,202.453172759387,10},
      {11.7838231097719,199.907174629967,10},
      {11.81714050563,196.916823873826,10},
      {11.8499602159398,193.655795409928,10},
      {11.8822363475666,190.468761976685,10},
      {11.9139811386798,186.918744444332,10},
      {11.9451344182806,183.024864952278,10},
      {11.9756380550652,179.339263802663,10},
      {12.0055277436939,175.36173642398,10},
      {12.0347555513371,171.169429175459,10},
      {12.0632837436399,167.019986114637,10},
      {12.0911194595342,162.747396476024,10},
      {12.1182443417663,158.232322811997,10},
      {12.1446165765912,153.985173267653,10},
      {12.1702810372961,149.388593396611,10},
      {12.1951785727299,144.983066644829,10},
      {12.2193428378577,140.459059117271,10},
      {12.2427524158836,135.974611471721,10},
      {12.265415465587,131.538825846539,10},
      {12.2873381060524,127.3017039521,10},
      {12.3085550120928,123.265356872597,10},
      {12.329098818826,119.293497296034,10},
      {12.3489817644212,115.713389165108,10},
      {12.3682670794194,115.232773313212,10},
      {12.3874728463177,115.858725073469,10},
      {12.4067826376544,116.575552889052,10},
      {12.426211751141,117.361518711881,10},
      {12.4457714050992,118.013828429099,10},
      {12.4654412025805,118.355609900032,10},
      {12.4851670916707,119.014704152312,10},
      {12.5050021044365,119.351276752471,10},
      {12.5248942286586,119.49719397387,10},
      {12.5448108292192,119.638575423802,10},
      {12.5647508862708,119.765638215744,10},
      {12.5847113402711,119.665728861762,10},
      {12.6046554767124,119.173394962837,10},
      {12.6245180253589,119.170847893867,10},
      {12.644379554158,118.275258670237,10},
      {12.6640921852315,118.019534475498,10},
      {12.6837619827128,117.097946791128,10},
      {12.7032788030788,116.230834257505,10},
      {12.7226497852616,115.369083571773,10},
      {12.7418779888034,114.093476247247,10},
      {12.7608940640788,112.814120983398,10},
      {12.7796959713928,111.781234798814,10},
      {12.7983265443376,109.923037077354,10},
      {12.8166470836622,108.873269868101,10},
      {12.834792209228,106.859525015836,10},
      {12.852602824835,105.067665820412,10},
      {12.8701136052962,103.671902620699,10},
      {12.8873928803895,101.168378587334,10},
      {12.9042540180344,99.4459021625408,10},
      {12.9208285785501,97.4650856343375,10},
      {12.9370727084968,94.9310273687643,10},
      {12.9528946216053,93.1227766754401,10},
      {12.9684146598731,90.2297576088884,10},
      {12.9834533301514,88.2866193441759,10},
      {12.9981676889454,85.5977405890948,10},
      {13.012433314868,82.8032693801994,10},
      {13.0262338903601,80.5834643536673,10},
      {13.0396652810807,77.6638349179147,10},
      {13.0526091847273,75.4025195511544,10},
      {13.0651757448229,71.9554632662335,10},
      {13.0771681308126,69.1686715085246,10},
      {13.0886964862192,66.7105740295382,10},
      {13.099814862957,63.2859709607109,10},
      {13.1103631449785,60.6936016432251,10},
      {13.1204779918401,56.929060477703,10},
      {13.1299666523765,54.7787529546376,10},
      {13.1390963266157,50.8746890111346,10},
      {13.1475753381914,48.1451030456805,10},
      {13.1555994978109,44.554890776291,10},
      {13.1630250069861,41.1305821884106,10},
      {13.169880421445,38.1532842046294,10},
      {13.176239170203,35.0375916490925,10},
      {13.1820788166165,31.1703569460904,10},
      {13.1872739194511,26.7186177199994,10},
      {13.1917275932003,25.3952987454356,10},
      {13.195959960056,22.5839025309497,10},
      {13.1997231970917,17.6378770354994,10},
      {13.2026634172471,17.039738427012,10},
      {13.2055036923539,13.2302267701358,10},
      {13.2077086025087,12.2837038159769,10},
      {13.209755436311,7.61470362246007,10},
      {13.2110251463677,8.56759233682809,10},
      {13.2124529327769,3.35295121732953,10},
      {13.2130118091713,7.36813271780227,10},
      {13.2142397054832,5.69529019611177,10},
   }; 
}; 
