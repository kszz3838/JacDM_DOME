package com.blackwind.jac.DM;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

import java.util.Scanner;

public class dm {
    static ActiveXComponent DM = new ActiveXComponent("dm.dmsoft");


    /**
     * @BY BlackWind
     * @QQ 2597906396
     * @Email 2597906396@qq.com
     * @date 2023/7/20 20:16
     * 大漠处理信息
     */
    public static int DataToInt(Variant SS){
        return Integer.parseInt(String.valueOf(SS));
    }

    public static String DataToString(Variant SS){
        return String.valueOf(SS);
    }


    /**
     * @BY BlackWind
     * @QQ 2597906396
     * @Email 2597906396@qq.com
     * @date 2023/7/15 20:54
     * 窗口
     */
    public static Variant[] ClientToScreen(int hwnd) {
        Variant x = new Variant(-1, true);
        Variant y = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "GetCursorPos", hwnd, x, y);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = x;
        jg[2] = y;
        return jg;
    }

    public static String EnumProcess(String name) {
        return Dispatch.call(DM, "EnumProcess", name).getString();
    }

    public static String EnumWindow(int parent, String title, String class_name, int filter) {
        return Dispatch.call(DM, "EnumWindow", parent, title, class_name, filter).getString();
    }

    public static String EnumWindowByProcess(int process_name, String title, String class_name, int filter) {
        return Dispatch.call(DM, "EnumWindowByProcess", process_name, title, class_name, filter).getString();
    }

    public static String EnumWindowByProcessId(int pid, String title, String class_name, int filter) {
        return Dispatch.call(DM, "EnumWindowByProcessId", pid, title, class_name, filter).getString();
    }

    public static String EnumWindowSuper(String spec1, int flag1, int type1, int spec2, int flag2, int type2, int sort) {
        return Dispatch.call(DM, "EnumWindowSuper", spec1, flag1, type1, spec2, flag2, type2, sort).getString();
    }


    public static int FindWindow(String classNAME, String title) {
        return Dispatch.call(DM, "FindWindow", classNAME, title).getInt();
    }

    public static int FindWindowByProcess(String process_name, String classNAME, String title) {
        return Dispatch.call(DM, "FindWindowByProcess", process_name, classNAME, title).getInt();
    }


    public static int FindWindowByProcessId(int process_id, String classNAME, String title) {
        return Dispatch.call(DM, "FindWindowByProcessId", process_id, classNAME, title).getInt();
    }

    public static int FindWindowEx(int parent, String classNAME, String title) {
        return Dispatch.call(DM, "FindWindowEx", parent, classNAME, title).getInt();
    }

    public static int FindWindowSuper(int spec1, int flag1, int type1, int spec2, int flag2, int type2) {
        return Dispatch.call(DM, "FindWindowSuper", spec1, flag1, type1, spec2, flag2, type2).getInt();
    }


    public static Variant[] GetClientRect(int hwnd) {
        Variant x1 = new Variant(-1, true);
        Variant y1 = new Variant(-1, true);
        Variant x2 = new Variant(-1, true);
        Variant y2 = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "GetClientRect", hwnd, x1, y1, x2, y2);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = x1;
        jg[2] = y1;
        jg[3] = x2;
        jg[4] = y2;
        return jg;
    }


    public static Variant[] GetClientSize(int hwnd) {
        Variant width = new Variant(-1, true);
        Variant height = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "GetClientSize", hwnd, width, height);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = width;
        jg[2] = height;
        return jg;
    }


    public static int GetForegroundFocus() {
        return Dispatch.call(DM, "GetForegroundFocus").getInt();
    }


    public static int GetForegroundWindow() {
        return Dispatch.call(DM, "GetForegroundWindow").getInt();
    }


    public static int GetMousePointWindow(int x, int y) {
        return Dispatch.call(DM, "GetMousePointWindow", x, y).getInt();
    }


    public static String GetProcessInfo(int pid) {
        return Dispatch.call(DM, "GetProcessInfo", pid).getString();
    }

    public static int GetSpecialWindow(int flag) {
        return Dispatch.call(DM, "GetSpecialWindow", flag).getInt();
    }


    public static int GetWindow(int hwnd, int flag) {
        return Dispatch.call(DM, "GetWindow", hwnd, flag).getInt();
    }

    public static String GetWindowClass(int hwnd) {
        return Dispatch.call(DM, "GetWindowClass", hwnd).getString();
    }


    public static int GetWindowProcessId(int hwnd) {
        return Dispatch.call(DM, "GetWindowProcessId", hwnd).getInt();
    }


    public static String GetWindowProcessPath(int hwnd) {
        return Dispatch.call(DM, "GetWindowProcessPath", hwnd).getString();
    }


    public static Variant[] GetWindowRect(int hwnd) {
        Variant x1 = new Variant(-1, true);
        Variant x2 = new Variant(-1, true);
        Variant y1 = new Variant(-1, true);
        Variant y2 = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "GetWindowRect", hwnd, x1, y1, x2, y2);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = x1;
        jg[2] = y1;
        jg[3] = x2;
        jg[4] = y2;
        return jg;
    }


    public static int GetWindowState(int hwnd, int flag) {
        return Dispatch.call(DM, "GetWindowState", hwnd, flag).getInt();
    }


    public static int GetWindowThreadId(int hwnd) {
        return Dispatch.call(DM, "GetWindowThreadId", hwnd).getInt();
    }


    public static String GetWindowTitle(int hwnd) {
        return Dispatch.call(DM, "GetWindowTitle", hwnd).getString();
    }


    public static int MoveWindow(int hwnd, int x, int y) {
        return Dispatch.call(DM, "MoveWindow", hwnd, x, y).getInt();
    }


    public static Variant[] ScreenToClient(int hwnd) {
        Variant x1 = new Variant(-1, true);
        Variant y1 = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "ScreenToClient", hwnd, x1, y1);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = x1;
        jg[2] = y1;
        return jg;
    }


    public static int SendPaste(int hwnd) {
        return Dispatch.call(DM, "SendPaste", hwnd).getInt();
    }


    public static int SendString(int hwnd, String str) {
        return Dispatch.call(DM, "SendString", hwnd, str).getInt();
    }

    public static int SendString2(int hwnd, String str) {
        return Dispatch.call(DM, "SendString2", hwnd, str).getInt();
    }

    public static int SendStringIme(String str) {
        return Dispatch.call(DM, "SendStringIme", str).getInt();
    }


    public static int SendStringIme2(int hwnd, String str, int mode) {
        return Dispatch.call(DM, "SendStringIme2", hwnd, str, mode).getInt();
    }


    public static int SetClientSize(int hwnd, int width, int height) {
        return Dispatch.call(DM, "SetClientSize", hwnd, width, height).getInt();
    }


    public static int SetWindowSize(int hwnd, int width, int height) {
        return Dispatch.call(DM, "SetWindowSize", hwnd, width, height).getInt();
    }


    public static int SetWindowState(int hwnd, int flag) {
        return Dispatch.call(DM, "SetWindowState", hwnd, flag).getInt();
    }


    public static int SetWindowText(int hwnd, String title) {
        return Dispatch.call(DM, "SetWindowText", hwnd, title).getInt();
    }


    public static int SetWindowTransparent(int hwnd, int trans) {
        return Dispatch.call(DM, "SetWindowTransparent", hwnd, trans).getInt();
    }


    /**
     * @BY BlackWind
     * @QQ 2597906396
     * @Email 2597906396@qq.com
     * @date 2023/7/16 2:41
     * 答题
     */

    public static int FaqCancel() {
        return Dispatch.call(DM, "FaqCancel").getInt();
    }


    public static int FaqCapture(int x1, int y1, int x2, int y2, int quality, int delay, int time) {
        return Dispatch.call(DM, "FaqCapture", x1, y1, x2, y2, quality, delay, time).getInt();
    }

    public static int FaqCaptureFromFile(int x1, int y1, int x2, int y2, String file, int quality) {
        return Dispatch.call(DM, "FaqCaptureFromFile", x1, y1, x2, y2, quality, file, quality).getInt();
    }

    public static int FaqCaptureString(String str) {
        return Dispatch.call(DM, "FaqCaptureString", str).getInt();
    }


    public static String FaqFetch() {
        return Dispatch.call(DM, "FaqFetch").getString();
    }


    public static int FaqGetSize(int handle) {
        return Dispatch.call(DM, "FaqGetSize", handle).getInt();
    }


    public static int FaqIsPosted() {
        return Dispatch.call(DM, "FaqIsPosted").getInt();
    }


    public static int FaqPost(String server, int handle, int request_type, int time_out) {
        return Dispatch.call(DM, "FaqPost", server, handle, request_type, time_out).getInt();
    }


    public static int FaqSend(String server, int handle, int request_type, int time_out) {
        return Dispatch.call(DM, "FaqSend", server, handle, request_type, time_out).getInt();
    }


    /**
     * @BY BlackWind
     * @QQ 2597906396
     * @Email 2597906396@qq.com
     * @date 2023/7/16 2:48
     * 防护盾
     */

    public static int DmGuard(int enable, String type) {
        return Dispatch.call(DM, "DmGuard", enable, type).getInt();
    }


    public static int DmGuardExtract(String type, String path) {
        return Dispatch.call(DM, "DmGuardExtract", type, path).getInt();
    }

    public static int DmGuardLoadCustom(String type, String path) {
        return Dispatch.call(DM, "DmGuardLoadCustom", type, path).getInt();
    }

    public static String DmGuardParams(String cmd, String subcmd, String param) {
        return Dispatch.call(DM, "DmGuardParams", cmd, subcmd, param).getString();
    }

    public static int UnLoadDriver() {
        return Dispatch.call(DM, "UnLoadDriver").getInt();
    }

    /**
     * @BY BlackWind
     * @QQ 2597906396
     * @Email 2597906396@qq.com
     * @date 2023/7/16 2:52
     * 后台设置
     */

    public static int BindWindow(int hwnd, String display, String mouse, String keypad, int mode) {
        return Dispatch.call(DM, "BindWindow", hwnd, display, mouse, keypad, mode).getInt();
    }

    public static int BindWindowEx(int hwnd, String display, String mouse, String keypad, String publics, int mode) {
        return Dispatch.call(DM, "BindWindowEx", hwnd, display, mouse, keypad, publics, mode).getInt();
    }

    public static int DownCpu(int type, int rate) {
        return Dispatch.call(DM, "DownCpu", type, rate).getInt();
    }

    public static int EnableBind(int enable) {
        return Dispatch.call(DM, "EnableBind", enable).getInt();
    }


    public static int EnableFakeActive(int enable) {
        return Dispatch.call(DM, "EnableFakeActive", enable).getInt();
    }

    public static int EnableIme(int enable) {
        return Dispatch.call(DM, "EnableIme", enable).getInt();
    }

    public static int EnableKeypadMsg(int enable) {
        return Dispatch.call(DM, "EnableKeypadMsg", enable).getInt();
    }

    public static int EnableKeypadPatch(int enable) {
        return Dispatch.call(DM, "EnableKeypadPatch", enable).getInt();
    }

    public static int EnableKeypadSync(int enable, int time_out) {
        return Dispatch.call(DM, "EnableKeypadSync", enable, time_out).getInt();
    }

    public static int EnableMouseMsg(int enable) {
        return Dispatch.call(DM, "EnableMouseMsg", enable).getInt();
    }

    public static int EnableMouseSync(int enable, int time_out) {
        return Dispatch.call(DM, "EnableMouseSync", enable, time_out).getInt();
    }

    public static int EnableRealKeypad(int enable) {
        return Dispatch.call(DM, "EnableRealKeypad", enable).getInt();
    }

    public static int EnableRealMouse(int enable, int mousedelay, int mousestep) {
        return Dispatch.call(DM, "EnableRealMouse", enable, mousedelay, mousestep).getInt();
    }


    public static int EnableSpeedDx(int enable) {
        return Dispatch.call(DM, "EnableSpeedDx", enable).getInt();
    }


    public static int ForceUnBindWindow(int hwnd) {
        return Dispatch.call(DM, "ForceUnBindWindow", hwnd).getInt();
    }


    public static int GetBindWindow() {
        return Dispatch.call(DM, "GetBindWindow").getInt();
    }

    public static int GetFps() {
        return Dispatch.call(DM, "GetFps").getInt();
    }


    public static int HackSpeed(Double rate) {
        return Dispatch.call(DM, "HackSpeed", rate).getInt();
    }

    public static int IsBind(int hwnd) {
        return Dispatch.call(DM, "IsBind", hwnd).getInt();
    }

    public static int LockDisplay(int lock) {
        return Dispatch.call(DM, "LockDisplay", lock).getInt();
    }

    public static int LockInput(int lock) {
        return Dispatch.call(DM, "LockInput", lock).getInt();
    }

    public static int LockMouseRect(int x1, int y1, int x2, int y2) {
        return Dispatch.call(DM, "LockMouseRect", x1, y1, x2, y2).getInt();
    }

    public static int SetAero(int enable) {
        return Dispatch.call(DM, "SetAero", enable).getInt();
    }

    public static int SetDisplayDelay(int time) {
        return Dispatch.call(DM, "SetDisplayDelay", time).getInt();
    }

    public static int SetDisplayRefreshDelay(int time) {
        return Dispatch.call(DM, "SetDisplayRefreshDelay", time).getInt();
    }

    public static int SetInputDm(int dm_id, int rx, int ry) {
        return Dispatch.call(DM, "SetInputDm", dm_id, rx, ry).getInt();
    }


    public static int SwitchBindWindow(int hwnd) {
        return Dispatch.call(DM, "SwitchBindWindow", hwnd).getInt();
    }

    public static int UnBindWindow() {
        return Dispatch.call(DM, "UnBindWindow").getInt();
    }


    /**
     * @BY BlackWind
     * @QQ 2597906396
     * @Email 2597906396@qq.com
     * @date 2023/7/16 3:07
     * 汇编
     */
    public static int AsmAdd(String asm_ins) {
        return Dispatch.call(DM, "AsmAdd", asm_ins).getInt();
    }

    public static int AsmCall(int hwnd, int mode) {
        return Dispatch.call(DM, "AsmCall", hwnd, mode).getInt();
    }

    public static int AsmCallEx(int hwnd, int mode, String base_addr) {
        return Dispatch.call(DM, "AsmCallEx", hwnd, mode, base_addr).getInt();
    }

    public static int AsmClear() {
        return Dispatch.call(DM, "AsmClear").getInt();
    }

    public static int AsmSetTimeout(int time_out, int param) {
        return Dispatch.call(DM, "AsmSetTimeout", time_out, param).getInt();
    }

    public static String Assemble(long base_addr, int is_64bit) {
        return Dispatch.call(DM, "Assemble", base_addr, is_64bit).getString();
    }

    public static String DisAssemble(String asm_code, long base_addr, int is_64bit) {
        return Dispatch.call(DM, "DisAssemble", asm_code, base_addr, is_64bit).getString();
    }

    public static int SetShowAsmErrorMsg(int show) {
        return Dispatch.call(DM, "SetShowAsmErrorMsg", show).getInt();
    }

    /**
     * @BY BlackWind
     * @QQ 2597906396
     * @Email 2597906396@qq.com
     * @date 2023/7/16 3:12
     * 基本设置
     */
    public static int EnablePicCache(int enable) {
        return Dispatch.call(DM, "EnablePicCache", enable).getInt();
    }

    public static String GetBasePath() {
        return Dispatch.call(DM, "GetBasePath").getString();
    }

    public static int GetDmCount() {
        return Dispatch.call(DM, "GetDmCount").getInt();
    }

    public static int GetID() {
        return Dispatch.call(DM, "GetID").getInt();
    }

    public static int GetLastError() {
        return Dispatch.call(DM, "GetLastError").getInt();
    }

    public static String GetPath() {
        return Dispatch.call(DM, "GetPath").getString();
    }

    public static int Reg(String reg_code, String ver_info) {
        return Dispatch.call(DM, "Reg", reg_code, ver_info).getInt();
    }

    public static int RegEX(String reg_code, String ver_info, String ip) {
        return Dispatch.call(DM, "RegEX", reg_code, ver_info, ip).getInt();
    }

    public static int RegExNoMac(String reg_code, String ver_info, String ip) {
        return Dispatch.call(DM, "RegExNoMac", reg_code, ver_info, ip).getInt();
    }

    public static int RegNoMac(String reg_code, String ver_info) {
        return Dispatch.call(DM, "RegNoMac", reg_code, ver_info).getInt();
    }


    public static int SetDisplayInput(String mode) {
        return Dispatch.call(DM, "SetDisplayInput", mode).getInt();
    }

    public static int SetEnumWindowDelay(int delay) {
        return Dispatch.call(DM, "SetEnumWindowDelay", delay).getInt();
    }

    public static int SetPath(String path) {
        return Dispatch.call(DM, "SetPath", path).getInt();
    }

    public static int SetShowErrorMsg(int show) {
        return Dispatch.call(DM, "SetShowErrorMsg", show).getInt();
    }

    public static int SpeedNormalGraphic(int enable) {
        return Dispatch.call(DM, "SpeedNormalGraphic", enable).getInt();
    }


    public static String Ver() {
        return Dispatch.call(DM, "Ver").getString();
    }

    /**
     * @BY BlackWind
     * @QQ 2597906396
     * @Email 2597906396@qq.com
     * @date 2023/7/16 3:21
     * 键鼠
     */

    public static int EnableMouseAccuracy(int enable) {
        return Dispatch.call(DM, "EnableMouseAccuracy", enable).getInt();
    }

    public static Variant[] GetCursorPos() {
        Variant x = new Variant(-1, true);
        Variant y = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "GetCursorPos", x, y);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = x;
        jg[2] = y;
        return jg;
    }

    public static String GetCursorShape() {
        return Dispatch.call(DM, "GetCursorShape").getString();
    }

    public static String GetCursorShapeEx(int type) {
        return Dispatch.call(DM, "GetCursorShapeEx", type).getString();
    }

    public static String GetCursorSpot() {
        return Dispatch.call(DM, "GetCursorSpot").getString();
    }

    public static int GetKeyState(int vk_code) {
        return Dispatch.call(DM, "GetKeyState", vk_code).getInt();
    }

    public static int GetMouseSpeed() {
        return Dispatch.call(DM, "GetMouseSpeed").getInt();
    }

    public static int KeyDown(int vk_code) {
        return Dispatch.call(DM, "KeyDown", vk_code).getInt();
    }

    public static int KeyDownChar(String key_str) {
        return Dispatch.call(DM, "KeyDownChar", key_str).getInt();
    }

    public static int KeyPress(int vk_code) {
        return Dispatch.call(DM, "KeyPress", vk_code).getInt();
    }

    public static int KeyPressChar(String key_str) {
        return Dispatch.call(DM, "KeyDownChar", key_str).getInt();
    }

    public static int KeyPressStr(String key_str, int delay) {
        return Dispatch.call(DM, "KeyPressStr", key_str, delay).getInt();
    }


    public static int KeyUp(int vk_code) {
        return Dispatch.call(DM, "KeyUp", vk_code).getInt();
    }


    public static int KeyUpChar(String key_str) {
        return Dispatch.call(DM, "KeyUpChar", key_str).getInt();
    }

    public static int LeftClick() {
        return Dispatch.call(DM, "LeftClick").getInt();
    }

    public static int LeftDoubleClick() {
        return Dispatch.call(DM, "LeftDoubleClick").getInt();
    }

    public static int LeftDown() {
        return Dispatch.call(DM, "LeftDown").getInt();
    }

    public static int LeftUp() {
        return Dispatch.call(DM, "LeftUp").getInt();
    }

    public static int MiddleClick() {
        return Dispatch.call(DM, "MiddleClick").getInt();
    }

    public static int MiddleDown() {
        return Dispatch.call(DM, "MiddleDown").getInt();
    }

    public static int MiddleUp() {
        return Dispatch.call(DM, "MiddleUp").getInt();
    }

    public static int MoveR(int rx, int ry) {
        return Dispatch.call(DM, "MoveR", rx, ry).getInt();
    }

    public static int MoveTo(int rx, int ry) {
        return Dispatch.call(DM, "MoveTo", rx, ry).getInt();
    }

    public static String MoveToEx(int x, int y, int w, int h) {
        return Dispatch.call(DM, "MoveToEx", x, y, w, h).getString();
    }

    public static int RightClick() {
        return Dispatch.call(DM, "RightClick").getInt();
    }

    public static int RightDown() {
        return Dispatch.call(DM, "RightDown").getInt();
    }

    public static int RightUp() {
        return Dispatch.call(DM, "RightUp").getInt();
    }

    public static int SetKeypadDelay(String type, int delay) {
        return Dispatch.call(DM, "SetKeypadDelay", type, delay).getInt();
    }

    public static int SetMouseDelay(String type, int delay) {
        return Dispatch.call(DM, "SetMouseDelay", type, delay).getInt();
    }

    public static int SetMouseSpeed(int Speed) {
        return Dispatch.call(DM, "SetMouseSpeed", Speed).getInt();
    }

    public static int SetSimMode(int mode) {
        return Dispatch.call(DM, "SetSimMode", mode).getInt();
    }

    public static int WaitKey(int vk_code, int time_out) {
        return Dispatch.call(DM, "WaitKey", vk_code, time_out).getInt();
    }

    public static int WheelDown() {
        return Dispatch.call(DM, "WheelDown").getInt();
    }

    public static int WheelUp() {
        return Dispatch.call(DM, "WheelDown").getInt();
    }

    /**
     * @BY BlackWind
     * @QQ 2597906396
     * @Email 2597906396@qq.com
     * @date 2023/7/16 3:35
     * 算法
     */

    public static String ExcludePos(String all_pos, int type, int x1, int y1, int x2, int y2) {
        return Dispatch.call(DM, "ExcludePos", all_pos, type, x1, y1, x2, y2).getString();
    }

    public static String FindNearestPos(String all_pos, int type, int x, int y) {
        return Dispatch.call(DM, "FindNearestPos", all_pos, type, x, y).getString();
    }


    public static String SortPosDistance(String all_pos, int type, int x, int y) {
        return Dispatch.call(DM, "SortPosDistance", all_pos, type, x, y).getString();
    }


    /**
     * @BY BlackWind
     * @QQ 2597906396
     * @Email 2597906396@qq.com
     * @date 2023/7/16 3:37
     * 内存
     * longlong = long
     */
    public static String DoubleToData(double value) {
        return Dispatch.call(DM, "DoubleToData", value).getString();
    }

    public static String FindData(int hwnd, String addr_range, String data) {
        return Dispatch.call(DM, "FindData", hwnd, addr_range, data).getString();
    }

    public static String FindDataEx(int hwnd, String addr_range, String data, int step, int multi_thread, int mode) {
        return Dispatch.call(DM, "FindDataEx", hwnd, addr_range, data, step, multi_thread, mode).getString();
    }

    public static String FindDouble(int hwnd, String addr_range, double double_value_min, double double_value_max) {
        return Dispatch.call(DM, "FindDouble", hwnd, addr_range, double_value_min, double_value_max).getString();
    }

    public static String FindDoubleEx(int hwnd, String addr_range, double double_value_min, double double_value_max, int step, int multi_thread, int mode) {
        return Dispatch.call(DM, "FindDoubleEx", hwnd, addr_range, double_value_min, double_value_max, step, multi_thread, mode).getString();
    }

    public static String FindFloat(int hwnd, String addr_range, Float float_value_min, Float float_value_max) {
        return Dispatch.call(DM, "FindFloat", hwnd, addr_range, float_value_min, float_value_max).getString();
    }

    public static String FindFloatEx(int hwnd, String addr_range, Float float_value_min, Float float_value_max, int step, int multi_thread, int mode) {
        return Dispatch.call(DM, "FindFloatEx", hwnd, addr_range, float_value_min, float_value_max, step, multi_thread, mode).getString();
    }

    public static String FindInt(int hwnd, String addr_range, int int_value_min, int int_value_max) {
        return Dispatch.call(DM, "FindInt", hwnd, addr_range, int_value_min, int_value_max).getString();
    }

    public static String FindIntEx(int hwnd, String addr_range, int int_value_min, int int_value_max, int step, int multi_thread, int mode) {
        return Dispatch.call(DM, "FindIntEx", hwnd, addr_range, int_value_min, int_value_max, step, multi_thread, mode).getString();
    }

    public static String FindString(int hwnd, String addr_range, String string_value) {
        return Dispatch.call(DM, "FindString", hwnd, addr_range, string_value).getString();
    }

    public static String FindStringEx(int hwnd, String addr_range, String string_value, int step, int multi_thread, int mode) {
        return Dispatch.call(DM, "FindStringEx", hwnd, addr_range, string_value, step, multi_thread, mode).getString();
    }

    public static String FloatToData(Float value) {
        return Dispatch.call(DM, "FloatToData", value).getString();
    }

    public static String FreeProcessMemory(int hwnd) {
        return Dispatch.call(DM, "FreeProcessMemory", hwnd).getString();
    }

    public static String GetCommandLine(int hwnd) {
        return Dispatch.call(DM, "GetCommandLine", hwnd).getString();
    }

    public static long GetModuleBaseAddr(int hwnd, String module) {
        return Dispatch.call(DM, "GetModuleBaseAddr", hwnd, module).getLong();
    }

    public static int GetModuleSize(int hwnd, String module) {
        return Dispatch.call(DM, "GetModuleSize", hwnd, module).getInt();
    }

    public static long GetRemoteApiAddress(int hwnd, long base_addr, String fun_name) {
        return Dispatch.call(DM, "GetRemoteApiAddress", hwnd, base_addr, fun_name).getLong();
    }


    public static int Int64ToInt32(long value) {
        return Dispatch.call(DM, "Int64ToInt32", value).getInt();
    }

    public static String IntToData(long value, int type) {
        return Dispatch.call(DM, "IntToData", value, type).getString();
    }

    public static int OpenProcess(int pid) {
        System.out.println((long) Dispatch.call(DM, "OpenProcess", pid).getInt());
        return Dispatch.call(DM, "OpenProcess", pid).getInt();
    }

    public static String ReadData(int hwnd, String addr, int len) {
        return Dispatch.call(DM, "ReadData", hwnd, addr, len).getString();
    }

    public static String ReadDataAddr(int hwnd, long addr, int len) {
        return Dispatch.call(DM, "ReadDataAddr", hwnd, addr, len).getString();
    }

    public static int ReadDataAddrToBin(int hwnd, long addr, int len) {
        return Dispatch.call(DM, "ReadDataAddrToBin", hwnd, addr, len).getInt();
    }

    public static int ReadDataToBin(int hwnd, String addr, int len) {
        return Dispatch.call(DM, "ReadDataToBin", hwnd, addr, len).getInt();
    }

    public static double ReadDouble(int hwnd, String addr) {
        return Dispatch.call(DM, "ReadDouble", hwnd, addr).getDouble();
    }


    public static double ReadDoubleAddr(int hwnd, long addr) {
        return Dispatch.call(DM, "ReadDoubleAddr", hwnd, addr).getDouble();
    }

    public static float ReadFloat(int hwnd, String addr) {
        return Dispatch.call(DM, "ReadFloat", hwnd, addr).getFloat();
    }


    public static float ReadFloatAddr(int hwnd, long addr) {
        return Dispatch.call(DM, "ReadFloatAddr", hwnd, addr).getFloat();
    }

    public static long ReadInt(int hwnd, String addr, int type) {
        return Dispatch.call(DM, "ReadInt", hwnd, addr, type).getLong();
    }

    public static long ReadIntAddr(int hwnd, long addr, int type) {
        return Dispatch.call(DM, "ReadIntAddr", hwnd, addr, type).getLong();
    }

    public static String ReadString(int hwnd, String addr, int type, int len) {
        return Dispatch.call(DM, "ReadString", hwnd, addr, type, len).getString();
    }


    public static String ReadStringAddr(int hwnd, long addr, int type, int len) {
        return Dispatch.call(DM, "ReadString", hwnd, addr, type, len).getString();
    }


    public static int SetMemoryFindResultToFile(String file) {
        return Dispatch.call(DM, "SetMemoryFindResultToFile", file).getInt();
    }

    public static int SetMemoryHwndAsProcessId(int en) {
        return Dispatch.call(DM, "SetMemoryHwndAsProcessId", en).getInt();
    }

    public static int SetParam64ToPointer() {
        return Dispatch.call(DM, "SetParam64ToPointer").getInt();
    }

    public static String StringToData(String value, int type) {
        return Dispatch.call(DM, "StringToData", value, type).getString();
    }

    public static int TerminateProcess(int pid) {
        return Dispatch.call(DM, "TerminateProcess", pid).getInt();
    }

    public static long VirtualAllocEx(int hwnd, long addr, int size, int type) {
        return Dispatch.call(DM, "VirtualAllocEx", hwnd, addr, size, type).getLong();
    }


    public static int VirtualFreeEx(int hwnd, long addr) {
        return Dispatch.call(DM, "VirtualFreeEx", hwnd, addr).getInt();
    }

    public static int VirtualProtectEx(int hwnd, long addr, int size, int type, int old_protect) {
        return Dispatch.call(DM, "VirtualProtectEx", hwnd, addr, size, type, old_protect).getInt();
    }

    public static String VirtualQueryEx(int hwnd, long addr, int pmbi) {
        return Dispatch.call(DM, "VirtualQueryEx", hwnd, addr, pmbi).getString();
    }

    public static int WriteData(int hwnd, String addr, String data) {
        return Dispatch.call(DM, "WriteData", hwnd, addr, data).getInt();
    }

    public static int WriteDataAddr(int hwnd, String addr, String data) {
        return Dispatch.call(DM, "WriteDataAddr", hwnd, addr, data).getInt();
    }

    public static int WriteDataAddrFromBin(int hwnd, String addr, int data, int Len) {
        return Dispatch.call(DM, "WriteDataAddrFromBin", hwnd, addr, data, Len).getInt();
    }

    public static int WriteDataFromBin(int hwnd, String addr, int data, int Len) {
        return Dispatch.call(DM, "WriteDataFromBin", hwnd, addr, data, Len).getInt();
    }

    public static int WriteDouble(int hwnd, String addr, Double v) {
        return Dispatch.call(DM, "WriteDouble", hwnd, addr, v).getInt();
    }


    public static int WriteDoubleAddr(int hwnd, long addr, Double v) {
        return Dispatch.call(DM, "WriteDoubleAddr", hwnd, addr, v).getInt();
    }

    public static int WriteFloat(int hwnd, String addr, Float v) {
        return Dispatch.call(DM, "WriteFloat", hwnd, addr, v).getInt();
    }

    public static int WriteFloatAddr(int hwnd, long addr, Float v) {
        return Dispatch.call(DM, "WriteFloatAddr", hwnd, addr, v).getInt();
    }

    public static int WriteInt(int hwnd, String addr, int v) {
        return Dispatch.call(DM, "WriteInt", hwnd, addr, v).getInt();
    }

    public static int WriteIntAddr(int hwnd, long addr, int v) {
        return Dispatch.call(DM, "WriteIntAddr", hwnd, addr, v).getInt();
    }

    public static int WriteString(int hwnd, String addr, int type, String v) {
        return Dispatch.call(DM, "WriteString", hwnd, addr, type, v).getInt();
    }

    public static int WriteStringAddr(int hwnd, long addr, int type, String v) {
        return Dispatch.call(DM, "WriteStringAddr", hwnd, addr, type, v).getInt();
    }


    /**
     * @BY BlackWind
     * @QQ 2597906396
     * @Email 2597906396@qq.com
     * @date 2023/7/17 19:44
     * 图色
     */
    public static String AppendPicAddr(String pic_info, int addr, int size) {
        return Dispatch.call(DM, "AppendPicAddr", pic_info, addr, size).getString();
    }


    public static String BGR2RGB(String color) {
        return Dispatch.call(DM, "BGR2RGB", color).getString();
    }


    public static int Capture(int x1, int y1, int x2, int y2, String file) {
        return Dispatch.call(DM, "Capture", x1, y1, x2, y2, file).getInt();
    }

    public static int CaptureGif(int x1, int y1, int x2, int y2, String file, int delay, int time) {
        return Dispatch.call(DM, "CaptureGif", x1, y1, x2, y2, file, delay, time).getInt();
    }

    public static int CaptureJpg(int x1, int y1, int x2, int y2, String file, int quality) {
        return Dispatch.call(DM, "CaptureJpg", x1, y1, x2, y2, file, quality).getInt();
    }

    public static int CapturePng(int x1, int y1, int x2, int y2, String file) {
        return Dispatch.call(DM, "CapturePng", x1, y1, x2, y2, file).getInt();
    }

    public static int CapturePre(String file) {
        return Dispatch.call(DM, "CapturePre", file).getInt();
    }

    public static int CmpColor(int x, int y, String color, double sim) {
        return Dispatch.call(DM, "CmpColor", x, y, color, sim).getInt();
    }

    public static int EnableDisplayDebug(int enable_debug) {
        return Dispatch.call(DM, "EnableDisplayDebug", enable_debug).getInt();
    }

    public static int EnableFindPicMultithread(int enable_debug) {
        return Dispatch.call(DM, "EnableFindPicMultithread", enable_debug).getInt();
    }

    public static int EnableGetColorByCapture(int enable_debug) {
        return Dispatch.call(DM, "EnableGetColorByCapture", enable_debug).getInt();
    }

    public static Variant[] FindColor(int x1, int y1, int x2, int y2, String color, double sim, int dir) {
        Variant x = new Variant(-1, true);
        Variant y = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "FindColor", x1, y1, x2, y2, color, sim, dir, x, y);
        // System.out.println(x);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = x;
        jg[2] = y;
        return jg;
    }

    public static Variant[] FindColorBlock(int x1, int y1, int x2, int y2, String color, double sim, int count, int width, int height) {
        Variant intX = new Variant(-1, true);
        Variant intY = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "FindColorBlock", x1, y1, x2, y2, color, sim, count, intX, intY);
        // System.out.println(x);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = intX;
        jg[2] = intY;
        return jg;
    }

    public static String FindColorBlockEx(int x1, int y1, int x2, int y2, String color, double sim, int dir) {
        return Dispatch.call(DM, "FindColorBlockEx", x1, y1, x2, y2, color, sim, dir).getString();
    }

    public static String FindColorE(int x1, int y1, int x2, int y2, String color, double sim, int dir) {
        return Dispatch.call(DM, "FindColorE", x1, y1, x2, y2, color, sim, dir).getString();
    }

    public static String FindColorEx(int x1, int y1, int x2, int y2, String color, double sim, int dir) {
        return Dispatch.call(DM, "FindColorEx", x1, y1, x2, y2, color, sim, dir).getString();
    }

    public static int FindMulColor(int x1, int y1, int x2, int y2, String color, double sim) {
        return Dispatch.call(DM, "FindMulColor", x1, y1, x2, y2, color, sim).getInt();
    }

    public static Variant[] FindMultiColor(int x1, int y1, int x2, int y2, String first_color, String offset_color, double sim, int dir) {
        Variant intX = new Variant(-1, true);
        Variant intY = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "FindMultiColor", x1, y1, x2, y2, first_color, offset_color, sim, dir, intX, intY);
        // System.out.println(x);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = intX;
        jg[2] = intY;
        return jg;
    }


    public static String FindColorE(int x1, int y1, int x2, int y2, String first_color, String offset_color, double sim, int dir) {
        return Dispatch.call(DM, "FindColorE", x1, y1, x2, y2, first_color, offset_color, sim, dir).getString();
    }

    public static String FindColorEx(int x1, int y1, int x2, int y2, String first_color, String offset_color, double sim, int dir) {
        return Dispatch.call(DM, "FindColorEx", x1, y1, x2, y2, first_color, offset_color, sim, dir).getString();
    }


    public static Variant[] FindPic(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir) {
        Variant intX = new Variant(-1, true);
        Variant intY = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "FindPic", x1, y1, x2, y2, pic_name, delta_color, sim, dir, intX, intY);
        // System.out.println(x);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = intX;
        jg[2] = intY;
        return jg;
    }

    public static String FindPicE(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir) {
        return Dispatch.call(DM, "FindPicE", x1, y1, x2, y2, pic_name, delta_color, sim, dir).getString();
    }


    public static String FindPicEx(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir) {
        return Dispatch.call(DM, "FindPicEx", x1, y1, x2, y2, pic_name, delta_color, sim, dir).getString();
    }

    public static String FindPicExS(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir) {
        return Dispatch.call(DM, "FindPicExS", x1, y1, x2, y2, pic_name, delta_color, sim, dir).getString();
    }

    public static Variant[] FindPicMem(int x1, int y1, int x2, int y2, String pic_info, String delta_color, double sim, int dir) {
        Variant intX = new Variant(-1, true);
        Variant intY = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "FindPicMem", x1, y1, x2, y2, pic_info, delta_color, sim, dir, intX, intY);
        // System.out.println(x);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = intX;
        jg[2] = intY;
        return jg;
    }

    public static String FindPicMemE(int x1, int y1, int x2, int y2, String pic_info, String delta_color, double sim, int dir) {
        return Dispatch.call(DM, "FindPicMemE", x1, y1, x2, y2, pic_info, delta_color, sim, dir).getString();
    }


    public static String FindPicMemEx(int x1, int y1, int x2, int y2, String pic_info, String delta_color, double sim, int dir) {
        return Dispatch.call(DM, "FindPicMemEx", x1, y1, x2, y2, pic_info, delta_color, sim, dir).getString();
    }

    public static Variant[] FindPicS(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir) {
        Variant intX = new Variant(-1, true);
        Variant intY = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "FindPicS", x1, y1, x2, y2, pic_name, delta_color, sim, dir, intX, intY);
        // System.out.println(x);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = intX;
        jg[2] = intY;
        return jg;
    }


    public static Variant[] FindPicSim(int x1, int y1, int x2, int y2, String pic_name, String delta_color, int sim, int dir) {
        Variant intX = new Variant(-1, true);
        Variant intY = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "FindPicSim", x1, y1, x2, y2, pic_name, delta_color, sim, dir, intX, intY);
        // System.out.println(x);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = intX;
        jg[2] = intY;
        return jg;
    }

    public static String FindPicSimE(int x1, int y1, int x2, int y2, String pic_name, String delta_color, int sim, int dir) {
        return Dispatch.call(DM, "FindPicSimE", x1, y1, x2, y2, pic_name, delta_color, sim, dir).getString();
    }

    public static String FindPicSimEx(int x1, int y1, int x2, int y2, String pic_name, String delta_color, int sim, int dir) {
        return Dispatch.call(DM, "FindPicSimEx", x1, y1, x2, y2, pic_name, delta_color, sim, dir).getString();
    }

    public static Variant[] FindPicSimMem(int x1, int y1, int x2, int y2, String pic_info, String delta_color, int sim, int dir) {
        Variant intX = new Variant(-1, true);
        Variant intY = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "FindPicSimMem", x1, y1, x2, y2, pic_info, delta_color, sim, dir, intX, intY);
        // System.out.println(x);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = intX;
        jg[2] = intY;
        return jg;
    }

    public static String FindPicSimMemE(int x1, int y1, int x2, int y2, String pic_info, String delta_color, int sim, int dir) {
        return Dispatch.call(DM, "FindPicSimMemE", x1, y1, x2, y2, pic_info, delta_color, sim, dir).getString();
    }

    public static String FindPicSimMemEx(int x1, int y1, int x2, int y2, String pic_info, String delta_color, int sim, int dir) {
        return Dispatch.call(DM, "FindPicSimMemEx", x1, y1, x2, y2, pic_info, delta_color, sim, dir).getString();
    }


    public static Variant[] FindShape(int x1, int y1, int x2, int y2, String offset_color, double sim, int dir) {
        Variant intX = new Variant(-1, true);
        Variant intY = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "FindShape", x1, y1, x2, y2, offset_color, sim, dir, intX, intY);
        // System.out.println(x);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = intX;
        jg[2] = intY;
        return jg;
    }

    public static String FindShapeE(int x1, int y1, int x2, int y2, String offset_color, double sim, int dir) {
        return Dispatch.call(DM, "FindShapeE", x1, y1, x2, y2, offset_color, sim, dir).getString();
    }

    public static String FindShapeEx(int x1, int y1, int x2, int y2, String offset_color, double sim, int dir) {
        return Dispatch.call(DM, "FindShapeEx", x1, y1, x2, y2, offset_color, sim, dir).getString();
    }

    public static int FreePic(String pic_name) {
        return Dispatch.call(DM, "FreePic", pic_name).getInt();
    }


    public static String GetAveHSV(int x1, int y1, int x2, int y2) {
        return Dispatch.call(DM, "GetAveHSV", x1, y1, x2, y2).getString();
    }

    public static String GetAveRGB(int x1, int y1, int x2, int y2) {
        return Dispatch.call(DM, "GetAveRGB", x1, y1, x2, y2).getString();
    }

    public static String GetColor(int x1, int y1) {
        return Dispatch.call(DM, "GetColor", x1, y1).getString();
    }


    public static String GetColorBGR(int x1, int y1) {
        return Dispatch.call(DM, "GetColorBGR", x1, y1).getString();
    }

    public static String GetColorHSV(int x1, int y1) {
        return Dispatch.call(DM, "GetColorHSV", x1, y1).getString();
    }

    public static String GetColorNum(int x1, int y1, int X2, int Y2, String color, double sim) {
        return Dispatch.call(DM, "GetColorNum", x1, y1, X2, Y2, color, sim).getString();
    }

    public static String GetPicSize(String pic_name) {
        return Dispatch.call(DM, "GetPicSize", pic_name).getString();
    }

    public static int GetScreenData(int x1, int y1, int x2, int y2) {
        return Dispatch.call(DM, "GetScreenData", x1, y1, x2, y2).getInt();
    }

    public static Variant[] GetScreenDataBmp(int x1, int y1, int x2, int y2) {
        Variant data = new Variant(-1, true);
        Variant size = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "GetScreenDataBmp", x1, y1, x2, y2, data, size);
        // System.out.println(x);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = data;
        jg[2] = size;
        return jg;
    }

    public static int ImageToBmp(String pic_name, String bmp_name) {
        return Dispatch.call(DM, "ImageToBmp", pic_name, bmp_name).getInt();
    }

    public static int IsDisplayDead(int x1, int y1, int x2, int y2, int t) {
        return Dispatch.call(DM, "IsDisplayDead", x1, y1, x2, y2, t).getInt();
    }

    public static int LoadPic(String pic_name) {
        return Dispatch.call(DM, "LoadPic", pic_name).getInt();
    }

    public static int LoadPicByte(int addr, int size, String pic_name) {
        return Dispatch.call(DM, "LoadPicByte", addr, size, pic_name).getInt();
    }

    public static String MatchPicName(String pic_name) {
        return Dispatch.call(DM, "MatchPicName", pic_name).getString();
    }

    public static String RGB2BGR(String rgb_color) {
        return Dispatch.call(DM, "RGB2BGR", rgb_color).getString();
    }

    public static int SetExcludeRegion(int mode, String info) {
        return Dispatch.call(DM, "SetExcludeRegion", mode, info).getInt();
    }

    public static int SetFindPicMultithreadCount(int count) {
        return Dispatch.call(DM, "SetFindPicMultithreadCount", count).getInt();
    }

    public static int SetFindPicMultithreadLimit(int limit) {
        return Dispatch.call(DM, "SetFindPicMultithreadLimit", limit).getInt();
    }

    public static int SetPicPwd(String pwd) {
        return Dispatch.call(DM, "SetPicPwd", pwd).getInt();
    }

    /**
     * @BY BlackWind
     * @QQ 2597906396
     * @Email 2597906396@qq.com
     * @date 2023/7/18 13:04
     * 杂项
     */


    public static int ActiveInputMethod(String input_method) {
        return Dispatch.call(DM, "ActiveInputMethod", input_method).getInt();
    }

    public static int CheckInputMethod(int hwnd, String input_method) {
        return Dispatch.call(DM, "CheckInputMethod", hwnd, input_method).getInt();
    }


    public static int EnterCri() {
        return Dispatch.call(DM, "EnterCri").getInt();
    }


    public static String ExecuteCmd(String cmd, String current_dir, int time_out) {
        return Dispatch.call(DM, "ExecuteCmd", cmd, current_dir, time_out).getString();
    }

    public static String FindInputMethod(String input_method) {
        return Dispatch.call(DM, "FindInputMethod", input_method).getString();
    }

    public static int InitCri() {
        return Dispatch.call(DM, "InitCri").getInt();
    }

    public static int LeaveCri() {
        return Dispatch.call(DM, "LeaveCri").getInt();
    }

    public static int ReleaseRef() {
        return Dispatch.call(DM, "ReleaseRef").getInt();
    }

    public static int SetExitThread(int enable) {
        return Dispatch.call(DM, "SetExitThread", enable).getInt();
    }

    /**
     * @BY BlackWind
     * @QQ 2597906396
     * @Email 2597906396@qq.com
     * @date 2023/7/18 13:15
     * 文件
     */

    public static int CopyFile(String src_file, String dst_file, int over) {
        return Dispatch.call(DM, "CopyFile", src_file, dst_file, over).getInt();
    }


    public static int CreateFolder(String folder) {
        return Dispatch.call(DM, "CreateFolder", folder).getInt();
    }

    public static int DecodeFile(String file, String pwd) {
        return Dispatch.call(DM, "DecodeFile", file, pwd).getInt();
    }

    public static int DeleteFile(String file) {
        return Dispatch.call(DM, "DeleteFile", file).getInt();
    }

    public static int DeleteFolder(String folder) {
        return Dispatch.call(DM, "DeleteFolder", folder).getInt();
    }

    public static int DeleteIni(String section, String key, String file) {
        return Dispatch.call(DM, "DeleteIni", section, key, file).getInt();
    }

    public static int DeleteIniPwd(String section, String key, String file, String pwd) {
        return Dispatch.call(DM, "DeleteIniPwd", section, key, file, pwd).getInt();
    }


    public static int DownloadFile(String url, String save_file, int timeout) {
        return Dispatch.call(DM, "DownloadFile", url, save_file, timeout).getInt();
    }

    public static int EncodeFile(String file, String pwd) {
        return Dispatch.call(DM, "EncodeFile", file, pwd).getInt();
    }

    public static String EnumIniKey(String section, String file) {
        return Dispatch.call(DM, "EnumIniKey", section, file).getString();
    }

    public static String EnumIniKeyPwd(String section, String file, String pwd) {
        return Dispatch.call(DM, "EnumIniKeyPwd", section, file, pwd).getString();
    }


    public static String EnumIniSection(String file) {
        return Dispatch.call(DM, "EnumIniSection", file).getString();
    }

    public static String EnumIniSectionPwd(String file, String pwd) {
        return Dispatch.call(DM, "EnumIniSectionPwd", file, pwd).getString();
    }


    public static int GetFileLength(String file) {
        return Dispatch.call(DM, "GetFileLength", file).getInt();
    }


    public static String GetRealPath(String path) {
        return Dispatch.call(DM, "GetRealPath", path).getString();
    }

    public static int IsFileExist(String file) {
        return Dispatch.call(DM, "IsFileExist", file).getInt();
    }

    public static int IsFolderExist(String folder) {
        return Dispatch.call(DM, "IsFolderExist", folder).getInt();
    }

    public static int MoveFile(String src_file, String dst_file) {
        return Dispatch.call(DM, "MoveFile", src_file, dst_file).getInt();
    }

    public static String ReadFile(String file) {
        return Dispatch.call(DM, "ReadFile", file).getString();
    }

    public static String ReadIni(String section, String key, String file) {
        return Dispatch.call(DM, "ReadIni", section, key, file).getString();
    }

    public static String ReadIniPwd(String section, String key, String file, String pwd) {
        return Dispatch.call(DM, "ReadIniPwd", section, key, file, pwd).getString();
    }

    public static String SelectDirectory() {
        return Dispatch.call(DM, "SelectDirectory").getString();
    }

    public static String SelectFile() {
        return Dispatch.call(DM, "SelectFile").getString();
    }

    public static int WriteFile(String file, String content) {
        return Dispatch.call(DM, "WriteFile", file, content).getInt();
    }

    public static int WriteIni(String section, String key, String value, String file) {
        return Dispatch.call(DM, "WriteIni", section, key, value, file).getInt();
    }

    public static int WriteIniPwd(String section, String key, String value, String file, String pwd) {
        return Dispatch.call(DM, "WriteIniPwd", section, key, value, file, pwd).getInt();
    }

    /**
     * @BY BlackWind
     * @QQ 2597906396
     * @Email 2597906396@qq.com
     * @date 2023/7/18 13:29
     * 系统
     */

    public static int Beep(int f, int duration) {
        return Dispatch.call(DM, "Beep", f, duration).getInt();
    }

    public static int CheckFontSmooth() {
        return Dispatch.call(DM, "CheckFontSmooth").getInt();
    }

    public static int CheckUAC() {
        return Dispatch.call(DM, "CheckUAC").getInt();
    }

    public static int Delay(int mis) {
        return Dispatch.call(DM, "Delay", mis).getInt();
    }

    public static int Delays(int mis_min, int mis_max) {
        return Dispatch.call(DM, "Delays", mis_min, mis_max).getInt();
    }

    public static int DisableCloseDisplayAndSleep() {
        return Dispatch.call(DM, "DisableCloseDisplayAndSleep").getInt();
    }

    public static int DisableFontSmooth() {
        return Dispatch.call(DM, "DisableFontSmooth").getInt();
    }

    public static int DisablePowerSave() {
        return Dispatch.call(DM, "DisablePowerSave").getInt();
    }

    public static int DisableScreenSave() {
        return Dispatch.call(DM, "DisableScreenSave").getInt();
    }

    public static int EnableFontSmooth() {
        return Dispatch.call(DM, "EnableFontSmooth").getInt();
    }

    public static int ExitOs(int type) {
        return Dispatch.call(DM, "ExitOs").getInt();
    }

    public static String GetClipboard() {
        return Dispatch.call(DM, "GetClipboard").getString();
    }

    public static int GetCpuType() {
        return Dispatch.call(DM, "GetCpuType").getInt();
    }

    public static int GetCpuUsage() {
        return Dispatch.call(DM, "GetCpuUsage").getInt();
    }

    public static String GetDir(int type) {
        return Dispatch.call(DM, "GetDir", type).getString();
    }

    public static String GetDiskModel(String index) {
        return Dispatch.call(DM, "GetDiskModel", index).getString();
    }

    public static String GetDiskReversion(int index) {
        return Dispatch.call(DM, "GetDiskReversion", index).getString();
    }


    public static String GetDiskSerial(int index) {
        return Dispatch.call(DM, "GetDiskSerial", index).getString();
    }

    public static String GetNetTime() {
        return Dispatch.call(DM, "GetNetTime").getString();
    }

    public static String GetNetTimeByIp(String ip) {
        return Dispatch.call(DM, "GetNetTimeByIp", ip).getString();
    }

    public static String GetNetTimeSafe() {
        return Dispatch.call(DM, "GetNetTimeSafe").getString();
    }

    public static int GetOsBuildNumber() {
        return Dispatch.call(DM, "GetOsBuildNumber").getInt();
    }

    public static int GetOsType() {
        return Dispatch.call(DM, "GetOsType").getInt();
    }

    public static int GetScreenDepth() {
        return Dispatch.call(DM, "GetScreenDepth").getInt();
    }

    public static int GetScreenHeight() {
        return Dispatch.call(DM, "GetScreenHeight").getInt();
    }

    public static int GetScreenWidth() {
        return Dispatch.call(DM, "GetScreenWidth").getInt();
    }

    public static String GetSystemInfo(String type, int method) {
        return Dispatch.call(DM, "GetSystemInfo", type, method).getString();
    }

    public static int GetTime() {
        return Dispatch.call(DM, "GetTime").getInt();
    }

    public static int Is64Bit() {
        return Dispatch.call(DM, "Is64Bit").getInt();
    }

    public static int IsSurrpotVt() {
        return Dispatch.call(DM, "IsSurrpotVt").getInt();
    }

    public static int Play(String media_file) {
        return Dispatch.call(DM, "Play", media_file).getInt();
    }

    public static int RunApp(String app_path, int mode) {
        return Dispatch.call(DM, "RunApp", app_path, mode).getInt();
    }

    public static int SetClipboard(String value) {
        return Dispatch.call(DM, "SetClipboard", value).getInt();
    }

    public static int SetDisplayAcceler(int level) {
        return Dispatch.call(DM, "SetDisplayAcceler", level).getInt();
    }

    public static int SetLocale() {
        return Dispatch.call(DM, "SetLocale").getInt();
    }

    public static int SetScreen(int width, int height, int depth) {
        return Dispatch.call(DM, "SetScreen", width, height, depth).getInt();
    }


    public static int SetUAC(int enable) {
        return Dispatch.call(DM, "SetUAC", enable).getInt();
    }


    public static int ShowTaskBarIcon(int hwnd, int is_show) {
        return Dispatch.call(DM, "ShowTaskBarIcon", hwnd, is_show).getInt();
    }

    public static int Stop(int id) {
        return Dispatch.call(DM, "Stop", id).getInt();
    }


    /**
     * @BY BlackWind
     * @QQ 2597906396
     * @Email 2597906396@qq.com
     * @date 2023/7/18 13:49
     * 文字识别
     */

    public static int AddDict(int index, String dict_info) {
        return Dispatch.call(DM, "AddDict", index, dict_info).getInt();
    }


    public static int ClearDict(int index) {
        return Dispatch.call(DM, "ClearDict", index).getInt();
    }


    public static int EnableShareDict(int enable) {
        return Dispatch.call(DM, "EnableShareDict", enable).getInt();
    }

    public static String FetchWord(int x1, int y1, int x2, int y2, String color, String word) {
        return Dispatch.call(DM, "FetchWord", x1, y1, x2, y2, color, word).getString();
    }


    public static Variant[] FindStr(int x1, int y1, int x2, int y2, String string, String color_format, double sim) {
        Variant intX = new Variant(-1, true);
        Variant intY = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "FindStr", x1, y1, x2, y2, string, color_format, sim, intX, intY);
        // System.out.println(x);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = intX;
        jg[2] = intY;
        return jg;
    }

    public static String FindStrE(int x1, int y1, int x2, int y2, String string, String color_format, double sim) {
        return Dispatch.call(DM, "FindStrE", x1, y1, x2, y2, string, color_format, sim).getString();
    }

    public static String FindStrEx(int x1, int y1, int x2, int y2, String string, String color_format, double sim) {
        return Dispatch.call(DM, "FindStrEx", x1, y1, x2, y2, string, color_format, sim).getString();
    }

    public static String FindStrExS(int x1, int y1, int x2, int y2, String string, String color_format, double sim) {
        return Dispatch.call(DM, "FindStrExS", x1, y1, x2, y2, string, color_format, sim).getString();
    }

    public static Variant[] FindStrFast(int x1, int y1, int x2, int y2, String string, String color_format, double sim) {
        Variant intX = new Variant(-1, true);
        Variant intY = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "FindStrFast", x1, y1, x2, y2, string, color_format, sim, intX, intY);
        // System.out.println(x);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = intX;
        jg[2] = intY;
        return jg;
    }

    public static String FindStrFastE(int x1, int y1, int x2, int y2, String string, String color_format, double sim) {
        return Dispatch.call(DM, "FindStrFastE", x1, y1, x2, y2, string, color_format, sim).getString();
    }

    public static String FindStrFastEx(int x1, int y1, int x2, int y2, String string, String color_format, double sim) {
        return Dispatch.call(DM, "FindStrFastEx", x1, y1, x2, y2, string, color_format, sim).getString();
    }

    public static String FindStrFastExS(int x1, int y1, int x2, int y2, String string, String color_format, double sim) {
        return Dispatch.call(DM, "FindStrFastExS", x1, y1, x2, y2, string, color_format, sim).getString();
    }


    public static Variant[] FindStrFastS(int x1, int y1, int x2, int y2, String string, String color_format, double sim) {
        Variant intX = new Variant(-1, true);
        Variant intY = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "FindStrFastS", x1, y1, x2, y2, string, color_format, sim, intX, intY);
        // System.out.println(x);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = intX;
        jg[2] = intY;
        return jg;
    }

    public static Variant[] FindStrS(int x1, int y1, int x2, int y2, String string, String color_format, double sim) {
        Variant intX = new Variant(-1, true);
        Variant intY = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "FindStrS", x1, y1, x2, y2, string, color_format, sim, intX, intY);
        // System.out.println(x);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = intX;
        jg[2] = intY;
        return jg;
    }


    public static Variant[] FindStrWithFont(int x1, int y1, int x2, int y2, String string, String color_format, double sim, String font_name, int font_size, int flag) {
        Variant intX = new Variant(-1, true);
        Variant intY = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "FindStrWithFont", x1, y1, x2, y2, string, color_format, sim, font_name, font_size, flag, intX, intY);
        // System.out.println(x);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = intX;
        jg[2] = intY;
        return jg;
    }


    public static String FindStrWithFontE(int x1, int y1, int x2, int y2, String string, String color_format, double sim, String font_name, int font_size, int flag) {
        return Dispatch.call(DM, "FindStrWithFontE", x1, y1, x2, y2, string, color_format, sim, font_name, font_size, flag).getString();
    }

    public static String FindStrWithFontEx(int x1, int y1, int x2, int y2, String string, String color_format, double sim, String font_name, int font_size, int flag) {
        return Dispatch.call(DM, "FindStrWithFontEx", x1, y1, x2, y2, string, color_format, sim, font_name, font_size, flag).getString();
    }

    public static String GetDict(int index, int font_index) {
        return Dispatch.call(DM, "GetDict", index, font_index).getString();
    }


    public static int GetDictCount(int index) {
        return Dispatch.call(DM, "GetDictCount", index).getInt();
    }


    public static String GetDictInfo(String str, String font_name, int font_size, int flag) {
        return Dispatch.call(DM, "GetDictInfo", str, font_name, font_size, flag).getString();
    }


    public static int GetNowDict() {
        return Dispatch.call(DM, "GetNowDict").getInt();
    }

    public static int GetResultCount(String reg) {
        return Dispatch.call(DM, "GetResultCount", reg).getInt();
    }


    public static Variant[] GetResultPos(String ret, int index) {
        Variant intX = new Variant(-1, true);
        Variant intY = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "GetResultPos", ret, index, intX, intY);
        // System.out.println(x);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = intX;
        jg[2] = intY;
        return jg;
    }

    public static int GetWordResultCount(String str) {
        return Dispatch.call(DM, "GetWordResultCount", str).getInt();
    }

    public static Variant[] GetWordResultPos(String ret, int index) {
        Variant intX = new Variant(-1, true);
        Variant intY = new Variant(-1, true);
        Variant variant = Dispatch.call(DM, "GetWordResultPos", ret, index, intX, intY);
        // System.out.println(x);
        Variant[] jg = new Variant[100];
        jg[0] = variant;
        jg[1] = intX;
        jg[2] = intY;
        return jg;
    }


    public static String GetWordResultStr(String str, int index) {
        return Dispatch.call(DM, "GetWordResultStr", str, index).getString();
    }

    public static String GetWords(int x1, int y1, int x2, int y2, String color, double sim) {
        return Dispatch.call(DM, "GetWords", x1, y1, x2, y2, color, sim).getString();
    }

    public static String GetWordsNoDict(int x1, int y1, int x2, int y2, String color) {
        return Dispatch.call(DM, "GetWordsNoDict", x1, y1, x2, y2, color).getString();
    }

    public static String Ocr(int x1, int y1, int x2, int y2, String color_format, double sim) {
        return Dispatch.call(DM, "Ocr", x1, y1, x2, y2, color_format, sim).getString();
    }

    public static String OcrEx(int x1, int y1, int x2, int y2, String color_format, double sim) {
        return Dispatch.call(DM, "OcrEx", x1, y1, x2, y2, color_format, sim).getString();
    }

    public static String OcrExOne(int x1, int y1, int x2, int y2, String color_format, double sim) {
        return Dispatch.call(DM, "OcrExOne", x1, y1, x2, y2, color_format, sim).getString();
    }

    public static String OcrInFile(int x1, int y1, int x2, int y2, String pic_name, System color_format, double sim) {
        return Dispatch.call(DM, "OcrInFile", x1, y1, x2, y2, pic_name, color_format, sim).getString();
    }

    public static int SaveDict(int index, String file) {
        return Dispatch.call(DM, "SaveDict", index, file).getInt();
    }

    public static int SetColGapNoDict(int col_gap) {
        return Dispatch.call(DM, "SetColGapNoDict", col_gap).getInt();
    }

    public static int SetDict(int index, String file) {
        return Dispatch.call(DM, "SetDict", index, file).getInt();
    }

    public static int SetDictMem(int index, int addr, int size) {
        return Dispatch.call(DM, "SetDictMem", index, addr, size).getInt();
    }

    public static int SetDictPwd(String pwd) {
        return Dispatch.call(DM, "SetDictPwd", pwd).getInt();
    }

    public static int SetExactOcr(int exact_ocr) {
        return Dispatch.call(DM, "SetExactOcr", exact_ocr).getInt();
    }

    public static int SetMinColGap(int min_col_gap) {
        return Dispatch.call(DM, "SetMinColGap", min_col_gap).getInt();
    }

    public static int SetMinRowGap(int min_col_gap) {
        return Dispatch.call(DM, "SetMinRowGap", min_col_gap).getInt();
    }

    public static int SetRowGapNoDict(int row_gap) {
        return Dispatch.call(DM, "SetRowGapNoDict", row_gap).getInt();
    }

    public static int SetWordGap(int word_gap) {
        return Dispatch.call(DM, "SetWordGap", word_gap).getInt();
    }

    public static int SetWordGapNoDict(int word_gap) {
        return Dispatch.call(DM, "SetWordGapNoDict", word_gap).getInt();
    }

    public static int SetWordLineHeight(int line_height) {
        return Dispatch.call(DM, "SetWordLineHeight", line_height).getInt();
    }

    public static int SetWordLineHeightNoDict(int line_height) {
        return Dispatch.call(DM, "SetWordLineHeightNoDict", line_height).getInt();
    }


    public static int UseDict(int index) {
        return Dispatch.call(DM, "UseDict", index).getInt();
    }


}
