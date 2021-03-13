package uz.android.sheriyatolami.fragments

import android.app.AlertDialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.android.sheriyatolami.R
import uz.android.sheriyatolami.adapter.RecyclerAdapter
import uz.android.sheriyatolami.databinding.FragmentFifthBinding
import uz.android.sheriyatolami.model.Sher
import java.util.*
import kotlin.collections.ArrayList


class FifthFragment : Fragment() {


    private lateinit var binding: FragmentFifthBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFifthBinding.inflate(inflater, container, false)

        binding.back5.setOnClickListener {
            findNavController().navigate(R.id.firstFragment)
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
                    "Sog'indim Ona", "Sog'indim Ona\n\nQalbimda kechayotgan hislar begona \n" +
                            "Bugun uzoqlarda angladim buni\n" +
                            "Sizni kulgingizni sog'indim ona\n" +
                            "Dardlarim uxlatmas meni har tuni \n" +
                            "\n" +
                            "Bilmasdim bunchalar qiyin bulishin\n" +
                            "Yurardim o'zgalar mehriga qona\n" +
                            "Istayman siz bilan bag'rim to'lishim\n" +
                            "Jannatim men sizni sog'indim ona \n" +
                            "\n" +
                            "Qattiq gapirganim jaxlimdan emas\n" +
                            "Noshukir emasman qilganim tana\n" +
                            "Shu kunlar tushlarim o'ngidan kelmas\n" +
                            "Sizni tushlarimda ko'ryapman ona \n" +
                            "\n" +
                            "Tengi yo'q mehringiz uf urib turgan \n" +
                            "Chiroyli yuzingiz mudom yagona\n" +
                            "Siz menga uzoqdan qayg'urib yurgan \n" +
                            "Ma'noli ko'zingiz sog'indim ona\n" +
                            "\n" +
                            "Vaqtincha mehrni alishmam sizga \n" +
                            "Hattoki dunyoni berganida ham\n" +
                            "O'ylamang alishmam behisob qizga \n" +
                            "So'zim yolg'on bo'lsa joyim jaxannam.\n" +
                            "\n"
                )
            )
            list.add(Sher("Baxt", "Baxt\n\nQo‘limda telefon, yonda kompyuter \n" +
                    "Go‘yoki bor baxtni olyapman shundan\n" +
                    "Hayotni unutdim haqiqat shudir\n" +
                    "Bildimki hech foyda chiqmaskan bundan.\n" +
                    "\n" +
                    "Qalbimni har zamon o‘rtagan tuyg‘u\n" +
                    "Neligim bilmasdan yurdim uzoq vaqt\n" +
                    "Yomon o‘g‘lingizda sog‘inch-u qayg‘u\n" +
                    "Qumsadim onajon bag‘ringizda baxt...\n" +
                    "\n"))
        }
        return list
    }
}


