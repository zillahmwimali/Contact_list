import com.example.myphonebook.Contacts
import com.example.myphonebook.ContactsAdapter
import com.example.myphonebook.R


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContacts: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContacts()
    }

    fun displayContacts() {
        var contactsList = listOf(
            Contacts("Dad", "0712345678", "dad@gmail.com"),
            Contacts("Mum", "0798765432", "mum@gmail.com"),
            Contacts("Jane Doe", "0700003344", "janedoe@gmail.com"),
            Contacts("Hannah Montana", "+4567890987", "hannahmontanta@gmail.com"),
            Contacts("Victorine Amani", "0798088654", "victorineamani@gmail.com"),
            Contacts("Diana Jarenga", "0732542673", "dianajarenga@gmail.com")
        )
        rvContacts = findViewById(R.id.rvNumbers)
        var contactsAdapter = ContactsAdapter(contactsList)
        rvContacts.layoutManager = LinearLayoutManager(baseContext)
        rvContacts.adapter = contactsAdapter
        rvContacts.apply {
            layoutManager = LinearLayoutManager(baseContext)
            adapter = contactsAdapter

        }
    }
}