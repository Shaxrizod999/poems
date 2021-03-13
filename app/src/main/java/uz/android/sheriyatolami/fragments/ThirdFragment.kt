package uz.android.sheriyatolami.fragments

import android.app.AlertDialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import uz.android.sheriyatolami.R
import uz.android.sheriyatolami.adapter.RecyclerAdapter
import uz.android.sheriyatolami.databinding.FragmentThirdBinding
import uz.android.sheriyatolami.model.Sher

class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater, container, false)

        binding.back2.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.rv.adapter = RecyclerAdapter(initList()) {
            val dialog = AlertDialog.Builder(requireContext()).create()
            val dialogView = layoutInflater.inflate(R.layout.dialog_view, binding.root, false)
            var ss = dialogView.findViewById<TextView>(R.id.desc)
            ss.text = it.sher
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.setView(dialogView)
            dialog.show()
        }
        return binding.root
    }
    private fun initList(): ArrayList<Sher> {

        var list:ArrayList<Sher> = ArrayList()

        for (i in 1..4) {
            list.add(
                Sher(
                    "Armonim", "Armonim\n\nBalki baxtim uchun harakatim kech\n" +
                            "Ammo qalbim taskin topishi kerak\n" +
                            "Bir zumga qurquvning arqonlarin yech\n" +
                            "Nega vaqtin topib boʻlmading sergak\n" +
                            "\n" +
                            "Oxirgi imkonim qolgunga qadar \n" +
                            "Men jonni garovga qoyaman bugun\n" +
                            "Bu ishda norozi boʻlyapti padar\n" +
                            "Hech kim yecholmaydi qalbdagi tugun\n" +
                            "\n" +
                            "Gar Alloh men uchun ravo koʻrmasa\n" +
                            "Aslo oʻzim uchun yashay olmasman\n" +
                            "Xayol qildirmasdi sinov boʻlmasa\n" +
                            "Men uni hechqachon unotolmasman\n" +
                            "\n" +
                            "Hali koʻzim yoshi uvol ketmagay\n" +
                            "Bardosh u  sabrimni ishlatmay bunga\n" +
                            "Qalbim sevgisiga gunoh yetmagay\n" +
                            "Aytishni boshladim dardimni tunga\n" +
                            "\n" +
                            "Balki unutganda baxtli boʻlarmiz\n" +
                            "Va yoki aksincha boʻlishi mumkin\n" +
                            "Balki sinov soʻngi birga kularmiz\n" +
                            "Doudan tugʻular har yoʻlga imkon.\n" +
                            "\n" +
                            "Men qodir xudoning ojiz bandasi\n" +
                            " Baxtim kurashiga kechroq chogʻlandim\n" +
                            "Baxtli oilaning bir arzandasi\n" +
                            "Sevgiga telbadek boʻlib bogʻlandim\n" +
                            "\n" +
                            "Qiyin boʻlsa nima hammasi boshda\n" +
                            "Umidsiz insonga misoldir toshlar\n" +
                            "Baxtning boʻlishida farqlimi yoshda\n" +
                            "Koʻngil yigʻlasinmi oqib koʻzyoshlar\n" +
                            "\n" +
                            "Dardlar yoʻlin topib sherlar yozdirsa\n" +
                            "Oromni ozgina his qilib koʻrdim\n" +
                            "Daxshatli haqiqat aql ozdirsa\n" +
                            "Tanam yashayapti men oʻzim oʻldim\n" +
                            "\n" +
                            "Allohndan nolimay u ulugʻ zotdir\n" +
                            "Har ishni biz uchun yaxshi qiladi\n" +
                            "Haqiqat sinovga toʻla hayotdir\n" +
                            "Peshona taqdirni Xudo biladi\n" +
                            "\n" +
                            "Qosimov Shaxrizod."
                )
            )
            list.add(Sher("Yo'qotdim","Yo'qotdim\n\nFaqat dardim qoldi hamrohim boʻlib\n" +
                    "Faqat qalbim yondi,  alamga toʻlib\n" +
                    "Men uni atamay vafosiz deya\n" +
                    "Axir u yuribdi majburan kulib\n" +
                    "\n" +
                    "Hayotim, borligʻim, quvonchim eding\n" +
                    "Dunyoyim xalovat topgandim sendan\n" +
                    "Balki umrim yoʻlin notoʻgʻri kelding\n" +
                    "Soʻnggida qolyapti armonlar mendan\n" +
                    "\n" +
                    "Endichi begona boʻlib ketyapmiz\n" +
                    "Armonim, dardlarim, hasratim oʻzing\n" +
                    "Balki orzularga shundan yetyapmiz\n" +
                    "Endichi imkon yoʻq koʻrmoqqa koʻzing\n" +
                    "\n" +
                    "Hatoyim nimada sevgim chin boʻlsa\n" +
                    "Nega armonlarga tashlab qoʻydilar\n" +
                    "Netayin koʻzlarim sen bilan kulsa\n" +
                    "Ba'zilar holimga kulib toʻydilar.\n" +
                    "\n" +
                    "Taqdirmi men undan rozi emasman\n" +
                    "Bor mehrim berganim olib qoʻysa gar\n" +
                    "Tushuning boshqani bunday sevmasman\n" +
                    "Halovat qayerda yurak darbadar.\n" +
                    "\n" +
                    "Charchadim, ojizman, kuchsizman hayot\n" +
                    "Men uning mehriga muhtojman doim\n" +
                    "Kerakmas armonli eslagani yod\n" +
                    "Iltijo qilaman qaytsin xatoyim.\n" +
                    "\n" +
                    "Bedorlik mayliyu, qaynadi alam\n" +
                    "Umrimni berganim olislab ketdi\n" +
                    "Men bilan birgadir qogʻoz va qalam\n" +
                    "Goʻzalim aksincha baxtiga yetdi\n" +
                    "\n" +
                    "Yigʻlaymi, kulaymi, yoki jim boʻlay\n" +
                    "Hammasi bir xilda ogʻriq beryapti\n" +
                    "Yoʻl bor lek men nega u yoʻldan yuray\n" +
                    "Nega armon birga menda ketyapti.\n" +
                    "\n" +
                    "\n" +
                    "Ketsin gʻuborlardan charchadim hayot\n" +
                    "Yashashni istayman taskinli qalbda\n" +
                    "Bir bora kelginda yuragim uygʻot\n" +
                    "Zarracha kuch yoʻqdir uryotgan zarbda"))
            list.add(Sher("O'sha izhorlar","O'sha izhorlar\n\nFaqat dardim qoldi hamrohim boʻlib\n" +
                    "Faqat qalbim yondi,  alamga toʻlib\n" +
                    "Men uni atamay vafosiz deya\n" +
                    "Axir u yuribdi majburan kulib\n" +
                    "\n" +
                    "Hayotim, borligʻim, quvonchim eding\n" +
                    "Dunyoyim xalovat topgandim sendan\n" +
                    "Balki umrim yoʻlin notoʻgʻri kelding\n" +
                    "Soʻnggida qolyapti armonlar mendan\n" +
                    "\n" +
                    "Endichi begona boʻlib ketyapmiz\n" +
                    "Armonim, dardlarim, hasratim oʻzing\n" +
                    "Balki orzularga shundan yetyapmiz\n" +
                    "Endichi imkon yoʻq koʻrmoqqa koʻzing\n" +
                    "\n" +
                    "Hatoyim nimada sevgim chin boʻlsa\n" +
                    "Nega armonlarga tashlab qoʻydilar\n" +
                    "Netayin koʻzlarim sen bilan kulsa\n" +
                    "Ba'zilar holimga kulib toʻydilar.\n" +
                    "\n" +
                    "Taqdirmi men undan rozi emasman\n" +
                    "Bor mehrim berganim olib qoʻysa gar\n" +
                    "Tushuning boshqani bunday sevmasman\n" +
                    "Halovat qayerda yurak darbadar.\n" +
                    "\n" +
                    "Charchadim, ojizman, kuchsizman hayot\n" +
                    "Men uning mehriga muhtojman doim\n" +
                    "Kerakmas armonli eslagani yod\n" +
                    "Iltijo qilaman qaytsin xatoyim.\n" +
                    "\n" +
                    "Bedorlik mayliyu, qaynadi alam\n" +
                    "Umrimni berganim olislab ketdi\n" +
                    "Men bilan birgadir qogʻoz va qalam\n" +
                    "Goʻzalim aksincha baxtiga yetdi\n" +
                    "\n" +
                    "Yigʻlaymi, kulaymi, yoki jim boʻlay\n" +
                    "Hammasi bir xilda ogʻriq beryapti\n" +
                    "Yoʻl bor lek men nega u yoʻldan yuray\n" +
                    "Nega armon birga menda ketyapti.\n" +
                    "\n" +
                    "Ketsin gʻuborlardan charchadim hayot\n" +
                    "Yashashni istayman taskinli qalbda\n" +
                    "Bir bora kelginda yuragim uygʻot\n" +
                    "Zarracha kuch yoʻqdir uryotgan zarbda"))
            list.add(Sher("Mazmunsiz","Mazmunsiz\n\nYurak oʻrtayotgan ushbu azobdan\n" +
                    "Qayerga qochishni bilmayman netay\n" +
                    "Axvolim soʻramang mendek xarobdan\n" +
                    "Qaysi gunox uchun dard bilan ketay\n" +
                    "\n" +
                    "Mazunin yoʻqotgan rangdor hayot ham\n" +
                    "Endi menga uzoq, yaqin ham birdek\n" +
                    "Intilmay yashayman menda yoʻqdir kam\n" +
                    "Chunki jonsiz toshga oqar suv yerdek\n" +
                    "\n" +
                    "Quyosh porlamasa nima boʻlibdi?\n" +
                    "Qalbim quyoshini yoʻqotib boʻldim\n" +
                    "Yuragim oʻrniga qonlar toʻlibdi\n" +
                    "Tirikman yashayman ichimdan oʻldim\n" +
                    "\n" +
                    "Endi qidirmayman hayotdan shavqat\n" +
                    "Chunki adolatni guvohi boʻldim\n" +
                    "Bu hukm aytdilar jazoying toqat\n" +
                    "Qalbim ochganimga axmoq koʻrindim\n" +
                    "\n" +
                    "Hayot haqiqati boʻlsa ayriliq \n" +
                    "Netayin koʻnmoqadan boshqa yoʻq chora\n" +
                    "Qarshimga chiqsayu betakror borliq\n" +
                    "Men uchun koʻrinar endi u qora."))

        }
        return list
    }
}

