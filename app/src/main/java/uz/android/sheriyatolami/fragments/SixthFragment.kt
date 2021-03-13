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
import uz.android.sheriyatolami.databinding.FragmentSixthBinding
import uz.android.sheriyatolami.databinding.FragmentThirdBinding
import uz.android.sheriyatolami.model.Sher

class SixthFragment : Fragment() {
    private lateinit var binding: FragmentSixthBinding
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSixthBinding.inflate(inflater, container, false)

        binding.back4.setOnClickListener {
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
                            "Hayotda...", "Hayotda...\n" +
                            "\n" +
                            "Ba‘zida ulgurib, ba‘zan ulgurmay\n" +
                            "Hayotda shundayin yashayveramiz\n" +
                            "Uzoqqa intilib, yaqinni ko‘rmay\n" +
                            "Takror xatoliklar qilaveramiz.\n" +
                            "\n" +
                            "Kimdir yurganida nonga ham to‘ymay\n" +
                            "Bazida ustidan kulaveramiz.\n" +
                            "Eng oģir damda ham nafsni tiymay\n" +
                            "Qator gunohlarni qilaveramiz.\n" +
                            "\n" +
                            "Shaytonga aldansak, ollohni bilmay\n" +
                            "Uning nayrangiga òynayveramiz\n" +
                            "Boshdagi har kunni sinov deb bilmay\n" +
                            "Yolģonchi hayotni qòllayveramiz.\n" +
                            "\n" +
                            "Vijdonli bòlaylik xiyonat qilmay\n" +
                            "Bugun bormiz, ertaga ketaveramiz\n" +
                            "Ba‘zida ulgurib, ba‘zan ulgurmay\n" +
                            "Hayotda shundayin yashayveramiz.\n"))
            list.add(
                    Sher(
                            "Nomsiz sahifa", "Nomsiz sahifa\nNomsiz sahifaga yozildi taqdir\n" +
                            "Balki shu sababli nomsizmikan baxt\n" +
                            "Mening hikoyamda ayriliq haqdir\n" +
                            "Bizni ayirishga qilishganda ahd.\n" +
                            "\n" +
                            "Tingladim har so‘zni noaniq bari\n" +
                            "Barchasi xatolar haqida ekan\n" +
                            "Muzlayman soniya o‘tgani sari\n" +
                            "Yo‘llarim to‘ldirgan ko‘p nishli tikan\n" +
                            "\n" +
                            "Eh mayli kutyapman endi shavqatni\n" +
                            "Qiziqmas insonlar gapirgani ham\n" +
                            "Sabrdan so‘rayman kuchli toqatni\n" +
                            "Umrimcha sevaman bo‘lsa hamki kam.\n"))
            list.add(
                    Sher(
                            "Abitueriyent", "Abitueriyent\nTunlari uxlamay kitob varaqlab\n" +
                            "Bir maqsad izidan boryapmiz odim\n" +
                            "Dillarda iymon-u e'tiqod saqlab\n" +
                            "Xudoga iltijo saqlang deb yodim.\n" +
                            "\n" +
                            "Ilm mehnatidan charchamay tolmay\n" +
                            "Mashaqqat ortidan qilsak g‘alaba \n" +
                            "Marramiz yaqindir orqada qolmay\n" +
                            "Do‘stlarim bo‘laylik baxtli talaba."))

        }
        return list
    }
}

