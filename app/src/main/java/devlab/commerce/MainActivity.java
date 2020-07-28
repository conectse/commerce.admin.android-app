package devlab.commerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.microsoft.officeuifabric.appbarlayout.AppBarLayout;
import com.microsoft.officeuifabric.listitem.ListItemDivider;
import com.microsoft.officeuifabric.listitem.ListItemView;
import com.microsoft.officeuifabric.listitem.ListSubHeaderView;
import com.microsoft.officeuifabric.persona.AvatarSize;
import com.microsoft.officeuifabric.persona.AvatarView;
import com.microsoft.officeuifabric.search.Searchbar;
import com.microsoft.officeuifabric.snackbar.Snackbar;
import com.microsoft.officeuifabric.view.BaseDividerItemDecoration;

import java.util.ArrayList;

import devlab.commerce.list.ListAdapter;
import devlab.commerce.list.ListItem;
import devlab.commerce.list.ListSubHeader;

public class MainActivity extends AppCompatActivity {

    Searchbar searchbar;
    Button b;
    LinearLayout linLayout;
    AppBarLayout appBarLayout;
    CoordinatorLayout coordinatorLayout;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTheme(R.style.AppTheme);

        //
        this.linLayout = new LinearLayout(this);
        this.linLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        //this.linLayout.setDividerDrawable(
/*                <shape xmlns:android="http://schemas.android.com/apk/res/android">
    <size android:height="@dimen/default_view_margin" />
    <solid android:color="@android:color/transparent" />
</shape>*/
        this.linLayout.setOrientation(LinearLayout.VERTICAL);
        //this.linLayout.setPadding();
        this.linLayout.setShowDividers(LinearLayout.SHOW_DIVIDER_MIDDLE);

//        this.searchbar = new Searchbar(this);
        //searchbar.setOnQueryTextListener(this);

//        this.appBarLayout.getToolbar().setSubtitle(BuildConfig.VERSION_NAME);
//        this.appBarLayout.setAccessoryView(searchbar);

