package devlab.commerce;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.microsoft.officeuifabric.appbarlayout.AppBarLayout;
import com.microsoft.officeuifabric.listitem.ListItemDivider;
import com.microsoft.officeuifabric.listitem.ListItemView;
import com.microsoft.officeuifabric.listitem.ListSubHeaderView;
import com.microsoft.officeuifabric.listitem.ListItemView.CustomViewSize;
import com.microsoft.officeuifabric.listitem.ListItemView.LayoutDensity;
import com.microsoft.officeuifabric.listitem.ListSubHeaderView.TitleColor;
import com.microsoft.officeuifabric.persona.AvatarSize;
import com.microsoft.officeuifabric.persona.AvatarView;
import com.microsoft.officeuifabric.snackbar.Snackbar;
import com.microsoft.officeuifabric.snackbar.Snackbar.Companion;
import com.microsoft.officeuifabric.snackbar.Snackbar.Style;
import com.microsoft.officeuifabric.view.BaseDividerItemDecoration;

import java.util.ArrayList;

import devlab.commerce.list.ListAdapter;
import devlab.commerce.list.ListItem;
import devlab.commerce.list.ListSubHeader;

public final class ListItemViewActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

/*        ((AppBarLayout) findViewById(R.id.app_bar)).setScrollTargetViewId(R.id.list_example);

        ListAdapter listAdapter = new ListAdapter(this);
        listAdapter.setListItems(createList());

        RecyclerView listExample = (RecyclerView) findViewById(R.id.list_example);
        listExample.setAdapter(listAdapter);
        listExample.addItemDecoration(new ListItemDivider(this, BaseDividerItemDecoration.VERTICAL));*/
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

    private final ListSubHeader createListSubHeader(String text, TitleColor titleColor, boolean useCustomAccessoryView) {
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
                Snackbar.Companion.make(view, str, Snackbar.LENGTH_SHORT, Style.REGULAR).show();
            });
            listSubHeader.setCustomAccessoryView(customTextView);
        }

        return listSubHeader;
    }

    private final ListItem createListItem(String title, String subtitle, String footer, View customView, CustomViewSize customViewSize, final View customAccessoryView, boolean addCustomAccessoryViewClick, LayoutDensity layoutDensity, boolean wrap) {

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
            item.setTitleTruncateAt(TruncateAt.MIDDLE);
            if (VERSION.SDK_INT > 21) {
                item.setSubtitleTruncateAt(TruncateAt.START);
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
