package org.usfirst.frc.team3539.robot.profiles;
public class RightSwitchReverse implements IProfile
{
  public static final int kNumPoints = 178;
  public static double PointsR[][] = new double[][] {
      {0,-0.29837821817412,10},
      {-6.21621295643568E-05,-2.81008849917715,10},
      {-0.000658752100437322,-3.13539887630452,10},
      {-0.00129887356020552,-3.67232871167865,10},
      {-0.00201944071512927,-4.34362647430267,10},
      {-0.00284413987047002,-4.98247277121657,10},
      {-0.00376859621437259,-5.63093559203906,10},
      {-0.00479525192788371,-6.38200112017936,10},
      {-0.00594189856821148,-7.08062370293806,10},
      {-0.00720037237615107,-7.94804840548672,10},
      {-0.00859929282035073,-8.83169680916313,10},
      {-0.0101417752160224,-10.176805461583,10},
      {-0.0119078203199998,-11.698485080981,10},
      {-0.0139237499563677,-13.3499284945128,10},
      {-0.0162104978880548,-15.1430736538112,10},
      {-0.0187877210768064,-17.0680238956253,10},
      {-0.0216739809451305,-19.1491169228873,10},
      {-0.0248896057215413,-21.3172118600306,10},
      {-0.0284424753209867,-23.6413358058924,10},
      {-0.0323826977162754,-26.0160225127785,10},
      {-0.0367187025838632,-28.6196337360226,10},
      {-0.04148864058376,-31.0057937265539,10},
      {-0.0466562712780074,-33.7606037061019,10},
      {-0.0522830404745717,-36.5222116062096,10},
      {-0.0583700755829221,-39.296053851111,10},
      {-0.064919416297929,-42.1510122113837,10},
      {-0.0719445875494449,-45.1112570712402,10},
      {-0.079463125932819,-48.0485285928112,10},
      {-0.0874712149877279,-51.1070803713674,10},
      {-0.0959890604414798,-54.0992324330411,10},
      {-0.10500560332345,-57.1219110780668,10},
      {-0.11452591896814,-60.2036312407304,10},
      {-0.124559863244904,-63.2597200877307,10},
      {-0.135103141639932,-66.2824599236025,10},
      {-0.146150224667912,-69.2929348192575,10},
      {-0.157699040763742,-72.2784897428353,10},
      {-0.169745462732332,-75.2121930731926,10},
      {-0.182280821870485,-78.1369931354414,10},
      {-0.195303652147511,-81.01154786418,10},
      {-0.20880558762742,-83.8072658365648,10},
      {-0.222773465904252,-86.5746983403365,10},
      {-0.23720257018362,-89.2969261065461,10},
      {-0.252085395025805,-91.9633937142403,10},
      {-0.267412634322963,-94.5432150838462,10},
      {-0.283169818989607,-97.0441996970982,10},
      {-0.299343866295359,-99.5018841378734,10},
      {-0.315927509827244,-101.853325972094,10},
      {-0.332903061606308,-104.14570334211,10},
      {-0.350260673730755,-106.330591342082,10},
      {-0.367982435130008,-108.400379360526,10},
      {-0.386049191794424,-110.384897934918,10},
      {-0.404446665859912,-112.250239687661,10},
      {-0.423155034041952,-113.973871089674,10},
      {-0.442150680498373,-115.606297535564,10},
      {-0.461418403128347,-117.092332530998,10},
      {-0.480933789333895,-118.415324516977,10},
      {-0.500669685677056,-119.587022135956,10},
      {-0.520600850933812,-120.615877373553,10},
      {-0.540703478040598,-121.434610894472,10},
      {-0.560942605352529,-122.093062642868,10},
      {-0.581291430004201,-122.540092369107,10},
      {-0.601714767259102,-122.791410822926,10},
      {-0.622180045739772,-122.807014488684,10},
      {-0.64264787383903,-122.596028451305,10},
      {-0.663080517201777,-122.145847396492,10},
      {-0.683438138037577,-121.418532999657,10},
      {-0.703674588249991,-120.435027827882,10},
      {-0.723747097987208,-119.146386853136,10},
      {-0.743604802358402,-117.569544642079,10},
      {-0.763199768534122,-115.682870230612,10},
      {-0.782480239257035,-113.455148638365,10},
      {-0.801389421773097,-110.904347027525,10},
      {-0.819873455389642,-108.016636266874,10},
      {-0.837876248497736,-104.765352445218,10},
      {-0.85533712017499,-101.155826815026,10},
      {-0.872196473086915,-97.2177369366592,10},
      {-0.888399426693406,-92.9181697837679,10},
      {-0.903885746255327,-88.2784809616436,10},
      {-0.918598830240029,-83.3481738647872,10},
      {-0.932490235894343,-78.1349049978179,10},
      {-0.945512667793465,-72.8199445934737,10},
      {-0.95764936219518,-67.7260896626834,10},
      {-0.968937033607153,-62.9660307974097,10},
      {-0.979431391195527,-58.6013833552551,10},
      {-0.989198278860333,-54.6978204118046,10},
      {-0.998314567601994,-51.344103113765,10},
      {-1.00687191620874,-48.5606424327411,10},
      {-1.01496536171343,-46.3968308548253,10},
      {-1.02269816366888,-44.8644820377442,10},
      {-1.0301755575823,-44.0051522148607,10},
      {-1.037509790412,-43.8442355873094,10},
      {-1.04481712476561,-44.3906698430498,10},
      {-1.05221560798373,-45.6492278680784,10},
      {-1.0598237973307,-47.6181542499974,10},
      {-1.06776018633038,-50.2982635919457,10},
      {-1.07614314102572,-53.6669573495701,10},
      {-1.08508771295549,-57.7184070947789,10},
      {-1.09470742388732,-62.415271113735,10},
      {-1.10510999520653,-67.7291339072772,10},
      {-1.11639817654222,-73.611119287077,10},
      {-1.12866668622493,-79.888321044174,10},
      {-1.14198143189514,-86.231807785317,10},
      {-1.15635337691279,-92.5324073921944,10},
      {-1.17177538234584,-98.7152834600166,10},
      {-1.18822794361208,-104.715780211015,10},
      {-1.20568059276939,-110.463206920225,10},
      {-1.22409113363014,-115.91043133843,10},
      {-1.24340959367001,-121.041084914299,10},
      {-1.2635830683033,-125.838913829332,10},
      {-1.28455623080666,-130.258988704776,10},
      {-1.30626610560098,-134.29643721951,10},
      {-1.32864882474061,-137.94220312831,10},
      {-1.35163911798973,-141.197127805309,10},
      {-1.37517197007433,-144.068324686367,10},
      {-1.39918338556786,-146.564528764767,10},
      {-1.42361077133399,-148.696356652308,10},
      {-1.44839357393127,-150.479717968978,10},
      {-1.47347353457495,-151.936228381165,10},
      {-1.4987962189082,-153.076091462456,10},
      {-1.52430884982624,-153.921106451778,10},
      {-1.54996234717125,-154.475832067166,10},
      {-1.575708395671,-154.760843730624,10},
      {-1.60150186707649,-154.790337718447,10},
      {-1.62730018275729,-154.574242245419,10},
      {-1.65306267629693,-154.126462931315,10},
      {-1.67875033853102,-153.46376606797,10},
      {-1.70432760228026,-152.591781213226,10},
      {-1.72975966525093,-151.524674047957,10},
      {-1.75501376484416,-150.275371138402,10},
      {-1.7800596880797,-148.852898134363,10},
      {-1.80486849678657,-147.265026273295,10},
      {-1.82941265508402,-145.523886640439,10},
      {-1.85366653930526,-143.636684457925,10},
      {-1.87760605555461,-141.612980795456,10},
      {-1.9012082572648,-139.457670920721,10},
      {-1.92445109023504,-137.183727293095,10},
      {-1.94731504988312,-134.794163561749,10},
      {-1.96978075910779,-132.295940185428,10},
      {-1.99183011561707,-129.698327577316,10},
      {-2.01344654689014,-127.003176760509,10},
      {-2.03461373536804,-124.214472788859,10},
      {-2.05531612837737,-121.34667199976,10},
      {-2.07554059538243,-118.392523277947,10},
      {-2.09527260355724,-115.368364579331,10},
      {-2.11450067961817,-112.267296636013,10},
      {-2.13321194799136,-109.100945708755,10},
      {-2.15139544531686,-105.876203416599,10},
      {-2.16904135556313,-102.579936674198,10},
      {-2.18613807796558,-99.2366830108433,10},
      {-2.20267745374473,-95.8323685319285,10},
      {-2.2186495393881,-92.3788413150317,10},
      {-2.23404617611619,-88.8775163984692,10},
      {-2.24885895018768,-85.3192381018921,10},
      {-2.26307893793749,-81.7271977559751,10},
      {-2.27670002028104,-78.0828927786265,10},
      {-2.28971378347696,-74.3937196133696,10},
      {-2.30211283363136,-70.6773241704505,10},
      {-2.31389232646892,-66.9299432128338,10},
      {-2.32504741771433,-63.1581738786153,10},
      {-2.33557377301598,-59.4096914857686,10},
      {-2.34547547176362,-55.6679783302725,10},
      {-2.35475327884282,-51.9615608196969,10},
      {-2.36341356830005,-48.2608875997996,10},
      {-2.37145710502088,-44.6477823051101,10},
      {-2.37889842183128,-41.040000614032,10},
      {-2.38573828361681,-37.5662230515015,10},
      {-2.39199938198291,-34.1877196363605,10},
      {-2.39769726960295,-30.8269749520882,10},
      {-2.40283526098112,-27.6201826121947,10},
      {-2.40743859734142,-25.8240802140367,10},
      {-2.41174260847951,-24.0413403668975,10},
      {-2.41574958905212,-22.2719898417722,10},
      {-2.41946157875412,-20.5432279697556,10},
      {-2.42288546155569,-18.8311214811639,10},
      {-2.42602378707543,-17.175769502337,10},
      {-2.42888649882583,-15.5763679473127,10},
      {-2.43148252047194,-14.0287816534439,10},
      {-2.43382077567883,-12.5577116443117,10},
  }; 
  public static double PointsL[][] = new double[][] {
      {0,-0.29837821817412,10},
      {-6.21621295643568E-05,-2.5926245980469,10},
      {-0.000578680569279124,-3.29521263446546,10},
      {-0.00120526259574919,-3.86577353252448,10},
      {-0.00192098572434228,-4.3847515034218,10},
      {-0.00271810306098254,-5.02166694230892,10},
      {-0.00361695142420756,-5.73694347433206,10},
      {-0.00463114363599502,-6.43866479978192,10},
      {-0.00575887529342444,-7.28396614314179,10},
      {-0.00702445616317757,-8.05255759010356,10},
      {-0.00841542050265505,-8.89803820352039,10},
      {-0.00994485502601465,-10.3247094732667,10},
      {-0.011711445907721,-11.8617785904608,10},
      {-0.0137304858795771,-13.5384785257235,10},
      {-0.0160245530093118,-15.3676230246725,10},
      {-0.0186150959632951,-17.3476794478343,10},
      {-0.0215238601994358,-19.4491126947853,10},
      {-0.0247653795396291,-21.8054497966949,10},
      {-0.0283996218098162,-24.1046575949073,10},
      {-0.0324170637861938,-26.5864818244719,10},
      {-0.0368481435325434,-29.0595729729686,10},
      {-0.0416914069695141,-31.9583152958452,10},
      {-0.0470177912586434,-34.6832928257019,10},
      {-0.0527983422938433,-37.582568656268,10},
      {-0.0590621018243406,-40.6371965718175,10},
      {-0.0658349683976971,-43.7640143880624,10},
      {-0.0731289730266237,-46.9232939481674,10},
      {-0.0809495216992826,-50.2289114167385,10},
      {-0.0893210031109778,-53.5213996243918,10},
      {-0.0982412421183516,-56.9727507418238,10},
      {-0.107736698981811,-60.4701670930912,10},
      {-0.117815062394909,-63.9686428108819,10},
      {-0.128476499676366,-67.5365663145767,10},
      {-0.13973259565564,-71.1647628016875,10},
      {-0.151593389455922,-74.814827367426,10},
      {-0.164062522251255,-78.488412164637,10},
      {-0.177143930015337,-82.2077753635923,10},
      {-0.190845229733697,-85.9263124861251,10},
      {-0.20516627799029,-89.6808374750249,10},
      {-0.220113082323913,-93.4955360122157,10},
      {-0.235695665922641,-97.3159482446618,10},
      {-0.251915000828559,-101.153937547652,10},
      {-0.268774003167927,-105.015921311173,10},
      {-0.286276656719789,-108.928196301338,10},
      {-0.304431343355252,-112.877568241956,10},
      {-0.323244277769625,-116.823268731807,10},
      {-0.342714822558259,-120.823520860963,10},
      {-0.362852060737375,-124.825692852916,10},
      {-0.383656342879528,-128.872220559441,10},
      {-0.405135062878622,-132.965062087614,10},
      {-0.427295901460654,-137.068688502413,10},
      {-0.450140675228867,-141.210421516626,10},
      {-0.473675758229731,-145.407134506066,10},
      {-0.497910265349697,-149.601323373104,10},
      {-0.522843814145977,-153.84207847403,10},
      {-0.548484149085032,-158.139358619048,10},
      {-0.574840703755636,-162.474867745172,10},
      {-0.601919884074491,-166.833308140875,10},
      {-0.629725386988551,-171.275794163706,10},
      {-0.658271362880976,-175.745739578728,10},
      {-0.687562337324761,-180.288318528079,10},
      {-0.717610421008197,-184.881563498008,10},
      {-0.74842396393216,-189.559955530296,10},
      {-0.780017307701206,-194.309007692126,10},
      {-0.812402116820374,-199.136996045434,10},
      {-0.845591649306322,-204.078049784639,10},
      {-0.879604644855669,-209.107814952987,10},
      {-0.914455954996689,-214.273546181386,10},
      {-0.95016820759435,-219.557482826754,10},
      {-0.986761162192706,-224.982510265534,10},
      {-1.0242582115423,-230.581901020298,10},
      {-1.06268854877597,-236.342652036247,10},
      {-1.10207900862934,-242.285354033097,10},
      {-1.14245986782315,-248.446476755128,10},
      {-1.1838675859032,-254.833867928353,10},
      {-1.22633989722459,-261.434065566629,10},
      {-1.26991224148569,-268.301300057318,10},
      {-1.31462910953087,-275.427371827042,10},
      {-1.36053371739518,-282.775321604752,10},
      {-1.40766290706721,-290.363659621396,10},
      {-1.45605683503973,-298.042101158932,10},
      {-1.50573054406241,-305.506282948824,10},
      {-1.55664821199408,-312.676473318591,10},
      {-1.60876101363878,-319.523576020911,10},
      {-1.66201489708247,-326.014731571423,10},
      {-1.71635071117389,-332.091196757864,10},
      {-1.77169923376839,-337.748137503392,10},
      {-1.82799060531667,-342.833953486775,10},
      {-1.88512959756447,-347.237736299443,10},
      {-1.94300262500369,-350.925525021807,10},
      {-2.00149011052259,-353.874984995037,10},
      {-2.06046928998614,-356.073878049912,10},
      {-2.11981497712169,-357.509415299595,10},
      {-2.1793999459617,-358.169419765711,10},
      {-2.23909467588192,-358.032872392622,10},
      {-2.29876696915857,-357.097264355638,10},
      {-2.35828322577765,-355.333040476088,10},
      {-2.41750525641169,-352.745096021661,10},
      {-2.47629614654253,-349.339458290699,10},
      {-2.53451949157572,-345.140267071992,10},
      {-2.5920427113447,-340.287465830586,10},
      {-2.64875744705948,-335.090282507287,10},
      {-2.70460582237813,-329.62260504877,10},
      {-2.75954296401349,-323.924054527889,10},
      {-2.81353011776303,-318.023818978238,10},
      {-2.8665341385851,-311.959163625095,10},
      {-2.91852723563711,-305.75872578444,10},
      {-2.96948722723734,-299.536565193417,10},
      {-3.01940977903419,-293.40273358875,10},
      {-3.06831044370103,-287.389325569223,10},
      {-3.11620859833916,-281.491201103762,10},
      {-3.16312387501167,-275.71249057448,10},
      {-3.20907590578171,-270.050899324648,10},
      {-3.25408432271241,-264.500981368963,10},
      {-3.29816773801944,-259.05979954681,10},
      {-3.34134450895664,-253.725594621365,10},
      {-3.38363197293042,-248.495551813706,10},
      {-3.42504797727088,-243.36912040622,10},
      {-3.46560960442256,-238.346575757712,10},
      {-3.50533393683001,-233.406577560603,10},
      {-3.54423499739545,-228.549722425643,10},
      {-3.58232655405926,-223.759534717517,10},
      {-3.61961982514322,-219.02663693906,10},
      {-3.65612424423612,-214.348428479311,10},
      {-3.69184898996486,-209.716587383199,10},
      {-3.72680196614707,-205.12143019933,10},
      {-3.76098878194364,-200.564471401143,10},
      {-3.7944160663629,-196.03841398024,10},
      {-3.82708917360389,-191.538423859779,10},
      {-3.8590124380182,-187.062160489897,10},
      {-3.89018942907185,-182.609960420246,10},
      {-3.92062422615459,-178.176530642639,10},
      {-3.95032039873245,-173.761947645633,10},
      {-3.97928075138586,-169.364421596979,10},
      {-4.00750808869527,-164.98528339758,10},
      {-4.03500572516485,-160.618000924615,10},
      {-4.06177544552761,-156.267056407561,10},
      {-4.08781979940214,-151.931027159245,10},
      {-4.11314184633074,-147.606899530498,10},
      {-4.1377428611227,-143.298941582834,10},
      {-4.1616261582822,-139.008086476657,10},
      {-4.18479403246595,-134.724589569725,10},
      {-4.20724826840697,-130.461713977931,10},
      {-4.22899167068572,-126.20673965414,10},
      {-4.25002627899704,-121.971453485085,10},
      {-4.27035489792141,-117.747893011915,10},
      {-4.28997956715368,-113.531966096797,10},
      {-4.30890130654128,-109.341180970573,10},
      {-4.32712496035955,-105.153202974415,10},
      {-4.34465052860847,-100.984653071896,10},
      {-4.36148107083035,-96.8249911397737,10},
      {-4.37761862672006,-92.6750585521826,10},
      {-4.39306472604876,-88.5447146842018,10},
      {-4.40782191843503,-84.4111735945118,10},
      {-4.42189071380259,-80.291821132263,10},
      {-4.4352726419226,-76.1811807167287,10},
      {-4.4479692325662,-72.0739287442977,10},
      {-4.45998201550454,-67.9960177825753,10},
      {-4.47131456020366,-63.9623363293049,10},
      {-4.48197502544303,-59.9467252977757,10},
      {-4.49196596084124,-55.9868935469014,10},
      {-4.50129705494893,-52.0764428088359,10},
      {-4.50997646654557,-48.2660926461466,10},
      {-4.51802102311384,-44.4955203578551,10},
      {-4.52543684373836,-40.8684367792579,10},
      {-4.53224840475756,-37.2779376777773,10},
      {-4.53846131533235,-33.784850578872,10},
      {-4.54409189302168,-30.4872166035039,10},
      {-4.54917328286719,-27.2620440632108,10},
      {-4.55371670319068,-25.4409643265573,10},
      {-4.55795722882593,-23.6454528025071,10},
      {-4.56189791931526,-21.8841718202123,10},
      {-4.56554540366699,-20.1415119772735,10},
      {-4.5689022314997,-18.4565436289305,10},
      {-4.57197809136404,-16.8111982656561,10},
      {-4.57478012219205,-15.2290018555647,10},
      {-4.57731852245808,-13.7270151714366,10},
      {-4.57960604025507,-12.2803211095155,10},
   }; 
}; 