        this.coordinatorLayout = new CoordinatorLayout(this);
        this.coordinatorLayout.setLayoutParams(
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        this.coordinatorLayout.setFitsSystemWindows(true);

        // appbar
        this.appBarLayout = new AppBarLayout(this, null);
        this.appBarLayout.setLayoutParams(
                new com.google.android.material.appbar.AppBarLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        this.appBarLayout.getToolbar().setSubtitle(BuildConfig.VERSION_NAME);
//                this.appBarLayout.setAccessoryView(searchbar);
        this.coordinatorLayout.addView(this.appBarLayout);

        // searchbar
        this.searchbar = new Searchbar(this);
        this.appBarLayout.setAccessoryView(searchbar);
        //searchbar.setOnQueryTextListener(this);

        // recycler view
        this.recyclerView = new RecyclerView(this, null);
        this.recyclerView.setLayoutParams(
                new com.google.android.material.appbar.AppBarLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.coordinatorLayout.addView(this.recyclerView);


        this.setContentView(coordinatorLayout);


/*
        //((AppBarLayout) findViewById(R.id.app_bar)).setScrollTargetViewId(R.id.list_example);
        this.appBarLayout.setScrollTargetViewId(this.linLayout.getId());

        ListAdapter listAdapter = new ListAdapter(this);
        listAdapter.setListItems(createList());

        RecyclerView recyclerView = new RecyclerView(this.linLayout);
        //RecyclerView listExample = (RecyclerView) findViewById(R.id.list_example);
        this.linLayout.setAdapter(listAdapter);
        this.linLayout.addItemDecoration(new ListItemDivider(this, BaseDividerItemDecoration.VERTICAL));*/


//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        // init UI
/*

        this.appBarLayout =

*/

        //recyclerView.setScroll


//        setContentView(this.linLayout);
//        setupAppBar();

//        RecyclerView view = findViewById(R.id.demo_list);
//        view.setAdapter(new DemoListAdapter());
//        view.addItemDecoration((RecyclerView.ItemDecoration) new ListItemDivider((Context) this, 1));

    }

    void onButtonClick(View v) {
        // show toast notification
        Toast.show(this.linLayout.getRootView(), "popup text");

    }

    private final ArrayList createList() {

        Drawable smallIcon = ContextCompat.getDrawable(this, R.drawable.ic_folder_24_regular);
        Drawable overflowIcon = ContextCompat.getDrawable(this, R.drawable.ic_more_vertical_24_filled);

        /*
        // Single-line list example

        val singleLineSection = createSection(
                createListSubHeader(getString(R.string.list_item_sub_header_single_line), ListSubHeaderView.TitleColor.TERTIARY, true),
                arrayListOf(
                        createListItem(
                                getString(R.string.list_item_title),
                                customView = createExampleCustomView(smallIcon),
                                customViewSize = ListItemView.CustomViewSize.SMALL
                        ),
                        createListItem(
                                getString(R.string.list_item_title),
                                customView = createExampleCustomView(smallIcon),
                                customViewSize = ListItemView.CustomViewSize.SMALL,
                                customAccessoryView = createExampleCustomView(overflowIcon),
                                addCustomAccessoryViewClick = true
                        ),
                        createListItem(
                                getString(R.string.list_item_title),
                                customView = createExampleAvatarView(R.drawable.avatar_charlotte_waltson),
                                customViewSize = ListItemView.CustomViewSize.MEDIUM,
                                customAccessoryView = createExampleTextView()
                        )
                )
        )

        // Two-line list examples

        val twoLineSection = createSection(
                createListSubHeader(getString(R.string.list_item_sub_header_two_line)),
                arrayListOf(
                        createListItem(
                                getString(R.string.list_item_title),
                                getString(R.string.list_item_subtitle),
                                customView = createExampleCustomView(smallIcon),
                                customViewSize = ListItemView.CustomViewSize.SMALL
                        ),
                        createListItem(
                                getString(R.string.list_item_title),
                                getString(R.string.list_item_subtitle),
                                customView = createExampleCustomView(smallIcon),
                                customViewSize = ListItemView.CustomViewSize.SMALL,
                                customAccessoryView = createExampleCustomView(overflowIcon),
                                addCustomAccessoryViewClick = true
                        ),
                        createListItem(
                                getString(R.string.list_item_title),
                                getString(R.string.list_item_subtitle),
                                customView = createExampleAvatarView(R.drawable.avatar_erik_nason),
                                customViewSize = ListItemView.CustomViewSize.MEDIUM,
                                customAccessoryView = createExampleTextView()
                        )
                )
        )

        val twoLineDenseSection = createSection(
                createListSubHeader(getString(R.string.list_item_sub_header_two_line_dense)),
                arrayListOf(
                        createListItem(
                                getString(R.string.list_item_title),
                                getString(R.string.list_item_subtitle),
                                customView = createExampleCustomView(smallIcon),
                                customViewSize = ListItemView.CustomViewSize.SMALL,
                                layoutDensity = ListItemView.LayoutDensity.COMPACT
                        ),
                        createListItem(
                                getString(R.string.list_item_title),
                                getString(R.string.list_item_subtitle),
                                customView = createExampleCustomView(smallIcon),
                                customViewSize = ListItemView.CustomViewSize.SMALL,
                                customAccessoryView = createExampleCustomView(overflowIcon),
                                addCustomAccessoryViewClick = true,
                                layoutDensity = ListItemView.LayoutDensity.COMPACT
                        ),
                        createListItem(
                                getString(R.string.list_item_title),
                                getString(R.string.list_item_subtitle),
                                customView = createExampleAvatarView(R.drawable.avatar_wanda_howard),
                                customViewSize = ListItemView.CustomViewSize.MEDIUM,
                                customAccessoryView = createExampleTextView(),
                                layoutDensity = ListItemView.LayoutDensity.COMPACT
                        )
                )
        )

        // Three-line list example

        val threeLineSection = createSection(
                createListSubHeader(getString(R.string.list_item_sub_header_three_line), ListSubHeaderView.TitleColor.SECONDARY, true),
                arrayListOf(
                        createListItem(
                                getString(R.string.list_item_title),
                                getString(R.string.list_item_subtitle),
                                getString(R.string.list_item_footer),
                                customView = createExampleCustomView(smallIcon),
                                customViewSize = ListItemView.CustomViewSize.SMALL
                        ),
                        createListItem(
                                getString(R.string.list_item_title),
                                getString(R.string.list_item_subtitle),
                                getString(R.string.list_item_footer),
                                customView = createExampleCustomView(smallIcon),
                                customViewSize = ListItemView.CustomViewSize.SMALL,
                                customAccessoryView = createExampleCustomView(overflowIcon),
                                addCustomAccessoryViewClick = true
                        ),
                        createListItem(
                                getString(R.string.list_item_title),
                                getString(R.string.list_item_subtitle),
                                getString(R.string.list_item_footer),
                                customView = createExampleAvatarView(R.drawable.avatar_carole_poland),
                                customViewSize = ListItemView.CustomViewSize.MEDIUM,
                                customAccessoryView = createExampleTextView()
                        )
                )
        )


        // Layout variant examples

        val noCustomViewSection = createSection(
                createListSubHeader(getString(R.string.list_item_sub_header_no_custom_views)),
                arrayListOf(
                        createListItem(getString(R.string.list_item_title)),
                        createListItem(
                                getString(R.string.list_item_title),
                                getString(R.string.list_item_subtitle)
                        ),
                        createListItem(
                                getString(R.string.list_item_title),
                                getString(R.string.list_item_subtitle),
                                getString(R.string.list_item_footer)
                        )
                )
        )

        val largeHeaderSection = createSection(
                createListSubHeader(getString(R.string.list_item_sub_header_large_header)),
                arrayListOf(
                        createListItem(
                                getString(R.string.list_item_title),
                                getString(R.string.list_item_subtitle),
                                getString(R.string.list_item_footer),
                                customView = createExampleAvatarView(R.drawable.avatar_johnie_mcconnell, avatarSize = AvatarSize.XXLARGE),
                                customViewSize = ListItemView.CustomViewSize.LARGE
                        ),
                        createListItem(
                                getString(R.string.list_item_title),
                                footer = getString(R.string.list_item_footer),
                                customView = createExampleAvatarView(avatarNameStringId = R.string.persona_name_elliot_woodward, avatarSize = AvatarSize.XXLARGE),
                                customViewSize = ListItemView.CustomViewSize.LARGE
                        ),
                        createListItem(
                                getString(R.string.list_item_title),
                                getString(R.string.list_item_subtitle),
                                customView = createExampleAvatarView(R.drawable.avatar_miguel_garcia, avatarSize = AvatarSize.XXLARGE),
                                customViewSize = ListItemView.CustomViewSize.LARGE
                        )
                )
        )

        val truncationSection = createSection(
                createListSubHeader(getString(R.string.list_item_sub_header_truncated_text)),
                arrayListOf(
                        createListItem(
                                "${getString(R.string.list_item_truncation_middle)} ${getString(R.string.long_placeholder)}",
                                "${getString(R.string.long_placeholder)} ${getString(R.string.list_item_truncation_start)}",
                                "${getString(R.string.list_item_truncation_end)} ${getString(R.string.long_placeholder)}",
                                customView = createExampleCustomView(smallIcon),
                                customViewSize = ListItemView.CustomViewSize.SMALL
                        ),
                        createListItem(
                                "${getString(R.string.list_item_truncation_middle)} ${getString(R.string.long_placeholder)}",
                                "${getString(R.string.long_placeholder)} ${getString(R.string.list_item_truncation_start)}",
                                "${getString(R.string.list_item_truncation_end)} ${getString(R.string.long_placeholder)}",
                                customView = createExampleCustomView(smallIcon),
                                customViewSize = ListItemView.CustomViewSize.SMALL,
                                customAccessoryView = createExampleCustomView(overflowIcon),
                                addCustomAccessoryViewClick = true
                        ),
                        createListItem(
                                "${getString(R.string.list_item_truncation_middle)} ${getString(R.string.long_placeholder)}",
                                "${getString(R.string.long_placeholder)} ${getString(R.string.list_item_truncation_start)}",
                                "${getString(R.string.list_item_truncation_end)} ${getString(R.string.long_placeholder)}",
                                customView = createExampleAvatarView(R.drawable.avatar_robert_tolbert),
                                customViewSize = ListItemView.CustomViewSize.MEDIUM,
                                customAccessoryView = createExampleTextView()
                        )
                )
        )

        val wrappingSection = createSection(
                createListSubHeader(getString(R.string.list_item_sub_header_wrapped_text)),
                arrayListOf(
                        createListItem(
                                getString(R.string.long_placeholder),
                                wrap = true,
                                customView = createExampleCustomView(smallIcon),
                                customViewSize = ListItemView.CustomViewSize.SMALL
                        ),
                        createListItem(
                                getString(R.string.long_placeholder),
                                getString(R.string.long_placeholder),
                                wrap = true,
                                customView = createExampleCustomView(smallIcon),
                                customViewSize = ListItemView.CustomViewSize.SMALL,
                                customAccessoryView = createExampleCustomView(overflowIcon),
                                addCustomAccessoryViewClick = true
                        ),
                        createListItem(
                                getString(R.string.long_placeholder),
                                getString(R.string.long_placeholder),
                                getString(R.string.long_placeholder),
                                wrap = true,
                                customView = createExampleAvatarView(avatarNameStringId = R.string.persona_name_henry_brill),
                                customViewSize = ListItemView.CustomViewSize.MEDIUM,
                                customAccessoryView = createExampleTextView()
                        )
                )
        )

        val twoLineListSections = twoLineSection + twoLineDenseSection
        val layoutVariantSections = noCustomViewSection + largeHeaderSection + truncationSection + wrappingSection
        return (singleLineSection + twoLineListSections + threeLineSection + layoutVariantSections) as ArrayList<IBaseListItem>

        */
        // Three-line list example
        ArrayList items = new ArrayList<ListItem>();
        items.add(createListItem(
                "title",
                "subtitle",
                "list_item_footer",
                createExampleCustomView(smallIcon),
                ListItemView.CustomViewSize.SMALL,
                createExampleCustomView(overflowIcon),
                true,
                ListItemView.Companion.getDEFAULT_LAYOUT_DENSITY(),
                false
        ));

        return createSection(
                createListSubHeader("list_item_sub_header_single_line", ListSubHeaderView.TitleColor.TERTIARY, true), items);
    }

    private final ArrayList createSection(ListSubHeader subHeader, ArrayList items) {
        ArrayList itemArray = new ArrayList<ListSubHeader>();
        itemArray.addAll(items);
        return itemArray;
    }

    private final ListSubHeader createListSubHeader(String text, ListSubHeaderView.TitleColor titleColor, boolean useCustomAccessoryView) {
        ListSubHeader listSubHeader = new ListSubHeader(text);
        listSubHeader.setTitleColor(titleColor);
        if (useCustomAccessoryView) {
            TextView customTextView = new TextView((Context) this);
            //customTextView.setText(this.getString(R.string.list_item_sub_header_custom_accessory_text));
            customTextView.setText("list_item_sub_header_custom_accessory_text");
            TextViewCompat.setTextAppearance(customTextView, R.style.TextAppearance_UIFabric_ListSubHeaderTitle_Tertiary);
            customTextView.setOnClickListener((view) -> {
                //String str = ListItemViewActivity.this.getResources().getString(R.string.list_item_click_sub_header_custom_accessory_view);
                String str = "list_item_click_sub_header_custom_accessory_view";
                Snackbar.Companion.make(view, str, Snackbar.LENGTH_SHORT, Snackbar.Style.REGULAR).show();
            });
            listSubHeader.setCustomAccessoryView(customTextView);
        }

        return listSubHeader;
    }

    private final ListItem createListItem(String title, String subtitle, String footer, View customView, ListItemView.CustomViewSize customViewSize, final View customAccessoryView, boolean addCustomAccessoryViewClick, ListItemView.LayoutDensity layoutDensity, boolean wrap) {

        ListItem item = new ListItem(title);
        item.setSubtitle(subtitle);
        item.setFooter(footer);
        item.setLayoutDensity(layoutDensity);
        item.setCustomAccessoryView(customAccessoryView);
        item.setCustomView(customView);
        item.setCustomViewSize(customViewSize);
        if (wrap) {
            item.setTitleMaxLines(4);
            item.setSubtitleMaxLines(4);
            item.setFooterMaxLines(4);
        } else {
            item.setTitleTruncateAt(TextUtils.TruncateAt.MIDDLE);
            if (Build.VERSION.SDK_INT > 21) {
                item.setSubtitleTruncateAt(TextUtils.TruncateAt.START);
            }
        }

        if (addCustomAccessoryViewClick && customAccessoryView != null) {
            customAccessoryView.setOnClickListener((view) -> {
                Toast.show(customAccessoryView, "list_item_click_custom_accessory_view");
            });
        }

        return item;
    }

    private final ImageView createExampleCustomView(Drawable drawable) {
        ImageView imageView = new ImageView(this);
        imageView.setImageDrawable(drawable);
        return imageView;
    }

    private final TextView createExampleTextView() {
        TextView textCustomAccessoryView = new TextView(this);
        TextViewCompat.setTextAppearance(textCustomAccessoryView, R.style.TextAppearance_ListItemValue);
        //textCustomAccessoryView.setText(this.getString(R.string.list_item_custom_text_view));
        textCustomAccessoryView.setText("list_item_custom_text_view");
        return textCustomAccessoryView;
    }

    private final AvatarView createExampleAvatarView(int avatarImageResourceId, int avatarNameStringId, AvatarSize avatarSize) {
        AvatarView avatarView = new AvatarView(this);
        avatarView.setAvatarImageResourceId(avatarImageResourceId);
        avatarView.setAvatarSize(avatarSize);
        if (avatarNameStringId != -1)
            avatarView.setName(this.getString(avatarNameStringId));

        return avatarView;
    }


}