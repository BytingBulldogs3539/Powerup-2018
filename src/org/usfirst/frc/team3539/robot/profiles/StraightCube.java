package org.usfirst.frc.team3539.robot.profiles;
public class StraightCube implements IProfile
{
  public static final int kNumPoints = 164;
  public static double PointsR[][] = new double[][] {
      {0,110.253827142556,10},
      {0.0183756369806613,0.681172614684688,10},
      {0.0184891667158418,63.7424584971011,10},
      {0.0291129094799897,49.8116663348427,10},
      {0.0374148520365918,15.1477585779663,10},
      {0.0399394803784668,0.586315628717768,10},
      {0.0400371984946238,10.0100613620468,10},
      {0.0417055414175603,4.55125801037575,10},
      {0.0424640848176675,8.20459485222051,10},
      {0.0438315169743353,8.91483413466994,10},
      {0.0453173231415004,0.859159576086086,10},
      {0.0454605160954385,9.87651329652409,10},
      {0.0471066016448592,12.1347499988396,10},
      {0.0491290626869689,7.85048007942172,10},
      {0.0504374751571078,11.2619916535564,10},
      {0.0523144724912246,15.9854956810296,10},
      {0.0549787243210148,13.5240365299351,10},
      {0.0572327305686884,19.5653427947527,10},
      {0.0604936210344806,19.503381326427,10},
      {0.063744181561213,21.6996546482028,10},
      {0.0673607956091328,25.7284618681379,10},
      {0.0716488716310488,26.0825771189902,10},
      {0.0759959633557146,29.3624485390616,10},
      {0.0808897092407241,33.3777211087233,10},
      {0.0864526582970121,34.6606369149305,10},
      {0.0922294327096788,38.7204239129215,10},
      {0.0986828360577611,40.9456711003293,10},
      {0.105507113299673,44.4443112685189,10},
      {0.112914496280177,46.2767438193392,10},
      {0.120627291697268,50.4545335396207,10},
      {0.129036379983134,53.0339992374336,10},
      {0.137875373800695,55.5359590797955,10},
      {0.147131365705852,58.9591050415999,10},
      {0.156957882575381,61.6584780267884,10},
      {0.167234295579845,65.0312906932414,10},
      {0.178072851677575,67.5178113202448,10},
      {0.189325816406521,71.3570320890132,10},
      {0.201218655725428,73.1855522501106,10},
      {0.213416254141159,76.885410866869,10},
      {0.22623049374747,80.2059856728856,10},
      {0.239598144003382,82.5899504418127,10},
      {0.253363136381089,85.8214925667428,10},
      {0.267666735685471,88.753069515198,10},
      {0.282458889716628,92.2400757737713,10},
      {0.297832261175109,94.637571368544,10},
      {0.313605189736533,98.1129437175012,10},
      {0.329957327900644,101.056146926717,10},
      {0.34680001268105,104.016797175929,10},
      {0.364136144268895,106.987069685691,10},
      {0.38196734804603,110.102517477844,10},
      {0.40031774977834,113.156001889457,10},
      {0.419177087251011,116.494031384325,10},
      {0.438592751499543,119.110184818808,10},
      {0.458444464267055,122.382334718986,10},
      {0.478841508580269,125.298468627654,10},
      {0.499724605807018,128.555190785758,10},
      {0.521150453090647,131.357119629023,10},
      {0.5430433267591,134.795708630613,10},
      {0.565509290945629,137.479646224871,10},
      {0.588422521972924,140.732444519968,10},
      {0.611877929392919,143.90985569266,10},
      {0.635862892593603,146.63629032954,10},
      {0.660302325307565,149.869737019555,10},
      {0.685280619910061,153.215484209889,10},
      {0.710816516097712,155.854905463604,10},
      {0.736792348972691,158.981880081392,10},
      {0.763289323887019,162.416659952812,10},
      {0.790358751914776,165.133472329141,10},
      {0.817880992203729,168.4114353597,10},
      {0.845949552015586,171.432044989241,10},
      {0.874521597758072,174.412039194679,10},
      {0.903590245460999,177.542930026618,10},
      {0.933180736348388,180.664198598007,10},
      {0.963291413168155,183.754474005842,10},
      {0.993917176683125,186.693761000906,10},
      {1.02503278566928,189.993094934468,10},
      {1.05669834738483,192.949836618385,10},
      {1.08885668663293,196.156206358997,10},
      {1.12154929845611,198.944612025272,10},
      {1.15470670574785,202.367765635932,10},
      {1.18843471767955,205.165778265046,10},
      {1.22262905485095,208.530877060462,10},
      {1.25738418063075,211.416025454433,10},
      {1.2926201644762,214.514041504301,10},
      {1.32837257356662,217.751404408467,10},
      {1.36466435446929,220.719772353144,10},
      {1.40145101633986,223.688140297821,10},
      {1.43873243169739,226.39913954377,10},
      {1.47646563946868,228.382564331789,10},
      {1.51452940528989,227.784607383626,10},
      {1.5524934810243,225.065898091067,10},
      {1.59000448953567,222.066536982837,10},
      {1.62701551784196,219.115623727011,10},
      {1.66353485220359,215.706008591053,10},
      {1.69948574910107,212.786073201069,10},
      {1.734950178772,209.419077489425,10},
      {1.76985330991082,206.20877623695,10},
      {1.80422140358898,203.213346640581,10},
      {1.83809028194765,199.832812454235,10},
      {1.87139582207934,196.76768648415,10},
      {1.90419041864604,193.549675185066,10},
      {1.93644870294279,190.532981769675,10},
      {1.96820420245402,187.045975511101,10},
      {1.99937851640816,183.994388015718,10},
      {2.03004430893496,180.749315064942,10},
      {2.06016919987835,177.798386511406,10},
      {2.08980226939616,174.232076916277,10},
      {2.11884089534021,171.379803304377,10},
      {2.1474042723795,167.993455987651,10},
      {2.17540316386344,164.941883789979,10},
      {2.20289340643912,161.605865944176,10},
      {2.22982783216265,158.349151434928,10},
      {2.25621918912698,155.367245015549,10},
      {2.2821138803904,152.170589321756,10},
      {2.30747544640711,148.857732211205,10},
      {2.33228527496142,145.548776017093,10},
      {2.35654336605332,142.514643210562,10},
      {2.38029586777926,139.257928701314,10},
      {2.403505300746,136.107701562005,10},
      {2.42619002220736,132.779393762812,10},
      {2.44831994666401,129.632975753673,10},
      {2.46992541457715,126.552414392658,10},
      {2.49101738930671,123.071221264465,10},
      {2.51152932580754,120.195794566169,10},
      {2.53156193401386,116.561700811264,10},
      {2.55098900780557,113.695896373519,10},
      {2.56993828307392,110.257315020784,10},
      {2.58831440408374,107.17866587371,10},
      {2.60617754183368,103.794223122068,10},
      {2.62347670395201,100.893631688311,10},
      {2.64029220342422,97.2441025424758,10},
      {2.65649961886324,94.1673503116305,10},
      {2.67219405104239,90.8390578101486,10},
      {2.68733394117869,87.7720349238344,10},
      {2.70196263278814,84.4262877335003,10},
      {2.71603372281243,81.3844372315036,10},
      {2.7295976936996,77.9265042736871,10},
      {2.74258545078593,74.2150117473125,10},
      {2.75495467040286,71.5988583128302,10},
      {2.76688790524126,68.1022221448507,10},
      {2.7782382972705,65.1900044503329,10},
      {2.78910324192061,60.8747533186986,10},
      {2.7992489391671,58.6359714810174,10},
      {2.80902162721419,54.9167612591774,10},
      {2.81817450298259,51.4375759556222,10},
      {2.82674734052226,47.9118664868858,10},
      {2.83473274593929,45.2589144073256,10},
      {2.84227579253134,41.7468428484155,10},
      {2.84923370165749,37.5438845682444,10},
      {2.8554909755957,34.9818659104279,10},
      {2.86132118842046,30.8234220585861,10},
      {2.86645841491305,27.9131051047254,10},
      {2.87111070395023,25.2775981529478,10},
      {2.87532369370474,20.7456912696,10},
      {2.87878123147167,20.4689747902181,10},
      {2.88219262114217,15.0469696055714,10},
      {2.884700680947,15.4262495918854,10},
      {2.88727171633095,9.11213923740888,10},
      {2.88879026916185,10.7511742946785,10},
      {2.89058214110537,4.54734848897366,10},
      {2.89134014271153,7.70149471075439,10},
      {2.89262362070863,7.01652772580086,10},
      {2.89379313075486,4.39064255652011,10},
      {2.89452487128957,26.7518539105055,10},
  }; 
  public static double PointsL[][] = new double[][] {
      {0,109.650095308292,10},
      {0.0182750166814711,1.60618680716671,10},
      {0.0185427146818545,65.2401274021507,10},
      {0.0294160690895285,47.6250382201845,10},
      {0.0373535775311243,18.2902708901308,10},
      {0.040401953303843,3.65143275481315,10},
      {0.0410105273418592,4.44869211317631,10},
      {0.0417519763460909,11.6489922036566,10},
      {0.0436934750467003,0.642474722866685,10},
      {0.0438005510598304,1.9253736776886,10},
      {0.0441214484455602,12.2140514231811,10},
      {0.046157123682757,5.65420627959237,10},
      {0.0470994905992666,6.108982862559,10},
      {0.0481176568796361,13.3460772956359,10},
      {0.0503419999085522,13.1428510224291,10},
      {0.0525324768318198,11.8792868213033,10},
      {0.054512359243513,18.0675725423642,10},
      {0.0575236221306629,16.0009339402811,10},
      {0.0601904434979361,20.3006406847901,10},
      {0.0635738829746631,22.6130140759854,10},
      {0.0673427172198336,23.3445066602805,10},
      {0.071233467055071,28.0292051741448,10},
      {0.0759050057125944,30.0436078280054,10},
      {0.0809122733652263,31.6129637214839,10},
      {0.0861811000147356,36.0770940939118,10},
      {0.0921939452059597,37.7838024025484,10},
      {0.098491248156003,41.3675628621015,10},
      {0.105385839098032,43.7128205964377,10},
      {0.112671310472248,47.7319003840556,10},
      {0.120626630389947,49.4483342127955,10},
      {0.128868017513199,52.7785389282182,10},
      {0.137664440667902,56.1900509804064,10},
      {0.147029444702804,58.7152748175728,10},
      {0.156815327026089,61.9797070222857,10},
      {0.167145282020898,64.5668904155639,10},
      {0.177906425324255,68.0712442790088,10},
      {0.189251638440732,70.2269136499644,10},
      {0.200956124686464,74.3930694606297,10},
      {0.213354967684355,76.7189794143122,10},
      {0.226141464253407,79.4203563997108,10},
      {0.239378191594834,83.0659769802507,10},
      {0.253222524915971,85.8872650774527,10},
      {0.267537055710049,88.996899739225,10},
      {0.282369876157681,91.5705484822298,10},
      {0.29763163806248,95.2296998886152,10},
      {0.313503236863253,97.8304179321668,10},
      {0.329808334564418,100.9516788547,10},
      {0.34663358632773,104.082569686639,10},
      {0.363980681275503,107.192196699555,10},
      {0.381846049941715,110.168289988553,10},
      {0.400207446904185,113.206339009236,10},
      {0.419075166247963,115.967667726108,10},
      {0.438403123617074,119.458483114852,10},
      {0.458312872077692,122.289500556585,10},
      {0.478694459328217,125.491969380758,10},
      {0.499609777359869,128.350048474182,10},
      {0.521001459754422,131.655088454143,10},
      {0.54294395537464,134.354568523312,10},
      {0.56533636306491,137.777615049992,10},
      {0.588299311654668,140.666664360402,10},
      {0.611743755714735,143.61569599771,10},
      {0.635679702498068,147.023291835747,10},
      {0.660183576821837,149.92008178819,10},
      {0.685170285165673,152.724014631665,10},
      {0.710624274856191,156.218639150578,10},
      {0.736660724913095,159.237336566179,10},
      {0.76320027845784,161.952252026279,10},
      {0.790192325561457,165.381111683339,10},
      {0.817755869671532,168.256637816759,10},
      {0.845798614595188,171.377906388148,10},
      {0.874361609191687,174.555210476859,10},
      {0.903454159568875,177.593259497542,10},
      {0.933053000457138,180.613869127083,10},
      {0.96315532727603,183.704144534918,10},
      {0.993772677049661,186.910529573242,10},
      {1.0249244268793,189.776326362132,10},
      {1.05655384775136,192.988524530836,10},
      {1.0887186247864,195.947270214963,10},
      {1.12137643431586,199.319987270719,10},
      {1.15459643474393,202.07359064327,10},
      {1.18827536651781,205.448311699236,10},
      {1.22251674415216,208.259985184744,10},
      {1.25722674168295,211.532135084922,10},
      {1.29248210262967,214.630135837078,10},
      {1.32825376134043,217.557903655363,10},
      {1.3645134170489,220.758460265595,10},
      {1.40130658044686,223.688140297821,10},
      {1.43858786832346,226.437842753933,10},
      {1.47632757762215,228.42125224424,10},
      {1.51439771748982,227.730468782532,10},
      {1.55235286955919,225.027194880904,10},
      {1.58985737654315,222.221349823489,10},
      {1.62689428347811,218.910496713147,10},
      {1.66337932546974,215.94983881508,10},
      {1.69937101626462,212.503539766879,10},
      {1.73478827799167,209.523545561442,10},
      {1.76970887401782,206.375215338362,10},
      {1.80410463105766,202.992768938075,10},
      {1.83793679490867,200.014671648867,10},
      {1.87127254802062,196.717357013227,10},
      {1.90405885832691,193.561316743537,10},
      {1.9363190548376,190.211760423033,10},
      {1.96802101235848,187.328508945292,10},
      {1.99924236677557,184.00602957419,10},
      {2.02991007151631,180.86540939772,10},
      {2.06005433956097,177.450088215361,10},
      {2.08962927777497,174.634513813415,10},
      {2.11873508616882,171.108911428659,10},
      {2.1472533349591,168.10956561814,10},
      {2.17527160354431,164.771635558396,10},
      {2.20273354535366,161.721960276953,10},
      {2.2296870932166,158.581355398195,10},
      {2.25611720438347,155.173744262446,10},
      {2.28197951549082,151.980897698823,10},
      {2.3073097211989,148.880984732726,10},
      {2.33212337418109,145.79260624112,10},
      {2.35642200420854,142.425610529475,10},
      {2.38015971814667,139.269554962075,10},
      {2.40337119080828,136.018668880919,10},
      {2.42604112448183,132.922565044992,10},
      {2.44819476039135,129.656228275194,10},
      {2.46980405273237,126.308584168631,10},
      {2.49085548852638,123.353747049799,10},
      {2.51141459297109,119.812602190132,10},
      {2.53138320575085,116.999031788395,10},
      {2.55088319863417,113.436630758562,10},
      {2.56978913038654,110.412120212581,10},
      {2.58819125750595,107.050937631316,10},
      {2.60603297845976,103.972280835385,10},
      {2.6233617161537,100.417597501017,10},
      {2.64009817744969,97.59240083852,10},
      {2.65636346923065,94.1789842212467,10},
      {2.67205994110467,91.0441848240126,10},
      {2.68723399613005,87.5939695616615,10},
      {2.70183311216388,84.449547903877,10},
      {2.71590802661605,80.9858018156802,10},
      {2.72940545245808,77.9148703640709,10},
      {2.7423914248114,75.0896737015738,10},
      {2.75490622764969,71.1615273356996,10},
      {2.76676654339648,68.0905882352345,10},
      {2.77811489573085,64.4314368288491,10},
      {2.78885363426086,62.1596731251159,10},
      {2.79921349946873,57.7883788273029,10},
      {2.80884493864606,54.8626226580838,10},
      {2.81798863578754,51.6852114853916,10},
      {2.82660277714833,48.5426943926922,10},
      {2.83469322685118,44.4578459187923,10},
      {2.84210292839109,41.2204830146262,10},
      {2.84897313063781,38.6274826665399,10},
      {2.85541091757205,34.3239648796468,10},
      {2.86113175175938,31.6206833291632,10},
      {2.8664018133804,27.8860358041786,10},
      {2.87104951310412,24.2094373577968,10},
      {2.87508428451934,22.769718096225,10},
      {2.8788793917873,17.3884210780583,10},
      {2.88177728827421,17.508328365434,10},
      {2.88469532674797,12.1289330440315,10},
      {2.88671691932624,13.7988455759111,10},
      {2.88901667529245,7.85629464396239,10},
      {2.89032615939915,10.0970833501745,10},
      {2.89200890766711,3.30894830622941,10},
      {2.89256039016766,0.708229545597586,10},
      {2.89267843750827,0.385113613237404,10},
      {2.89274268789669,28.4933683372936,10},
   }; 
}; 
