package fi.dy.masa.litematica.config;

import java.util.List;
import com.google.common.collect.ImmutableList;
import fi.dy.masa.malilib.config.options.ConfigHotkey;
import fi.dy.masa.malilib.hotkeys.KeybindSettings;

public class Hotkeys
{
    public static final ConfigHotkey ADD_SELECTION_BOX                  = new ConfigHotkey("添加选择框",                   "M,A",  "在这里添加一个新的选择框(位置1)");
    public static final ConfigHotkey CLONE_SELECTION                    = new ConfigHotkey("克隆选择",                    "",     "快速克隆当前区域选择。\n这基本上只是创建一个仅在内存中的原理图，\n然后创建该原理图的位置并选择它，\n还将工具模式切换到粘贴模式。");
    public static final ConfigHotkey DELETE_SELECTION_BOX               = new ConfigHotkey("删除选择框",                "",     "删除当前选中的框");
    public static final ConfigHotkey EASY_PLACE_ACTIVATION              = new ConfigHotkey("轻松放置使用按键",                   "BUTTON_2", KeybindSettings.PRESS_ALLOWEXTRA, "当启用轻松放置模式时，使用此按键来放置方块。");
    public static final ConfigHotkey EASY_PLACE_TOGGLE                  = new ConfigHotkey("轻松放置切换",                   "",     "允许快速打开/关闭轻松放置模式");
    public static final ConfigHotkey EXECUTE_OPERATION                  = new ConfigHotkey("执行操作",                  "",     "在填充、替换、粘贴原理图等模式下使用\n当前选择或放置执行当前选定的工具操作");
    public static final ConfigHotkey INVERT_GHOST_BLOCK_RENDER_STATE    = new ConfigHotkey("反转投影渲染状态",       "",     "在按住此键绑定时反转原理图/重影块渲染状态");
    public static final ConfigHotkey INVERT_OVERLAY_RENDER_STATE        = new ConfigHotkey("反转叠加渲染状态",          "",     "按住此键绑定时反转叠加渲染状态");
    public static final ConfigHotkey LAYER_MODE_NEXT                    = new ConfigHotkey("图层模式下一个",                     "M,PAGE_UP",    "向前循环渲染模式(所有，图层)");
    public static final ConfigHotkey LAYER_MODE_PREVIOUS                = new ConfigHotkey("图层模式上一个",                 "M,PAGE_DOWN",  "向后循环渲染模式(全部，图层)");
    public static final ConfigHotkey LAYER_NEXT                         = new ConfigHotkey("下一层",                         "PAGE_UP",      "向上移动渲染层选择");
    public static final ConfigHotkey LAYER_PREVIOUS                     = new ConfigHotkey("上一层",                     "PAGE_DOWN",    "向下移动渲染层选择");
    public static final ConfigHotkey LAYER_SET_HERE                     = new ConfigHotkey("图层设置当前位置",                      "",     "将渲染层设置为玩家的当前位置");
    public static final ConfigHotkey NUDGE_SELECTION_NEGATIVE           = new ConfigHotkey("轻推选择负",            "",     "将当前选择向“负”方向微移，这与按下鼠标滚轮基本相同，按下微移修饰符");
    public static final ConfigHotkey NUDGE_SELECTION_POSITIVE           = new ConfigHotkey("轻推选择积极",            "",     "向“正”方向微调当前选择，这与按下微调修改器时向上鼠标滚轮基本相同");
    public static final ConfigHotkey MOVE_ENTIRE_SELECTION              = new ConfigHotkey("移动整个选择",               "",     "将整个当前选择移至此处");
    public static final ConfigHotkey OPEN_GUI_AREA_SETTINGS             = new ConfigHotkey("打开Gui区域设置",               "KP_MULTIPLY", "打开当前所选区域的区域设置界面");
    public static final ConfigHotkey OPEN_GUI_LOADED_SCHEMATICS         = new ConfigHotkey("打开Gui加载原理图",           "",     "打开加载的原理图界面");
    public static final ConfigHotkey OPEN_GUI_MAIN_MENU                 = new ConfigHotkey("打开Gui主菜单",                   "M",    KeybindSettings.RELEASE_EXCLUSIVE, "打开全息蓝图模组主菜单");
    public static final ConfigHotkey OPEN_GUI_MATERIAL_LIST             = new ConfigHotkey("打开Gui材料列表",               "M,L",  "为当前选定的原理图放置\n打开材料列表界面");
    public static final ConfigHotkey OPEN_GUI_PLACEMENT_SETTINGS        = new ConfigHotkey("打开Gui放置设置",          "KP_SUBTRACT", "打开当前所选位置或子区域的位置设置界面");
    public static final ConfigHotkey OPEN_GUI_SCHEMATIC_PLACEMENTS      = new ConfigHotkey("打开Gui原理图放置",        "M,P",  "打开原理图放置界面");
    public static final ConfigHotkey OPEN_GUI_SCHEMATIC_PROJECTS        = new ConfigHotkey("打开Gui原理图项目",          "",     "打开原理图项目界面");
    public static final ConfigHotkey OPEN_GUI_SCHEMATIC_VERIFIER        = new ConfigHotkey("打开Gui原理图验证器",          "M,V",  "为当前选定的原理图放置\n打开原理图验证程序界面");
    public static final ConfigHotkey OPEN_GUI_SELECTION_MANAGER         = new ConfigHotkey("打开Gui选择管理器",           "M,S",  "打开区域选择管理器界面");
    public static final ConfigHotkey OPEN_GUI_SETTINGS                  = new ConfigHotkey("打开Gui选择管理器",                   "M,C",  "打开配置图形用户界面");
    public static final ConfigHotkey OPERATION_MODE_CHANGE_MODIFIER     = new ConfigHotkey("操作模式更改修改器",       "LEFT_CONTROL", KeybindSettings.MODIFIER_INGAME, "用于快速更改操作模式的修改键。\n按住此键并在按住“工具项”的同时滚动以快速循环模式。");
    public static final ConfigHotkey PICK_BLOCK_FIRST                   = new ConfigHotkey("首先选择方块",                    "BUTTON_3",     KeybindSettings.PRESS_ALLOWEXTRA, "一个键来选择块第一个\n原理图块光线追踪到");
    public static final ConfigHotkey PICK_BLOCK_LAST                    = new ConfigHotkey("最后选择方块",                     "",             KeybindSettings.MODIFIER_INGAME, "在第一个(可能的)客户世界\n块光线追踪到之前，选择一个键来阻止光线追踪到的最后一个原理图块\n基本上，这会让您获得可以针对现有块放置的块。");
    public static final ConfigHotkey PICK_BLOCK_TOGGLE                  = new ConfigHotkey("切换选择方块",                   "M,BUTTON_3",   "用于在\n通用配置中切换拾取块切换选项的热键。 这是作为启用\n禁用拾取块键的快速方法提供的，如果它们干扰了某些东西。");
    public static final ConfigHotkey RENDER_INFO_OVERLAY                = new ConfigHotkey("渲染信息叠加层",                 "I",            KeybindSettings.PRESS_ALLOWEXTRA, "启用呈现块信息覆盖的键。\n使用 NONE 不需要按下键。\n在 Visuals\nconfigs 中禁用类似命名的选项以完全禁用覆盖。");
    public static final ConfigHotkey RENDER_OVERLAY_THROUGH_BLOCKS      = new ConfigHotkey("通过块渲染叠加层",        "RIGHT_CONTROL", KeybindSettings.PRESS_ALLOWEXTRA, "允许覆盖通过块呈现的热键。这只是一种更快的临时启用方式与 视觉效果 中的“通过块的示意图覆盖渲染”选项所做的相同。");
    public static final ConfigHotkey RERENDER_SCHEMATIC                 = new ConfigHotkey("重新渲染原理图",                 "F3,M", "仅刷新/重绘原理图的热键，而不必\n使用F3+A刷新原版地形");
    public static final ConfigHotkey SAVE_AREA_AS_IN_MEMORY_SCHEMATIC   = new ConfigHotkey("将区域保存为内存中的原理图",       "",     "将当前区域选择保存为内存中的示意图");
    public static final ConfigHotkey SAVE_AREA_AS_SCHEMATIC_TO_FILE     = new ConfigHotkey("将区域保存为原理图文件",         "LEFT_CONTROL,LEFT_ALT,S",  "将当前区域选择作为示意图保存到文件中");
    public static final ConfigHotkey SCHEMATIC_EDIT_BREAK_ALL_EXCEPT    = new ConfigHotkey("编辑原理图，除非全部中断",       "", KeybindSettings.MODIFIER_INGAME, "在原理图编辑工具模式中激活“打破除此之外的所有内容”\n模式/功能的修改键。\n基本上，当您按住此键并打出原理图块时，\n除此块之外的所有其他块都将从原理图中删除。");
    public static final ConfigHotkey SCHEMATIC_EDIT_BREAK_ALL           = new ConfigHotkey("编辑原理图放置全部",        "", KeybindSettings.MODIFIER_INGAME, "用于在原理图编辑工具模式下激活“断开所有相同块”\n功能的修改键");
    public static final ConfigHotkey SCHEMATIC_EDIT_BREAK_DIRECTION     = new ConfigHotkey("编辑原理图按指定方向放置",  "", KeybindSettings.MODIFIER_INGAME, "在原理图编辑工具模式下激活定向/连续\n断开或放置功能的修改键");
    public static final ConfigHotkey SCHEMATIC_EDIT_REPLACE_ALL         = new ConfigHotkey("编辑原理图全部替换",           "", KeybindSettings.MODIFIER_INGAME, "在原理图编辑工具模式下激活“替换所有相同的”\n替换模式/功能的修改键");
    public static final ConfigHotkey SCHEMATIC_EDIT_REPLACE_BLOCK       = new ConfigHotkey("编辑原理图替换方块",         "", KeybindSettings.MODIFIER_INGAME, "在原理图编辑工具模式下激活“替换块类型”\n替换模式/功能的修改键");
    public static final ConfigHotkey SCHEMATIC_EDIT_REPLACE_DIRECTION   = new ConfigHotkey("原理图编辑替换方向",     "", KeybindSettings.MODIFIER_INGAME, "在原理图编辑工具模式下激活定向/连续\n替换模式/功能的修改键");
    public static final ConfigHotkey SCHEMATIC_VERSION_CYCLE_MODIFIER   = new ConfigHotkey("原理图版本循环修改器",     "",     KeybindSettings.MODIFIER_INGAME, "按住修改键可以使用鼠标滚轮，不在版本控制工具模式下循环浏览原理图版本");
    public static final ConfigHotkey SCHEMATIC_VERSION_CYCLE_NEXT       = new ConfigHotkey("原理图版本周期下一个",         "",     "在版本控制工具模式下循环到下一个原理图版本的热键");
    public static final ConfigHotkey SCHEMATIC_VERSION_CYCLE_PREVIOUS   = new ConfigHotkey("原理图版本周期上一页",     "",     "在版本控制工具模式下循环到下一个原理图版本的热键");
    public static final ConfigHotkey SELECTION_GRAB_MODIFIER            = new ConfigHotkey("选择抓取修饰符",             "",     KeybindSettings.MODIFIER_INGAME, "按住修改键以“抓取”一个选择框或角以移动光标。");
    public static final ConfigHotkey SELECTION_GROW_HOTKEY              = new ConfigHotkey("选择增长",                     "",     "围绕任何相邻/对角连接的块自动增长选择框的操作热键");
    public static final ConfigHotkey SELECTION_GROW_MODIFIER            = new ConfigHotkey("选择增长修改器",             "",     KeybindSettings.MODIFIER_INGAME, "滚动时按住以扩大或缩小\n选择框的修饰键");
    public static final ConfigHotkey SELECTION_NUDGE_MODIFIER           = new ConfigHotkey("选择微调修改器",            "LEFT_ALT", KeybindSettings.MODIFIER_INGAME, "滚动时按住的修改键\n以轻推所选区域或角落");
    public static final ConfigHotkey SELECTION_MODE_CYCLE               = new ConfigHotkey("选择模式周期",                "LEFT_CONTROL,M", "在区域选择模式下更改角落和长方体之间的模式");
    public static final ConfigHotkey SELECTION_SHRINK_HOTKEY            = new ConfigHotkey("选择收缩",                   "",     "用于缩小选择框的操作热键，以便\n任何一侧都没有任何空白空间(空白层)");
    public static final ConfigHotkey SET_AREA_ORIGIN                    = new ConfigHotkey("设置区域原点",                     "",     "设置/移动当前区域选择的原点\n到玩家的位置");
    public static final ConfigHotkey SET_SELECTION_BOX_POSITION_1       = new ConfigHotkey("设置选择框位置1",          "",     "将当前选定框的第一个位置\n设置为玩家的位置");
    public static final ConfigHotkey SET_SELECTION_BOX_POSITION_2       = new ConfigHotkey("设置选择框位置2",          "",     "将当前选中框的第二个位置\n设置为玩家的位置");
    public static final ConfigHotkey TOGGLE_ALL_RENDERING               = new ConfigHotkey("切换所有渲染",                "M,R",  "打开/关闭所有渲染”，“所有渲染");
    public static final ConfigHotkey TOGGLE_AREA_SELECTION_RENDERING    = new ConfigHotkey("切换区域选择框渲染", "",     "打开/关闭区域选择框渲染");
    public static final ConfigHotkey TOGGLE_SCHEMATIC_RENDERING         = new ConfigHotkey("切换原理图渲染",          "M,G",  "打开/关闭原理图渲染(块和叠加)");
    public static final ConfigHotkey TOGGLE_INFO_OVERLAY_RENDERING      = new ConfigHotkey("切换覆盖渲染",        "",     "切换信息叠加渲染(对于悬停的块信息)");
    public static final ConfigHotkey TOGGLE_OVERLAY_RENDERING           = new ConfigHotkey("切换叠加渲染",            "",     "打开/关闭块叠加渲染");
    public static final ConfigHotkey TOGGLE_OVERLAY_OUTLINE_RENDERING   = new ConfigHotkey("切换叠加轮廓渲染",     "",     "打开/关闭块覆盖轮廓渲染");
    public static final ConfigHotkey TOGGLE_OVERLAY_SIDE_RENDERING      = new ConfigHotkey("切换叠加侧渲染",        "",     "打开/关闭块覆盖面渲染");
    public static final ConfigHotkey TOGGLE_PLACEMENT_BOXES_RENDERING   = new ConfigHotkey("切换放置框渲染",     "",     "打开/关闭原理图放置框渲染");
    public static final ConfigHotkey TOGGLE_PLACEMENT_RESTRICTION       = new ConfigHotkey("切换放置限制",        "",     "切换放置限制模式的热键");
    public static final ConfigHotkey TOGGLE_SCHEMATIC_BLOCK_RENDERING   = new ConfigHotkey("切换原理图块渲染",     "",     "打开/关闭原理图块渲染");
    public static final ConfigHotkey TOGGLE_SIGN_TEXT_PASTE             = new ConfigHotkey("切换符号文本粘贴",               "",     "切换标志文本粘贴配置值(在通用类别中)");
    public static final ConfigHotkey TOGGLE_TRANSLUCENT_RENDERING       = new ConfigHotkey("切换半透明渲染",        "",     "切换半透明与不透明的鬼块渲染");
    public static final ConfigHotkey TOGGLE_VERIFIER_OVERLAY_RENDERING  = new ConfigHotkey("切换验证器覆盖渲染",    "",     "切换原理图验证器叠加渲染");
    public static final ConfigHotkey TOOL_ENABLED_TOGGLE                = new ConfigHotkey("工具启用切换",                 "M,T",  "打开/关闭“工具”项目功能的快捷键");
    public static final ConfigHotkey TOOL_PLACE_CORNER_1                = new ConfigHotkey("工具放置角1",                  "BUTTON_1", KeybindSettings.PRESS_ALLOWEXTRA, "按住“工具”项\n放置主要/第一个角时使用的按钮");
    public static final ConfigHotkey TOOL_PLACE_CORNER_2                = new ConfigHotkey("工具放置角2",                  "BUTTON_2", KeybindSettings.PRESS_ALLOWEXTRA, "按住“工具”项\n放置第二个角时使用的按钮");
    public static final ConfigHotkey TOOL_SELECT_ELEMENTS               = new ConfigHotkey("工具选择元素",                "BUTTON_3", KeybindSettings.PRESS_ALLOWEXTRA, "按住“工具”项时\n用于选择角或框的按钮");
    public static final ConfigHotkey TOOL_SELECT_MODIFIER_BLOCK_1       = new ConfigHotkey("工具选择修改器块1",          "LEFT_ALT", KeybindSettings.MODIFIER_INGAME, "使用“工具选择元素”\n热键时要按住的修改键，以选择要在某些工具模式中使用的主要块类型");
    public static final ConfigHotkey TOOL_SELECT_MODIFIER_BLOCK_2       = new ConfigHotkey("工具选择修改器块2",          "LEFT_SHIFT", KeybindSettings.MODIFIER_INGAME, "使用“工具选择元素”\n热键时要按住的修改键，以选择要在某些工具模式中使用的辅助块类型");
    public static final ConfigHotkey UNLOAD_CURRENT_SCHEMATIC           = new ConfigHotkey("卸载当前原理图",            "",     "卸载当前所选布局的原理图，从而也删除从中创建的所有布局");

