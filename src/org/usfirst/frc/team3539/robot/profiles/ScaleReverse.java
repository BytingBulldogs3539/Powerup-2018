package org.usfirst.frc.team3539.robot.profiles;
public class ScaleReverse implements IProfile
{
  public static final int kNumPoints = 144;
  public static double PointsR[][] = new double[][] {
      {0,-68.1242890937282,10},
      {-0.0113540481424502,-42.6104292595313,10},
      {-0.0184557866312367,-32.4486031258541,10},
      {-0.0238638861961054,-8.70830259966634,10},
      {-0.0253152705204455,-15.3819101311317,10},
      {-0.0278789219699407,-8.38279120104843,10},
      {-0.0292760531993775,-5.03094452629649,10},
      {-0.0301145450692183,-4.55807314086098,10},
      {-0.0308742238463529,-8.72371408792271,10},
      {-0.0323281757162866,-4.47763586143866,10},
      {-0.0330744490769399,-7.5272451715004,10},
      {-0.0343289889030741,-11.021923710458,10},
      {-0.0361659771442574,-10.7411284787401,10},
      {-0.0379561639492381,-13.3250133029703,10},
      {-0.0401770012525959,-14.4267525749228,10},
      {-0.042581458899625,-18.1386954276806,10},
      {-0.0456045735294291,-20.4369050502159,10},
      {-0.0490107245304829,-20.7970036184891,10},
      {-0.0524768911628264,-25.9035059322843,10},
      {-0.0567941443824568,-27.3412938577759,10},
      {-0.0613510258953303,-30.6296038779683,10},
      {-0.0664559598749916,-34.4723565058855,10},
      {-0.072201350076354,-36.9182846553523,10},
      {-0.0783544003872336,-40.1502092230705,10},
      {-0.0850461054301376,-44.0218955601269,10},
      {-0.0923830870673851,-48.1274035934439,10},
      {-0.100404314625579,-51.619817593042,10},
      {-0.109007620107372,-54.8889538440494,10},
      {-0.11815577908138,-58.7798158625047,10},
      {-0.127952417608082,-62.7796970221564,10},
      {-0.138415701719918,-65.759760067296,10},
      {-0.149375651532659,-69.86413606996,10},
      {-0.161019679947628,-73.3817377515871,10},
      {-0.173249977221748,-77.4489020709619,10},
      {-0.186158122467671,-80.6725429278884,10},
      {-0.199603552025628,-85.0445523937153,10},
      {-0.21377763070575,-88.3629319781278,10},
      {-0.228504801333149,-92.0797557569696,10},
      {-0.243851417731574,-96.0653450296272,10},
      {-0.259862305382822,-99.783300839122,10},
      {-0.276492845961606,-103.304650460073,10},
      {-0.293710292804189,-107.240996399326,10},
      {-0.311583788379649,-111.263805004129,10},
      {-0.330127769903239,-114.543833225743,10},
      {-0.349218421522289,-118.753832277644,10},
      {-0.369010728176706,-122.11317148467,10},
      {-0.389362899202774,-126.304002504028,10},
      {-0.410413570111207,-130.10353336024,10},
      {-0.432097502536388,-133.4809009203,10},
      {-0.454344327005294,-137.64654425763,10},
      {-0.477285412615662,-141.306980671783,10},
      {-0.500836558213629,-145.0670357834,10},
      {-0.525014400060481,-149.062400293723,10},
      {-0.549858138542005,-152.547662613183,10},
      {-0.575282743878298,-156.680981886056,10},
      {-0.601396256157019,-160.347430300839,10},
      {-0.628120848270774,-163.998458622404,10},
      {-0.655453906860512,-168.176141258705,10},
      {-0.683483266286581,-171.65314281394,10},
      {-0.712092090277196,-175.522576562974,10},
      {-0.741345904030063,-179.505901774325,10},
      {-0.771263510982268,-183.138909391711,10},
      {-0.801786652349079,-187.064730505433,10},
      {-0.832964153326452,-190.708630093427,10},
      {-0.864748909710979,-194.87200936945,10},
      {-0.897227544794179,-198.284378093483,10},
      {-0.93027499978432,-202.408304571479,10},
      {-0.964009704464807,-206.02703942401,10},
      {-0.998347521422241,-209.97467507437,10},
      {-1.03334333119673,-213.617473227133,10},
      {-1.06894620515697,-217.697051639412,10},
      {-1.10522906239458,-221.331604325662,10},
      {-1.14211770900866,-225.18454714167,10},
      {-1.17964847706408,-228.957039292758,10},
      {-1.21780798106325,-232.926535372889,10},
      {-1.25662898360504,-236.579154656453,10},
      {-1.29605883506559,-240.555779470156,10},
      {-1.33615145987805,-244.211091150948,10},
      {-1.37685331605206,-248.193758560704,10},
      {-1.41821896542541,-248.101054428851,10},
      {-1.45956918960631,-244.702698408576,10},
      {-1.50035288853699,-240.417671730491,10},
      {-1.54042256678215,-236.519065245575,10},
      {-1.57984234724929,-232.503905496536,10},
      {-1.61859298031804,-228.643635076707,10},
      {-1.6567003446171,-224.472499860939,10},
      {-1.69411242792725,-220.606248035903,10},
      {-1.73088009513934,-216.585106881657,10},
      {-1.76697759510562,-212.55194172615,10},
      {-1.80240288813122,-208.537944603187,10},
      {-1.83715928872031,-204.785568942757,10},
      {-1.87129014038888,-200.485902354741,10},
      {-1.90470454923427,-196.620797858069,10},
      {-1.93747466946252,-192.683457567567,10},
      {-1.96958851786627,-188.570989075505,10},
      {-2.00101702879362,-184.770502112323,10},
      {-2.03181208698282,-180.779007923016,10},
      {-2.06194194968246,-176.88711713346,10},
      {-2.09142318941336,-172.852391611378,10},
      {-2.12023183976079,-168.837904961646,10},
      {-2.14837159767172,-164.952056768144,10},
      {-2.1758636249804,-161.101745158519,10},
      {-2.20271391329054,-156.900106305967,10},
      {-2.2288638213746,-152.879607655605,10},
      {-2.25434368969378,-149.172161373929,10},
      {-2.27920578542914,-144.966667498072,10},
      {-2.30336699101471,-140.94015684708,10},
      {-2.3268568820261,-137.135264142978,10},
      {-2.34971293785657,-133.060580998388,10},
      {-2.37188952033338,-129.005035290918,10},
      {-2.39339045388442,-125.050194418429,10},
      {-2.41423205606865,-120.927331131385,10},
      {-2.43438679100532,-116.971404121378,10},
      {-2.45388193961333,-112.898885602968,10},
      {-2.47269837975326,-108.863586416704,10},
      {-2.49084223050973,-104.789981760776,10},
      {-2.50830737279812,-101.054586560141,10},
      {-2.5251496432655,-96.5393140258648,10},
      {-2.54123952128762,-92.6610687949913,10},
      {-2.55668307099773,-88.3762027428773,10},
      {-2.5714124725414,-84.6577956508925,10},
      {-2.58552206180636,-80.3510003293048,10},
      {-2.59891393343886,-76.2221173927747,10},
      {-2.6116176630145,-72.2683550089487,10},
      {-2.6236623161852,-67.9533754116941,10},
      {-2.63498797691413,-63.8507395237163,10},
      {-2.64562982993781,-59.5428657134659,10},
      {-2.6555534554053,-55.5639309453224,10},
      {-2.66481418003996,-51.1241755639987,10},
      {-2.67333500536044,-47.4210547102571,10},
      {-2.68123831305895,-42.6583799363124,10},
      {-2.68834817945293,-38.0024143491234,10},
      {-2.69468194194878,-34.1652511225553,10},
      {-2.70037600514094,-31.1271122278179,10},
      {-2.70556396904343,-25.6118913940891,10},
      {-2.70983254048315,-24.4751184505261,10},
      {-2.71391167526179,-19.7436395348125,10},
      {-2.71720246797308,-15.1993290757374,10},
      {-2.71973551404008,-15.4910526101272,10},
      {-2.72231751278396,-10.6933183496838,10},
      {-2.72409969617684,-10.5433654007624,10},
      {-2.72585689330756,-5.21531637004642,10},
      {-2.72672605828415,-2.38133834307935,10},
      {-2.72712303389827,-6.147929401946,10},
  }; 
  public static double PointsL[][] = new double[][] {
      {0,-68.8707944696731,10},
      {-0.0114784655457566,-41.4511725044517,10},
      {-0.0183869947347142,-34.3280531930524,10},
      {-0.0241083368538807,-5.9815796965352,10},
      {-0.0251052656081695,-11.4575815003904,10},
      {-0.0270148641980884,-13.6873797569774,10},
      {-0.0292960935998556,-1.91780346172347,10},
      {-0.0296157261357391,-4.30847854790919,10},
      {-0.0303338062921018,-2.3485888110212,10},
      {-0.0307252384776856,-9.07178769882884,10},
      {-0.0322372021380501,-8.81129922305596,10},
      {-0.033705754558178,-8.39368030333466,10},
      {-0.0351046984070796,-12.0612636170923,10},
      {-0.0371149093286306,-13.1761627453858,10},
      {-0.0393109356561058,-16.0709075850191,10},
      {-0.0419894215284182,-16.6937615586921,10},
      {-0.0447717167150452,-19.0543705465455,10},
      {-0.0479474459362253,-23.6605497315702,10},
      {-0.0518908692979753,-23.8488798581777,10},
      {-0.0558656808548089,-28.0517329665821,10},
      {-0.0605409722321911,-30.7160550702346,10},
      {-0.0656603155406527,-33.1642491932213,10},
      {-0.0711876854663036,-37.3430485624636,10},
      {-0.0774115275307855,-41.0959519939416,10},
      {-0.084260854775323,-44.3842601019201,10},
      {-0.0916582305028694,-47.515441590378,10},
      {-0.099577473317551,-51.2717449382428,10},
      {-0.108122767008912,-55.2994258641668,10},
      {-0.117339335436655,-58.7437362098686,10},
      {-0.127129958457002,-62.0933116525123,10},
      {-0.137478844369825,-66.5085448022583,10},
      {-0.148563598012441,-69.8017367046418,10},
      {-0.160197220796547,-73.7177825806983,10},
      {-0.172483514068903,-77.086529880313,10},
      {-0.185331281159643,-81.3326085848505,10},
      {-0.198886710824548,-84.4348621008112,10},
      {-0.212959187203945,-88.6125294394005,10},
      {-0.227727948484558,-92.4037765848206,10},
      {-0.243128568991696,-95.9405462989909,10},
      {-0.259118661316338,-99.75698112644,10},
      {-0.275744819738174,-103.767758081127,10},
      {-0.293039456283503,-107.389850781338,10},
      {-0.310937746899729,-110.927752526162,10},
      {-0.329425732425084,-115.215930532821,10},
      {-0.348628376040604,-118.590689833066,10},
      {-0.368393497386828,-122.81158850443,10},
      {-0.388862090371663,-126.217547487334,10},
      {-0.409898355935074,-130.014806633384,10},
      {-0.431567468702214,-134.241717305379,10},
      {-0.453941104825631,-137.696919621688,10},
      {-0.476890572307106,-141.643040798606,10},
      {-0.50049774577354,-145.513591280581,10},
      {-0.524750036483157,-149.151111722868,10},
      {-0.549608530882258,-153.294190935695,10},
      {-0.575157557605637,-156.80576531898,10},
      {-0.601291849275848,-160.781961796761,10},
      {-0.628088850557497,-164.783323010002,10},
      {-0.655552768321254,-168.250564625283,10},
      {-0.683594493397474,-172.437991903827,10},
      {-0.712334176562109,-176.220978285022,10},
      {-0.741704316663045,-179.892321967494,10},
      {-0.771686365225057,-183.94782178183,10},
      {-0.802344381415163,-187.674420798338,10},
      {-0.833623420952797,-191.716779878471,10},
      {-0.865576260942724,-195.220093497533,10},
      {-0.898112899848797,-199.491749975743,10},
      {-0.931361519745517,-203.056346227181,10},
      {-0.965204264513663,-207.109612575633,10},
      {-0.99972253072665,-210.860274892373,10},
      {-1.0348658996769,-214.899268475971,10},
      {-1.07068249541527,-218.518003328502,10},
      {-1.10710213969012,-222.577296975296,10},
      {-1.14419832525725,-226.430239791304,10},
      {-1.18193675974664,-230.349360507378,10},
      {-1.22032827903731,-234.085780654685,10},
      {-1.25934254266805,-238.134595369084,10},
      {-1.29903169033898,-241.861653316937,10},
      {-1.33934192509791,-245.91762736033,10},
      {-1.38032819122539,-249.648479140642,10},
      {-1.42193630932644,-250.105314699969,10},
      {-1.46362053354234,-246.046893022732,10},
      {-1.5046283439469,-242.371571935263,10},
      {-1.54502360848572,-238.312064120507,10},
      {-1.58474220425135,-234.369109569875,10},
      {-1.62380376330689,-230.249435855684,10},
      {-1.66217871007674,-226.462517962626,10},
      {-1.69992249876517,-222.348871546777,10},
      {-1.73698056753441,-218.390129757849,10},
      {-1.77337892249405,-214.455481864576,10},
      {-1.8091215155529,-210.489626639788,10},
      {-1.84420311999287,-206.254546989838,10},
      {-1.87857886252679,-202.574422420949,10},
      {-1.91234129430942,-198.437860033233,10},
      {-1.94541430922591,-194.399814907749,10},
      {-1.97781422483521,-190.498607811874,10},
      {-2.00956398770462,-186.313903525982,10},
      {-2.04061630240933,-182.296143165983,10},
      {-2.07099895979195,-178.18095168127,10},
      {-2.10069589725538,-174.208610226795,10},
      {-2.12973057129063,-170.203990600997,10},
      {-2.15809788266051,-166.072935389431,10},
      {-2.18577679701168,-161.896445974629,10},
      {-2.21275941052653,-158.069157420851,10},
      {-2.23910436443256,-154.048658770489,10},
      {-2.26477902361185,-149.719467599226,10},
      {-2.28973239569265,-145.886151747107,10},
      {-2.31404683335534,-141.86179807344,10},
      {-2.33769046636758,-137.593920129977,10},
      {-2.36062275579382,-133.607887223685,10},
      {-2.38289061461608,-129.60268628485,10},
      {-2.4044912382539,-125.46067791183,10},
      {-2.42540117021629,-121.510770551309,10},
      {-2.44565304562116,-117.357793719124,10},
      {-2.46521269957944,-113.321408395341,10},
      {-2.48409950919239,-109.235764440442,10},
      {-2.5023055706424,-105.18841830635,10},
      {-2.51983700301407,-100.780933447492,10},
      {-2.53663363530874,-97.1249180719698,10},
      {-2.55282116372277,-92.8460793181975,10},
      {-2.56829556381779,-88.9476028638296,10},
      {-2.58312006613478,-84.4607381798589,10},
      {-2.59719702028183,-80.5360108525109,10},
      {-2.61061974229923,-76.433378788961,10},
      {-2.62335865661139,-72.119477680369,10},
      {-2.63537857848178,-68.1285036132539,10},
      {-2.64673330486262,-63.9131312401787,10},
      {-2.65738535636065,-59.8526596695969,10},
      {-2.66736073908547,-55.427104388998,10},
      {-2.6765987721147,-51.4240795496276,10},
      {-2.68516931499764,-46.6121423201384,10},
      {-2.69293800283471,-42.7831595448093,10},
      {-2.70006852113925,-38.8836046017788,10},
      {-2.70654914166576,-34.4772020560116,10},
      {-2.71229547203898,-29.6844118247122,10},
      {-2.71724275194677,-27.7869104579123,10},
      {-2.72187387914968,-21.9016666655572,10},
      {-2.72552416808185,-20.0555904682688,10},
      {-2.72886671805048,-18.4306637254549,10},
      {-2.73193849852508,-12.3845013933345,10},
      {-2.73400266973377,-11.8602086628153,10},
      {-2.7359793890249,-7.11281917100685,10},
      {-2.73716496166824,-7.96389157604024,10},
      {-2.73849203814319,-6.73137694877922,10},
      {-2.73961412528369,-0.677037392280891,10},
   }; 
}; 