package org.usfirst.frc.team3539.robot.profiles;
public class SwitchLeft2 implements IProfile
{
  public static final int kNumPoints = 306;
  public static double PointsR[][] = new double[][] {
      {0,21.2602125868814,10},
      {0.00354336878439914,18.732533467015,10},
      {0.00666545791467614,13.5268388794655,10},
      {0.00891993126044268,9.10880338018905,10},
      {0.0104380647986007,2.67295861791641,10},
      {0.010883557861749,2.81370210547189,10},
      {0.01135250841185,6.5009833740611,10},
      {0.0124360056806979,1.52846260078636,10},
      {0.0126907494275768,5.7612381524507,10},
      {0.013650955706643,5.91350774856146,10},
      {0.0146365406501055,5.57761350629816,10},
      {0.0155661425426151,8.48770290669983,10},
      {0.0169807605701631,9.41030788888642,10},
      {0.0185491445012306,10.6281940794999,10},
      {0.0203205099421205,12.5911792127046,10},
      {0.0224190392531756,14.1150798685949,10},
      {0.0247715524052569,16.2387196560411,10},
      {0.027478006398344,18.0716665924116,10},
      {0.0304899505117103,20.4095221465827,10},
      {0.0338915380938698,22.8277040717676,10},
      {0.0376961546424086,24.8289277471478,10},
      {0.0418343091075821,28.0197932571279,10},
      {0.0465042741723832,30.3308816405549,10},
      {0.0515594228653385,33.0642021598355,10},
      {0.0570701206756925,36.3897219511031,10},
      {0.0631350776805841,39.2699865506692,10},
      {0.0696800720926545,42.0323937562042,10},
      {0.0766854758325567,45.2806715775448,10},
      {0.084232251241791,48.2297911766933,10},
      {0.0922705532769654,51.3258299973461,10},
      {0.100824858276523,54.1762678838627,10},
      {0.109854236894572,57.5225160742492,10},
      {0.11944132067603,60.3952159554653,10},
      {0.129507190958048,63.5058105486359,10},
      {0.140091486342107,66.7136106252763,10},
      {0.151210420808916,69.7164596117352,10},
      {0.162829845404512,73.0054446434487,10},
      {0.174997406126256,75.9226111476455,10},
      {0.187651179112696,79.195625368525,10},
      {0.200850458931115,82.2903906546932,10},
      {0.214565510654733,85.5398158043983,10},
      {0.228822149171751,88.6997340439595,10},
      {0.243605443278315,91.7832478632997,10},
      {0.258902644881485,95.077250544394,10},
      {0.274748874977309,98.2848823462076,10},
      {0.2911296644803,101.419192216673,10},
      {0.308032870831935,104.676771046622,10},
      {0.325478986591612,107.981199118122,10},
      {0.34347585183649,111.0906425585,10},
      {0.361990958929573,114.43058426731,10},
      {0.381062743371073,117.636839275086,10},
      {0.400668864128115,120.999398650388,10},
      {0.420835454791223,124.12651094758,10},
      {0.44152318749368,127.562346361096,10},
      {0.462783596401192,130.718333088794,10},
      {0.484569991623371,134.166299587551,10},
      {0.506931039005011,137.34297647009,10},
      {0.529821514686411,140.7511995143,10},
      {0.553280045389176,144.042073813387,10},
      {0.577287062790644,147.405474562823,10},
      {0.601854677579108,150.705206236884,10},
      {0.626972181356499,154.118875266398,10},
      {0.652658632521761,157.462985601599,10},
      {0.678902494050784,160.830914473647,10},
      {0.705707654111914,164.175269572232,10},
      {0.73307016079634,167.620298910375,10},
      {0.761006905327207,170.999242134723,10},
      {0.789506796863658,174.431574372299,10},
      {0.818578695330285,177.801078908634,10},
      {0.848212211031342,181.22128006097,10},
      {0.878415757708171,184.724746657146,10},
      {0.909203230782073,188.090717422119,10},
      {0.94055168368576,191.574082825349,10},
      {0.972480684741892,194.992417656878,10},
      {1.00497939807147,198.522808225341,10},
      {1.03806656337112,201.951897348074,10},
      {1.07172516193676,205.484506084709,10},
      {1.10597265865572,208.888950594172,10},
      {1.14078744551047,212.492708987118,10},
      {1.17620292250451,215.927947789885,10},
      {1.21219091635244,219.465176435401,10},
      {1.24876838201788,223.029879770819,10},
      {1.2859400362952,226.524412503464,10},
      {1.32369415093891,230.082966158849,10},
      {1.36204130686615,233.663242564601,10},
      {1.40098520102387,237.211041928782,10},
      {1.4405203517321,240.628367111351,10},
      {1.48062508723284,243.867244488958,10},
      {1.52126957698863,246.934481543234,10},
      {1.56242539275221,249.828839159544,10},
      {1.60406346887167,252.620809192605,10},
      {1.64616697786433,255.195001004369,10},
      {1.68869946018439,257.750621394339,10},
      {1.73165785628955,260.015784135548,10},
      {1.77499385090757,262.236399940791,10},
      {1.8186999226636,264.260623725452,10},
      {1.86274343643974,266.161853909437,10},
      {1.90710374032541,267.852679369081,10},
      {1.95174577706503,269.499233251566,10},
      {1.99666240772656,270.895485978048,10},
      {2.0418115636033,272.197688374063,10},
      {2.08717781950279,273.337796218738,10},
      {2.132734149468,274.291822700401,10},
      {2.17844944815216,275.173705174503,10},
      {2.22431173234791,275.826856265855,10},
      {2.27028288525737,276.323817722518,10},
      {2.31633690077092,276.811784124802,10},
      {2.36247224911742,277.184130423367,10},
      {2.40866955319561,277.673901955612,10},
      {2.45494844506861,278.125949331231,10},
      {2.50130280565181,278.476603474851,10},
      {2.54771555250067,277.522179252688,10},
      {2.59396920314965,275.815719531864,10},
      {2.63993857132609,273.99024361536,10},
      {2.68560351504314,272.226264499195,10},
      {2.73097474269888,270.491106271546,10},
      {2.7760565886449,268.804686552822,10},
      {2.82085721166069,267.050895712533,10},
      {2.86536590334817,265.387177797715,10},
      {2.90959694157143,263.70525560618,10},
      {2.9535477767119,262.043067462515,10},
      {2.99722172327373,260.392750342994,10},
      {3.04062056598993,258.772722692296,10},
      {3.08374940409769,257.184116541075,10},
      {3.12661333683417,255.540239758107,10},
      {3.16920344053432,254.01378820882,10},
      {3.2115390922994,252.396927184409,10},
      {3.25360524937976,250.874254169868,10},
      {3.29541746444876,249.342203658162,10},
      {3.33697446269713,247.800882733271,10},
      {3.3782747143537,246.312920226185,10},
      {3.41932688812168,244.826900528463,10},
      {3.46013123896293,243.330218325807,10},
      {3.50068649206814,241.92460339987,10},
      {3.54100718026328,240.434147365806,10},
      {3.58107953560796,239.089952751649,10},
      {3.62092777947877,237.611841970787,10},
      {3.660529730194,236.285759847079,10},
      {3.69991062897767,234.928026758221,10},
      {3.7390653765926,233.575632570687,10},
      {3.77799473792436,232.289814023717,10},
      {3.81670967633289,231.013893096106,10},
      {3.8552119765512,229.754218338136,10},
      {3.89350444315973,228.551236899084,10},
      {3.9315962547854,227.341524466961,10},
      {3.96948639158077,226.20927964601,10},
      {4.0071881115625,225.098574002889,10},
      {4.0447044742729,224.019121584417,10},
      {4.08204108887286,222.991222453791,10},
      {4.11920611414185,222.023504520311,10},
      {4.1562100035161,221.071604420551,10},
      {4.19305530661419,220.197523779328,10},
      {4.22975502649091,219.386898045518,10},
      {4.26631936162062,218.626112255863,10},
      {4.30275723566837,217.897237492453,10},
      {4.33907349290948,217.31350741601,10},
      {4.37529235472054,216.718671200998,10},
      {4.41141178140668,216.252855885004,10},
      {4.44745420961146,215.848828025868,10},
      {4.4834288179618,215.539875443871,10},
      {4.5193524339404,215.302363174704,10},
      {4.5552357659453,215.1758816958,10},
      {4.5910987010015,215.146403005688,10},
      {4.62695653682052,215.197191407957,10},
      {4.66282253141903,215.403863490685,10},
      {4.69872320083033,215.66019194503,10},
      {4.7346667038339,216.085284752939,10},
      {4.7706805763105,216.613055800616,10},
      {4.80678317551396,217.241699958102,10},
      {4.8429897991558,218.034855705348,10},
      {4.8793290029642,218.951188625809,10},
      {4.91582118388787,219.998424063805,10},
      {4.95248724879924,221.181518477872,10},
      {4.98935116411301,222.517498220938,10},
      {5.02643740616765,224.124400435145,10},
      {5.063791358174,226.379237221074,10},
      {5.1015211239602,228.575147222201,10},
      {5.13961701497561,230.516335028694,10},
      {5.17803619762795,232.080816688837,10},
      {5.21671646122369,233.405889163584,10},
      {5.25561752178913,234.382112624673,10},
      {5.29468124802047,235.088759813234,10},
      {5.33386276663057,235.516835674891,10},
      {5.37311567456113,235.60889730286,10},
      {5.4123833702795,235.440959025718,10},
      {5.45162353011712,234.989217604329,10},
      {5.49078873116825,234.204842743499,10},
      {5.52982288182398,233.177188376257,10},
      {5.5686856981106,231.835058953158,10},
      {5.60732465788521,230.213470935884,10},
      {5.64569386801324,228.274746060947,10},
      {5.6837392765806,226.083899602336,10},
      {5.72142008968992,223.551424649905,10},
      {5.75867868596109,220.788015444265,10},
      {5.7954768211153,217.647563542622,10},
      {5.83175126461157,214.256382149053,10},
      {5.86746071262879,210.560149089927,10},
      {5.90255417279518,206.525989583171,10},
      {5.93697504357812,202.237612706262,10},
      {5.97068151123274,197.579643118863,10},
      {6.00361136506552,192.665880497023,10},
      {6.03572228140789,187.384559760326,10},
      {6.06695306941375,181.795173708901,10},
      {6.09725222678762,175.930398254569,10},
      {6.12657386039493,169.67862129403,10},
      {6.15485371984725,163.187664613767,10},
      {6.1820515211709,156.305254793244,10},
      {6.20810250405376,149.124172452869,10},
      {6.23295669597149,141.687113505515,10},
      {6.25657126333183,133.87984993921,10},
      {6.27888450536495,125.849851693074,10},
      {6.29985919763947,117.540509585601,10},
      {6.3194494470208,108.933925294305,10},
      {6.33760528098463,100.211246670231,10},
      {6.35430681250596,91.2404544629026,10},
      {6.36951375761113,82.2017021721161,10},
      {6.38321387813089,73.010997712733,10},
      {6.39538269772681,63.8248672690964,10},
      {6.40602021639889,54.7242357351837,10},
      {6.41514071201122,45.956608610216,10},
      {6.42280027617273,37.404698339917,10},
      {6.42903409361994,29.6281927348509,10},
      {6.43397219490082,22.2663832304976,10},
      {6.43768341971724,16.0154906689059,10},
      {6.44035236045497,10.8937862542809,10},
      {6.44216819881321,7.27449590359968,10},
      {6.44338079741357,9.20290629653973,10},
      {6.444914647956,15.7620659114306,10},
      {6.44754126502517,23.288098261239,10},
      {6.45142280436326,32.1219587404762,10},
      {6.45677649347395,40.7959179777647,10},
      {6.46357581632394,49.6745185265763,10},
      {6.47185493780229,58.7921572912791,10},
      {6.48165363195898,67.4041110793212,10},
      {6.4928877613806,75.6635749983608,10},
      {6.50549817491594,83.6327648411776,10},
      {6.51943693973552,90.7753275439276,10},
      {6.53456637643561,97.9454108297144,10},
      {6.55089056440595,104.194403606756,10},
      {6.56825601660756,110.178378829305,10},
      {6.58661938952443,115.2282451906,10},
      {6.60582413657529,120.376514081292,10},
      {6.62588657531908,124.468590723888,10},
      {6.64663129199698,128.277453184131,10},
      {6.66801086370324,131.826973540859,10},
      {6.68998194692187,134.453560014603,10},
      {6.71239105461389,137.220870136682,10},
      {6.73526113334659,139.261309495562,10},
      {6.7584713311989,140.917164386655,10},
      {6.78195790770613,142.220315240785,10},
      {6.80566120179333,143.281318619155,10},
      {6.82954143941052,144.016083001503,10},
      {6.85354405871992,144.400132049385,10},
      {6.87761041849402,144.436907747896,10},
      {6.90168340727645,144.429381273825,10},
      {6.92575486628772,143.937575145947,10},
      {6.94974473750419,143.288432055015,10},
      {6.97362599496881,142.392047350385,10},
      {6.99735784478419,141.451849999943,10},
      {7.02093314801828,140.12211172318,10},
      {7.04428714435894,138.710576582882,10},
      {7.06740555594209,137.117625881587,10},
      {7.09025829726839,135.261875793972,10},
      {7.11280202482185,133.348024997978,10},
      {7.13502654012811,131.355268605928,10},
      {7.15691909509424,129.13139438813,10},
      {7.1784409355177,126.781053989139,10},
      {7.19957115452608,124.477708159958,10},
      {7.22031740097512,121.739333659232,10},
      {7.24060726569695,119.269173934706,10},
      {7.26048562197871,116.46582240427,10},
      {7.27989688813518,113.507222048402,10},
      {7.29881454813304,110.82769784392,10},
      {7.31728602487804,107.618436835829,10},
      {7.3352220817196,104.646091486155,10},
      {7.3526630026314,101.638354880863,10},
      {7.36960317845256,98.1351559946382,10},
      {7.38595898169339,95.1117468838872,10},
      {7.40181098030127,91.6640098508033,10},
      {7.41708829487946,88.2993852844451,10},
      {7.43180469336832,84.8853873541338,10},
      {7.44595201698839,81.4577515139963,10},
      {7.4595287359685,77.7093991516976,10},
      {7.47248028847088,74.3688378855711,10},
      {7.48487500427368,70.5164304894665,10},
      {7.49662772611607,66.8875303076255,10},
      {7.50777567842943,63.4956413948984,10},
      {7.51835812534002,59.1716132012756,10},
      {7.52822005003769,55.8329832712294,10},
      {7.53752564795949,51.8998460269696,10},
      {7.54617548398051,47.7142391760978,10},
      {7.5541277443559,44.0597765182954,10},
      {7.56147115581253,39.9530255459168,10},
      {7.56813024964018,35.6363823225337,10},
      {7.57406933117864,32.7409806374117,10},
      {7.579526534804,28.068323334733,10},
      {7.58420457498892,24.939794087011,10},
      {7.58836096321077,22.2147611029501,10},
      {7.592063519324,18.5052630157158,10},
      {7.59514753796782,15.0739519003839,10},
      {7.59765993212425,13.9013134721461,10},
      {7.59997702549686,9.84449518629831,10},
      {7.60161745009626,7.66420128031926,10},
      {7.60289480900875,7.46972195173142,10},
      {7.60414004272704,3.20780605230894,10},
      {7.60467444278305,1.59834075434062,10},
  }; 
  public static double PointsL[][] = new double[][] {
      {0,21.8706715897898,10},
      {0.00364511176232102,17.7823715697266,10},
      {0.00660884044691049,15.0598627080677,10},
      {0.00911881744540839,6.87958548053307,10},
      {0.0102654147864705,0.540100764141555,10},
      {0.0103554322577365,7.15275336889431,10},
      {0.0115475572216521,0.823119601889194,10},
      {0.0116847436327374,5.72679678910837,10},
      {0.0126392102821467,3.28875700020112,10},
      {0.0131873364488469,5.16991180612765,10},
      {0.014048988018157,7.77929934963362,10},
      {0.0153455377902492,7.38763108530375,10},
      {0.0165768103548801,9.23435743533204,10},
      {0.0181158686924639,11.0382301148387,10},
      {0.0199555738709548,12.3555629036605,10},
      {0.0220148350719785,14.3690496070434,10},
      {0.0244096758763966,16.0490031743265,10},
      {0.0270845106152157,18.2812662746833,10},
      {0.0301313884870141,20.2764110219455,10},
      {0.0335107884117911,22.4620371364986,10},
      {0.0372544650923021,25.3322932082982,10},
      {0.0414765139603518,27.2884612988038,10},
      {0.0460245873377602,30.3951358533957,10},
      {0.0510904444287843,33.3625572521723,10},
      {0.0566508717529378,35.904711831571,10},
      {0.0626349899134794,38.9287940416293,10},
      {0.0691231238472626,42.0997228090619,10},
      {0.0761397459089512,44.8186042008751,10},
      {0.0836095069017173,47.8610666113329,10},
      {0.0915863551613673,50.7780954361259,10},
      {0.100049367880365,53.9620655026353,10},
      {0.109043043870626,56.668769916073,10},
      {0.118487842999768,59.8658080526543,10},
      {0.128465480543532,62.838719417655,10},
      {0.138938596622046,65.7267705523883,10},
      {0.149893064754824,68.8351508018154,10},
      {0.161365583514414,71.6636135257235,10},
      {0.17330952675089,74.8760717555239,10},
      {0.185788858020575,77.7420827123747,10},
      {0.198745876267803,80.790962512818,10},
      {0.212211033499583,83.6945599468905,10},
      {0.226160124274446,86.6938598642751,10},
      {0.240609115578799,89.7727384770227,10},
      {0.255571233559066,92.6459699537142,10},
      {0.271012217715472,95.6103222491157,10},
      {0.286947270148849,98.6512472395651,10},
      {0.303389154887251,101.569140385059,10},
      {0.320317347501046,104.44511780097,10},
      {0.33772486840935,107.5147489471,10},
      {0.355644002157532,110.354294863009,10},
      {0.374036376985844,113.32790992274,10},
      {0.392924365797395,116.145694844002,10},
      {0.41228196248259,119.193159606129,10},
      {0.432147506930941,121.93418061095,10},
      {0.452469879289765,124.949306010909,10},
      {0.473294749602014,127.668795486755,10},
      {0.494572878358712,130.658610822993,10},
      {0.516349330068398,133.408649828759,10},
      {0.538584107589477,136.273926495457,10},
      {0.561296428672053,139.052465137797,10},
      {0.584471824230641,141.898925619316,10},
      {0.608121640067956,144.614437690166,10},
      {0.632224076945074,147.394903844158,10},
      {0.656789843260062,150.141026635773,10},
      {0.681813393592492,152.903242619914,10},
      {0.707297213820487,155.551735416564,10},
      {0.733222500506962,158.253341867635,10},
      {0.75959811357651,160.894981289521,10},
      {0.786413918295245,163.580800502297,10},
      {0.813677372297535,166.203761418409,10},
      {0.84137802214717,168.732090691015,10},
      {0.869500060208906,171.377003823168,10},
      {0.898062863584011,173.8907696744,10},
      {0.927044633033559,176.455721668402,10},
      {0.956453973520283,178.890107694522,10},
      {0.986268958324328,181.400615133199,10},
      {1.0165023992791,183.796405033137,10},
      {1.04713511050472,186.299447188589,10},
      {1.07818500307177,188.578209595346,10},
      {1.10961478880841,191.009459590603,10},
      {1.14144970893865,193.315008290243,10},
      {1.17366885659008,195.567229167501,10},
      {1.20626330809763,197.873833409236,10},
      {1.23924236956915,200.086693274735,10},
      {1.27259010588847,202.258463487073,10},
      {1.30629988804727,204.438953394981,10},
      {1.34037299085482,206.431923954992,10},
      {1.37477830896437,208.149015585328,10},
      {1.4094698217604,209.725857796385,10},
      {1.44442420023283,211.170221825619,10},
      {1.47961913521902,212.407837283567,10},
      {1.5150204618299,213.556924884909,10},
      {1.55061326479672,214.418721463777,10},
      {1.58634973877096,215.267101949635,10},
      {1.6222275890959,215.859490530802,10},
      {1.65820423714112,216.344106734262,10},
      {1.69426158061464,216.659897393312,10},
      {1.730371573712,216.880750454625,10},
      {1.76651828131703,216.859624315007,10},
      {1.80266154693696,216.789193651137,10},
      {1.83879308431138,216.530983578275,10},
      {1.8748816606126,216.14080014807,10},
      {1.91090509415891,215.65268076867,10},
      {1.94684719487226,214.960199260982,10},
      {1.98267392534451,214.207138815648,10},
      {2.01837508710132,213.332798113329,10},
      {2.05393053815583,212.321053366075,10},
      {2.08931745942168,211.429701608538,10},
      {2.12455573792387,210.442096650074,10},
      {2.15962943854621,209.514902354429,10},
      {2.1945485048012,208.71299631619,10},
      {2.22933397104219,209.269175214173,10},
      {2.26421224339978,210.652486076703,10},
      {2.2993210012777,212.21329628608,10},
      {2.33468982025159,213.77754848055,10},
      {2.370319465207,215.372136036978,10},
      {2.40621478041927,216.964796081754,10},
      {2.44237551092652,218.685681544548,10},
      {2.47882332848677,220.351311673307,10},
      {2.51554854454937,222.086133351303,10},
      {2.55256288735983,223.838455611284,10},
      {2.58986916149859,225.621740439397,10},
      {2.62747272116469,227.406279679854,10},
      {2.66537382131999,229.195974249097,10},
      {2.70357322685006,231.072039697619,10},
      {2.742085215619,232.855936434193,10},
      {2.78089448991528,234.763775229557,10},
      {2.82002170164946,236.605114872914,10},
      {2.85945588746161,238.481822825321,10},
      {2.89920291147449,240.392338720203,10},
      {2.93926838284899,242.275441116028,10},
      {2.97964771227164,244.181077040932,10},
      {3.02034446920848,246.127328389941,10},
      {3.06136553762969,247.996525165988,10},
      {3.10269842440418,249.985487725579,10},
      {3.1443627615951,251.845169325057,10},
      {3.18633687744443,253.881508897247,10},
      {3.2286503475278,255.774860759795,10},
      {3.27127946039235,257.743339683652,10},
      {3.31423670916914,259.735346487837,10},
      {3.35752591828607,261.687701623745,10},
      {3.40114071369666,263.664930838595,10},
      {3.4450849198288,265.673856911729,10},
      {3.48936389088152,267.648118370543,10},
      {3.53397176273206,269.688159988923,10},
      {3.57891975370222,271.682736808645,10},
      {3.62420021493623,273.710479066957,10},
      {3.66981875559499,275.762605877442,10},
      {3.71577920010637,277.806227160319,10},
      {3.76208027366108,279.846421755814,10},
      {3.80872121137355,281.944992418496,10},
      {3.85571195675627,284.031049553148,10},
      {3.90305047011436,286.111048794036,10},
      {3.9507357316004,288.221337503747,10},
      {3.9987725854897,290.383148905881,10},
      {4.04716995544732,292.471714865224,10},
      {4.09591509338031,294.676512836748,10},
      {4.14502788631366,296.826055474237,10},
      {4.19449890065861,299.023479948805,10},
      {4.24433604023276,301.228400302022,10},
      {4.29454083480728,303.456297817952,10},
      {4.34511710881004,305.704633076481,10},
      {4.39606766682149,307.961443267197,10},
      {4.4473945485365,310.267267325645,10},
      {4.49910591273456,312.545769671305,10},
      {4.55119666017848,314.902045582369,10},
      {4.60368055880865,317.235191353604,10},
      {4.65655301931159,319.610589404076,10},
      {4.70982118061937,322.03460358178,10},
      {4.76349371143517,324.449714491376,10},
      {4.81756857206413,326.902427175905,10},
      {4.87205239151458,329.390049238139,10},
      {4.9269507789474,331.91291722773,10},
      {4.98226985344722,334.465156823453,10},
      {5.03801369440376,336.847958966304,10},
      {5.09415527586,338.337894878176,10},
      {5.15054468024298,339.524721933856,10},
      {5.20713244495209,340.597213893583,10},
      {5.26389868296235,341.671572174116,10},
      {5.32084390419747,342.622110777551,10},
      {5.37794771170875,343.553649623269,10},
      {5.43520653603018,344.387252519792,10},
      {5.49260405960278,345.13313833842,10},
      {5.55012651448618,345.857852124295,10},
      {5.60776931136693,346.474074540021,10},
      {5.66551511283862,347.020753559146,10},
      {5.72335168073205,347.538581094331,10},
      {5.78127493565745,347.959298756743,10},
      {5.83926805013217,348.333358398999,10},
      {5.89732388522414,348.65568118087,10},
      {5.95543326230646,348.950682249955,10},
      {6.01359159206566,349.163779371524,10},
      {6.0717856164851,349.393153258159,10},
      {6.13001788518335,349.544508816006,10},
      {6.18827514014376,349.750477204004,10},
      {6.24656706991696,349.908624945769,10},
      {6.30488500579977,350.084487437482,10},
      {6.36323251725819,350.301867918279,10},
      {6.42161623330055,350.513863604618,10},
      {6.48003513407943,350.829394202572,10},
      {6.53850655700122,351.158876313438,10},
      {6.5970330516845,351.6263743777,10},
      {6.65563756469658,352.180335107511,10},
      {6.71433437390153,352.82403221314,10},
      {6.77313826708716,353.666140637272,10},
      {6.83208238929513,354.602513559833,10},
      {6.89118305808439,355.799406509696,10},
      {6.9504825971235,357.175649829501,10},
      {7.01001211175923,358.747061352966,10},
      {7.06980321726207,360.631922985617,10},
      {7.12990843577493,362.732390564528,10},
      {7.19036397188176,365.133825320019,10},
      {7.25121979810687,367.890656509702,10},
      {7.31253455567779,370.886193190051,10},
      {7.37434903849192,374.271515560105,10},
      {7.43672749693767,377.851516607051,10},
      {7.4997030760567,381.624880727696,10},
      {7.56330688119575,385.445178227306,10},
      {7.62754809098177,389.306320616692,10},
      {7.69243231457563,393.038686870445,10},
      {7.75793864510491,396.832305161152,10},
      {7.82407728104398,400.206031865869,10},
      {7.89077836284351,403.601787275184,10},
      {7.95804545996954,406.397597033838,10},
      {8.02577862737343,408.748732913829,10},
      {8.0939034161924,410.461556482648,10},
      {8.16231325236948,405.899014019754,10},
      {8.22996330220741,397.128836001389,10},
      {8.29615140074707,388.227311831855,10},
      {8.36085613119235,378.444547692102,10},
      {8.42393012558886,369.088375535988,10},
      {8.48544477325706,359.627016315416,10},
      {8.54538273679056,349.923739084757,10},
      {8.60370322229195,340.631541958249,10},
      {8.6604750694631,331.388787035396,10},
      {8.71570694700721,322.100353145923,10},
      {8.76938967629737,313.546545959395,10},
      {8.82164767872065,304.880484165682,10},
      {8.8724615771758,296.986589659,10},
      {8.92195885259219,289.198188171008,10},
      {8.97015888207111,282.155488929106,10},
      {9.0171850671522,274.798850051248,10},
      {9.06298437576883,268.28067874218,10},
      {9.10769754686705,261.812102613882,10},
      {9.15133273922635,255.361470701204,10},
      {9.19389301238902,249.594570005221,10},
      {9.2354925892678,243.432927160998,10},
      {9.27606517977942,237.766884277112,10},
      {9.31569237171867,232.242987728734,10},
      {9.35439966127143,226.835736230748,10},
      {9.39220540569155,221.447025559132,10},
      {9.42911368436875,216.164251539841,10},
      {9.46514081486201,211.010498419567,10},
      {9.50030923381489,206.005668521007,10},
      {9.53464341756583,200.840380926242,10},
      {9.56811685008153,195.980359164996,10},
      {9.60078052373374,191.099134775573,10},
      {9.63263035913272,186.292685600094,10},
      {9.6636785944477,181.363870030112,10},
      {9.69390585257739,176.690434456359,10},
      {9.72335496711408,171.937940309436,10},
      {9.75201064034625,167.246254565831,10},
      {9.77988511044311,162.694206333045,10},
      {9.80700081404824,158.078886765383,10},
      {9.83334755268728,153.4403146762,10},
      {9.85892124697049,148.933685348936,10},
      {9.88374331369402,144.463372788838,10},
      {9.90782089178991,139.858241497052,10},
      {9.93113052476714,135.614426853821,10},
      {9.9537323836244,131.027377457061,10},
      {9.97557037675275,126.711847142191,10},
      {9.99668937743934,122.493572028354,10},
      {10.0171046833957,117.941913887211,10},
      {10.0367612228603,113.873556346337,10},
      {10.055740583628,109.523422607993,10},
      {10.0739948328693,105.166993861357,10},
      {10.0915219308894,101.269037529181,10},
      {10.1084004059407,96.8678400297605,10},
      {10.1245456106862,92.8588835027455,10},
      {10.1400217955142,88.7280501079957,10},
      {10.1548095833236,84.6279727622708,10},
      {10.1689140733513,80.5240939352315,10},
      {10.1823352655976,76.7012417177968,10},
      {10.1951180333495,72.4724188318616,10},
      {10.2071971063711,68.7226284846794,10},
      {10.218651012915,64.7173281107193,10},
      {10.2294369193889,60.4633825580291,10},
      {10.2395140318954,57.1049382671277,10},
      {10.2490322680074,52.7325387096569,10},
      {10.2578202933559,48.9183985389368,10},
      {10.2659739735997,45.3190841311888,10},
      {10.2735269637042,41.1499337934921,10},
      {10.2803854377055,37.3562007699488,10},
      {10.2866116062969,33.8324341105764,10},
      {10.2922503427657,29.2027308696512,10},
      {10.2971170547261,26.7462128793799,10},
      {10.3015748078651,23.1092527157782,10},
      {10.3054267716276,19.4578037071465,10},
      {10.3086698864713,17.182171594611,10},
      {10.3115336180691,15.0101049891125,10},
      {10.3140353038274,10.9687574701533,10},
      {10.3158628704312,10.1956971792117,10},
      {10.3175619362581,7.95688092167956,10},
      {10.3188887577712,4.10323871342264,10},
      {10.3195720555527,4.68279920736758,10},
      {10.3203522388406,2.9760777522601,10},
   }; 
}; 