    public static final List<ConfigHotkey> HOTKEY_LIST = ImmutableList.of(
            ADD_SELECTION_BOX,
            CLONE_SELECTION,
            DELETE_SELECTION_BOX,
            EASY_PLACE_ACTIVATION,
            EASY_PLACE_TOGGLE,
            EXECUTE_OPERATION,
            INVERT_GHOST_BLOCK_RENDER_STATE,
            INVERT_OVERLAY_RENDER_STATE,
            LAYER_MODE_NEXT,
            LAYER_MODE_PREVIOUS,
            LAYER_NEXT,
            LAYER_PREVIOUS,
            LAYER_SET_HERE,
            NUDGE_SELECTION_NEGATIVE,
            NUDGE_SELECTION_POSITIVE,
            MOVE_ENTIRE_SELECTION,
            OPEN_GUI_AREA_SETTINGS,
            OPEN_GUI_LOADED_SCHEMATICS,
            OPEN_GUI_MAIN_MENU,
            OPEN_GUI_MATERIAL_LIST,
            OPEN_GUI_PLACEMENT_SETTINGS,
            OPEN_GUI_SCHEMATIC_PLACEMENTS,
            OPEN_GUI_SCHEMATIC_PROJECTS,
            OPEN_GUI_SCHEMATIC_VERIFIER,
            OPEN_GUI_SELECTION_MANAGER,
            OPEN_GUI_SETTINGS,
            OPERATION_MODE_CHANGE_MODIFIER,
            PICK_BLOCK_FIRST,
            PICK_BLOCK_LAST,
            PICK_BLOCK_TOGGLE,
            RENDER_INFO_OVERLAY,
            RENDER_OVERLAY_THROUGH_BLOCKS,
            RERENDER_SCHEMATIC,
            SAVE_AREA_AS_IN_MEMORY_SCHEMATIC,
            SAVE_AREA_AS_SCHEMATIC_TO_FILE,
            SCHEMATIC_EDIT_BREAK_ALL,
            SCHEMATIC_EDIT_BREAK_ALL_EXCEPT,
            SCHEMATIC_EDIT_BREAK_DIRECTION,
            SCHEMATIC_EDIT_REPLACE_ALL,
            SCHEMATIC_EDIT_REPLACE_BLOCK,
            SCHEMATIC_EDIT_REPLACE_DIRECTION,
            SCHEMATIC_VERSION_CYCLE_MODIFIER,
            SCHEMATIC_VERSION_CYCLE_NEXT,
            SCHEMATIC_VERSION_CYCLE_PREVIOUS,
            SELECTION_GRAB_MODIFIER,
            SELECTION_GROW_HOTKEY,
            SELECTION_GROW_MODIFIER,
            SELECTION_NUDGE_MODIFIER,
            SELECTION_MODE_CYCLE,
            SELECTION_SHRINK_HOTKEY,
            SET_AREA_ORIGIN,
            SET_SELECTION_BOX_POSITION_1,
            SET_SELECTION_BOX_POSITION_2,
            TOGGLE_ALL_RENDERING,
            TOGGLE_AREA_SELECTION_RENDERING,
            TOGGLE_INFO_OVERLAY_RENDERING,
            TOGGLE_OVERLAY_RENDERING,
            TOGGLE_OVERLAY_OUTLINE_RENDERING,
            TOGGLE_OVERLAY_SIDE_RENDERING,
            TOGGLE_PLACEMENT_BOXES_RENDERING,
            TOGGLE_PLACEMENT_RESTRICTION,
            TOGGLE_SCHEMATIC_BLOCK_RENDERING,
            TOGGLE_SCHEMATIC_RENDERING,
            TOGGLE_SIGN_TEXT_PASTE,
            TOGGLE_TRANSLUCENT_RENDERING,
            TOGGLE_VERIFIER_OVERLAY_RENDERING,
            TOOL_ENABLED_TOGGLE,
            TOOL_PLACE_CORNER_1,
            TOOL_PLACE_CORNER_2,
            TOOL_SELECT_ELEMENTS,
            TOOL_SELECT_MODIFIER_BLOCK_1,
            TOOL_SELECT_MODIFIER_BLOCK_2,
            UNLOAD_CURRENT_SCHEMATIC
    );
}