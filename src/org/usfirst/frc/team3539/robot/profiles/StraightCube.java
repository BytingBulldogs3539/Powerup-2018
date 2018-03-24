package org.usfirst.frc.team3539.robot.profiles;
public class StraightCube implements IProfile
{
  public static final int kNumPoints = 180;
  public static double PointsR[][] = new double[][] {
      {0,25.5997756065598,10},
      {0.00426662934743554,13.2089830293598,10},
      {0.00646812639948214,23.9037890814896,10},
      {0.0104520916846128,37.9584410773394,10},
      {0.0167784981324581,8.46389966756399,10},
      {0.0181891483160788,0.588451093636224,10},
      {0.0182872229804603,8.70715431519485,10},
      {0.0197384160834063,16.2180658332659,10},
      {0.0224414260995103,1.74600980273641,10},
      {0.022732429207298,4.24924055028874,10},
      {0.0234406355673015,4.73103002349094,10},
      {0.024229138977705,8.90466593703941,10},
      {0.0257132500468872,9.2182336473827,10},
      {0.027249622321451,12.4107178464638,10},
      {0.0293180760926174,12.1956291540748,10},
      {0.0313506818280613,12.9042220203211,10},
      {0.0335013866932485,15.5329033244369,10},
      {0.0360902016830717,17.6276237443485,10},
      {0.0390281391331476,19.8284519597315,10},
      {0.0423328830386502,21.6946025789711,10},
      {0.0459486485416337,26.2380649711634,10},
      {0.0503216587327563,25.9942423959921,10},
      {0.0546540343776356,29.9586500748269,10},
      {0.059647139695768,32.1905345568234,10},
      {0.0650122303820835,35.545383885516,10},
      {0.0709364603922649,38.0949272595822,10},
      {0.0772856162103379,41.2018618752701,10},
      {0.0841525915960379,44.6264534708138,10},
      {0.0915903309728527,46.5893143101124,10},
      {0.0993552182847163,50.0291577240483,10},
      {0.107693411238724,52.650210250647,10},
      {0.116468449467522,56.2219161135169,10},
      {0.125838767863668,58.6958581972173,10},
      {0.13562141535837,61.5607371234152,10},
      {0.145881526738989,65.1828374724825,10},
      {0.156745339995854,67.5172988469086,10},
      {0.167998225049219,70.9999146622738,10},
      {0.179831546709217,73.7487374999729,10},
      {0.192123002959212,76.8615311391756,10},
      {0.204933258786479,79.4573845104616,10},
      {0.218176153017866,83.0754003705512,10},
      {0.232022047980388,85.7972533428285,10},
      {0.246321583830146,89.0049922286228,10},
      {0.261155758762653,92.0152147120376,10},
      {0.276491634892777,94.6069759454902,10},
      {0.292259464217025,98.0702554534854,10},
      {0.308604495319323,101.181274558151,10},
      {0.325468055101917,103.89904304145,10},
      {0.342784554626636,107.011836680653,10},
      {0.360619869663743,110.366686009346,10},
      {0.379014316057158,112.886938090266,10},
      {0.397828780242683,116.522523372044,10},
      {0.417249225026067,119.067978432705,10},
      {0.437093862601999,122.333741538321,10},
      {0.457482843746429,125.514510558693,10},
      {0.478401922465498,128.507155971563,10},
      {0.499819770320808,131.43414360656,10},
      {0.521725455822664,134.498305820819,10},
      {0.54414182992766,137.684941513562,10},
      {0.567089353324962,140.679346163258,10},
      {0.590535900820364,143.745833629669,10},
      {0.614493519361693,146.984634518718,10},
      {0.638990955898528,149.665481975248,10},
      {0.663935213092877,153.165674861157,10},
      {0.689462823020118,156.017061205789,10},
      {0.715465681852127,158.984511287774,10},
      {0.741963102949708,162.168821728365,10},
      {0.768991227156343,165.489067633584,10},
      {0.796572746077463,168.162296829773,10},
      {0.824599810846803,171.333114688797,10},
      {0.853155347808933,174.662753388893,10},
      {0.8822658092567,177.487185165814,10},
      {0.911846994036243,180.582401734472,10},
      {0.941944030396565,183.745601333156,10},
      {0.972568327880848,186.914644657643,10},
      {1.0037207788556,189.824070519807,10},
      {1.03535810354528,192.855403845129,10},
      {1.06750063515814,196.20261961577,10},
      {1.10020108705848,199.073357565483,10},
      {1.13338003862729,202.281088802421,10},
      {1.16709351773303,205.159460310186,10},
      {1.20128670757607,208.489099010282,10},
      {1.23603494938568,211.460648878957,10},
      {1.27127832712504,214.654887534329,10},
      {1.30705419270647,217.521540995064,10},
      {1.34330772933032,220.830084150964,10},
      {1.38011274845472,223.70666582648,10},
      {1.41739722335456,226.296675471963,10},
      {1.45511334868131,229.101755643802,10},
      {1.49329694657614,231.478989419658,10},
      {1.53187675519952,233.627644789878,10},
      {1.57081478523448,235.896448386431,10},
      {1.61013079622509,237.942532600864,10},
      {1.64978794618274,239.768222685329,10},
      {1.68974926563793,241.357180683915,10},
      {1.72997549046438,243.138323832413,10},
      {1.77049849089446,244.299970854919,10},
      {1.81121513485629,244.059689699966,10},
      {1.85189174980628,242.600288020301,10},
      {1.892325131143,241.016638327615,10},
      {1.93249462695588,239.105954157907,10},
      {1.97234567540714,237.340598247704,10},
      {2.01190237039243,235.098764516573,10},
      {2.05108554625461,232.992881547782,10},
      {2.08991763963725,230.501358569109,10},
      {2.12833452763287,227.920757016215,10},
      {2.16632142245365,225.299708314044,10},
      {2.20387118516755,222.40200049891,10},
      {2.24093830508277,219.182551214942,10},
      {2.27746873028526,216.189905802071,10},
      {2.31350045009198,212.815720166009,10},
      {2.34896972403822,209.792005101027,10},
      {2.38393493838965,206.373272528998,10},
      {2.41833056794856,203.432792312434,10},
      {2.45223590585304,200.291269570984,10},
      {2.48561780706144,196.819805787322,10},
      {2.51842119981226,193.850596468511,10},
      {2.55072971159519,190.743661852823,10},
      {2.58252014088107,187.173726700063,10},
      {2.61371574415042,184.516300039881,10},
      {2.64446847867106,180.92702857975,10},
      {2.674623072671,177.821868498599,10},
      {2.70426009409762,174.682104993975,10},
      {2.73337367882816,171.594506685657,10},
      {2.76197275052767,168.301781363475,10},
      {2.79002314430709,165.012589812656,10},
      {2.81752511512827,161.923216969801,10},
      {2.84451231795657,158.880180895161,10},
      {2.87099240164776,155.316089468204,10},
      {2.89687842420798,152.379709038329,10},
      {2.9222751749612,149.084658463995,10},
      {2.94712248290875,146.045691580621,10},
      {2.97146343660476,142.500967056457,10},
      {2.99521364367397,139.647790879577,10},
      {3.01848834687655,136.387894446332,10},
      {3.04121947139621,133.064099472039,10},
      {3.0633968187586,129.728601748428,10},
      {3.08501834926884,126.762918552123,10},
      {3.10614550873491,123.497155446508,10},
      {3.12672832463248,120.280023765836,10},
      {3.14677495574103,117.072292528897,10},
      {3.16628718679357,113.781326443541,10},
      {3.18525073992602,110.482734448989,10},
      {3.20366434032908,107.33126054619,10},
      {3.2215529742649,104.263013842954,10},
      {3.23893015471201,100.964421848402,10},
      {3.25575763739159,97.4818060330363,10},
      {3.27200457191872,94.4909198569915,10},
      {3.28775305601193,91.3646489339337,10},
      {3.3029803980658,87.5626016041756,10},
      {3.31757415990059,85.1624977495876,10},
      {3.33176788657895,81.1512236192763,10},
      {3.34529310326359,78.1855404229719,10},
      {3.35832420386591,74.815439275887,10},
      {3.37079336853148,71.7858728362464,10},
      {3.38275770871666,68.4058281766691,10},
      {3.39415858319393,64.8903834723672,10},
      {3.40497381028158,61.7060806806321,10},
      {3.41525795181739,58.589198728024,10},
      {3.42502299100872,55.5736717631371,10},
      {3.43428524541453,51.0859121630421,10},
      {3.44279944172668,49.1892598192319,10},
      {3.4509977402958,44.1575939102262,10},
      {3.45835721434953,42.6635888070873,10},
      {3.46546784562908,38.1840134826591,10},
      {3.47183194858613,34.860222332794,10},
      {3.47764201942404,31.4104315819376,10},
      {3.48287689630854,27.9143289216476,10},
      {3.48752944030758,24.9216796843493,10},
      {3.49168302394899,22.4225384453362,10},
      {3.49541999991315,19.1239483629977,10},
      {3.49860753307164,16.2162951231567,10},
      {3.50131012877472,13.353185950961,10},
      {3.50353569084002,13.2353648889949,10},
      {3.5057416208422,8.78275369334679,10},
      {3.50720535687347,5.89444488778501,10},
      {3.50818772491535,9.4720054716883,10},
      {3.50976644874493,2.41005716717692,10},
      {3.51016801367251,13.7599291538937,10},
      {3.51246139559225,10.7825317349877,10},
  }; 
  public static double PointsL[][] = new double[][] {
      {0,24.9996081390812,10},
      {0.00416660138639187,14.1420573828726,10},
      {0.00652361098008232,25.4018977957456,10},
      {0.010757261110679,35.7746430393137,10},
      {0.0167197015375557,11.6077505294871,10},
      {0.0186543262274256,3.65493282340515,10},
      {0.0192634818971821,14.2587483263997,10},
      {0.0216399395532041,9.12506771586305,10},
      {0.023160785048946,7.11235067859134,10},
      {0.0243461764303333,6.59132209726919,10},
      {0.0254447293961313,8.33555856060219,10},
      {0.0268339886781782,6.62823690934403,10},
      {0.0279386965825983,9.02480938283674,10},
      {0.0294428301252529,8.78275369334679,10},
      {0.0309066219294239,12.2190623798131,10},
      {0.0329431337602198,14.9637959479997,10},
      {0.0354371009466868,16.0556997475474,10},
      {0.0381130491517486,17.9371021851793,10},
      {0.0411025645891002,19.9679384056476,10},
      {0.0444305578291004,22.6159627098822,10},
      {0.0481998820790932,22.8351406717836,10},
      {0.0520057415666935,28.1194693210092,10},
      {0.0566923189901059,29.4592849652407,10},
      {0.0616021991802414,32.8024162469037,10},
      {0.0670692706262905,35.1737909992442,10},
      {0.0729315688074622,38.4161218352287,10},
      {0.0793342506807631,41.1127756521933,10},
      {0.0861863825057472,43.5269228059629,10},
      {0.0934408680465628,47.4215863057327,10},
      {0.10134447054472,49.874417547526,10},
      {0.1096568725132,53.1612914950488,10},
      {0.118517083937947,55.5056963819674,10},
      {0.127768032378835,58.9900829074418,10},
      {0.137599712226004,62.0718145433891,10},
      {0.147945012737688,64.4162232547356,10},
      {0.158681058233071,68.0670603549061,10},
      {0.170025570204436,70.5779196409488,10},
      {0.181788554261642,73.8378237230498,10},
      {0.194094846104796,76.7454750506768,10},
      {0.206885772636144,80.1618900194094,10},
      {0.2202460768035,82.5877475713529,10},
      {0.234010702673535,85.9133094313272,10},
      {0.248329583754328,88.7377335593923,10},
      {0.263119220037129,91.7983543534325,10},
      {0.278418955323771,95.2575417235942,10},
      {0.294295207178466,97.8651131419098,10},
      {0.310606041521454,100.836647712873,10},
      {0.327412171145358,104.193263927247,10},
      {0.344777687087428,107.166573032748,10},
      {0.362638785142504,109.906003075569,10},
      {0.380956456146194,113.475387510715,10},
      {0.399869016906885,115.945791998625,10},
      {0.419193341069508,119.501691501059,10},
      {0.439110260332404,122.333741538321,10},
      {0.459499241476834,125.274221754884,10},
      {0.480378259313842,128.39110753192,10},
      {0.50177679380835,131.588895256366,10},
      {0.523708262328175,134.649508401551,10},
      {0.546149845786958,137.57241154757,10},
      {0.569078565747175,140.714500304347,10},
      {0.592530977365329,143.78452154212,10},
      {0.616495097434057,146.678680288181,10},
      {0.640941541599135,150.126157260169,10},
      {0.665962542312978,152.770642056399,10},
      {0.691424308340188,156.05574911824,10},
      {0.717433604959132,159.240059558831,10},
      {0.743973668427594,162.192242524713,10},
      {0.771005680802575,165.028392348663,10},
      {0.798510392463737,168.495205628021,10},
      {0.826592975177827,171.487851040892,10},
      {0.855174263287694,174.302874725223,10},
      {0.884224744958183,177.641921517909,10},
      {0.913831744625927,180.710168221145,10},
      {0.943950070301458,183.695195373675,10},
      {0.9745659540444,186.697784299038,10},
      {1.00568226417567,189.95183700648,10},
      {1.03734087818056,193.072248906023,10},
      {1.06951961437737,195.908398729973,10},
      {1.10217104986036,199.201124052155,10},
      {1.13537116326344,202.153322315749,10},
      {1.16906335305398,205.453681195982,10},
      {1.20330575053577,208.295674745736,10},
      {1.23802161218931,211.499321493697,10},
      {1.27327149145607,214.476730385887,10},
      {1.30901765398095,217.788792015438,10},
      {1.34531580893009,220.651911704811,10},
      {1.38209112499794,223.66799321174,10},
      {1.41936909837037,226.540490398279,10},
      {1.4571258901136,228.896613332227,10},
      {1.49527532311936,231.401613594755,10},
      {1.53384225616886,233.832787101454,10},
      {1.57281432361197,235.884730339401,10},
      {1.61212842238864,237.838186910539,10},
      {1.65176810745897,239.744801888981,10},
      {1.69172560248627,241.585743791838,10},
      {1.73198994411062,242.933196818549,10},
      {1.77247877965162,244.276550058572,10},
      {1.81319159918556,244.121798408766,10},
      {1.85387854009083,242.615539838694,10},
      {1.89431447104614,240.950980549741,10},
      {1.93447287601816,239.272408557031,10},
      {1.97435171531203,237.17414384858,10},
      {2.01388061945472,235.238249050275,10},
      {2.05308699684605,232.84167896705,10},
      {2.0918939764856,230.54004648156,10},
      {2.13031736600861,228.021568935177,10},
      {2.16832083335021,225.234050536171,10},
      {2.20585988766604,222.339891790111,10},
      {2.24291655414506,219.349005614066,10},
      {2.27947477019015,215.946075578044,10},
      {2.31546569609946,212.982174565133,10},
      {2.35096276088831,209.637268748933,10},
      {2.38590222409201,206.694463280217,10},
      {2.42035139564126,203.26633791331,10},
      {2.45422919766499,200.05097311832,10},
      {2.48757106986156,197.160898861237,10},
      {2.52043106414503,193.749784549549,10},
      {2.55272274844528,190.499831628796,10},
      {2.58447263879562,187.684807944464,10},
      {2.61575365428766,183.981797999131,10},
      {2.64641715215773,181.182561553095,10},
      {2.67661432478809,177.92266511985,10},
      {2.70626791873552,174.670386946945,10},
      {2.73537971873305,171.389364374081,10},
      {2.76394462554349,168.290063316445,10},
      {2.79199297962804,165.202465008128,10},
      {2.81952682068157,161.899796173453,10},
      {2.84650994412013,158.547272096913,10},
      {2.87293470108795,155.711122272962,10},
      {2.89888650380774,152.267194370049,10},
      {2.92426438738341,149.158485219824,10},
      {2.94912418846204,145.790158607276,10},
      {2.97342230856577,142.934672475956,10},
      {2.99724492480288,139.380539859202,10},
      {3.02047500968017,136.221440047208,10},
      {3.04317859831909,133.141475296942,10},
      {3.06536869377441,130.049792499646,10},
      {3.087043766275,126.596464152999,10},
      {3.10814313489846,123.43150531749,10},
      {3.1287149874361,120.217907408181,10},
      {3.1487514200703,116.994916703994,10},
      {3.16825064806805,113.843442801196,10},
      {3.18722439967485,110.687876760564,10},
      {3.20567241992884,107.396910675208,10},
      {3.22357201722459,104.007473220753,10},
      {3.24090636407943,100.836647712873,10},
      {3.25771268492473,97.8533950948802,10},
      {3.27402157518354,94.3748714173485,10},
      {3.28975068217549,91.0047702702636,10},
      {3.30491810819254,88.3175054237487,10},
      {3.31963756622371,84.2177034368312,10},
      {3.3336739814352,81.7127031743034,10},
      {3.34729276912202,78.15857055755,10},
      {3.36031928041088,74.9971454934034,10},
      {3.37281878553764,71.4799339034202,10},
      {3.38473213335106,68.3014901351999,10},
      {3.39611567042194,65.2350103176449,10},
      {3.40698800896595,61.8491028101249,10},
      {3.41729637187835,58.3301205100325,10},
      {3.42701806755368,54.7332154918499,10},
      {3.43614009293717,52.5535019428019,10},
      {3.44489905263375,47.7720721745252,10},
      {3.45286100155977,46.0858589749067,10},
      {3.46054198251742,40.8244099654835,10},
      {3.46734614964272,38.5169222809072,10},
      {3.47376557932312,34.9762784212927,10},
      {3.4795950272623,31.5616341626694,10},
      {3.48485540033268,28.3984403006275,10},
      {3.48958825731724,25.037733860634,10},
      {3.49376121805992,21.5398643146627,10},
      {3.49735133599342,19.1626324510213,10},
      {3.50054498823652,16.7273763675585,10},
      {3.50333299616229,14.5804859708053,10},
      {3.50576303763834,10.0293957572029,10},
      {3.50743456758451,10.1495401591072,10},
      {3.50912623951753,9.03829431554769,10},
      {3.51063255417921,1.8139861400131,10},
      {3.51093493894372,10.3892772891938,10},
      {3.51266638492671,8.77689658204593,10},
      {3.51412935607239,12.8925058855055,10},
   }; 
}; 