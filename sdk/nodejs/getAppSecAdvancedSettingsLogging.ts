// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * **Scopes**: Security configuration; security policy
 *
 * Returns information about your HTTP header logging controls. By default, information is returned for all the security policies in the configuration; however, you can return data for a single policy by using the `securityPolicyId` parameter. The returned information is described in the [ConfigHeaderLog members](https://developer.akamai.com/api/cloud_security/application_security/v1.html#a6d1c316) section of the Application Security API.
 *
 * **Related API Endpoint**: [/appsec/v1/configs/{configId}/versions/{versionNumber}/advanced-settings/logging](https://developer.akamai.com/api/cloud_security/application_security/v1.html#gethttpheaderloggingforaconfiguration)
 *
 * ## Example Usage
 *
 * Basic usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as akamai from "@pulumi/akamai";
 *
 * const configuration = akamai.getAppSecConfiguration({
 *     name: "Documentation",
 * });
 * const customRules = configuration.then(configuration => akamai.getAppSecCustomRules({
 *     configId: configuration.configId,
 * }));
 * export const customRulesOutputText = customRules.then(customRules => customRules.outputText);
 * export const customRulesJson = customRules.then(customRules => customRules.json);
 * export const customRulesConfigId = customRules.then(customRules => customRules.configId);
 * const specificCustomRule = configuration.then(configuration => akamai.getAppSecCustomRules({
 *     configId: configuration.configId,
 *     customRuleId: "60029316",
 * }));
 * export const specificCustomRuleJson = specificCustomRule.then(specificCustomRule => specificCustomRule.json);
 * ```
 * ## Output Options
 *
 * The following options can be used to determine the information returned, and how that returned information is formatted:
 *
 * - `json`. JSON-formatted list of information about the logging settings.
 * - `outputText`. Tabular report showing the logging settings.
 */
export function getAppSecAdvancedSettingsLogging(args: GetAppSecAdvancedSettingsLoggingArgs, opts?: pulumi.InvokeOptions): Promise<GetAppSecAdvancedSettingsLoggingResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("akamai:index/getAppSecAdvancedSettingsLogging:getAppSecAdvancedSettingsLogging", {
        "configId": args.configId,
        "securityPolicyId": args.securityPolicyId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppSecAdvancedSettingsLogging.
 */
export interface GetAppSecAdvancedSettingsLoggingArgs {
    /**
     * . Unique identifier of the security configuration associated with the logging settings.
     */
    configId: number;
    /**
     * . Unique identifier of the security policy associated with the logging settings. If not included, information is returned for all your security policies.
     */
    securityPolicyId?: string;
}

/**
 * A collection of values returned by getAppSecAdvancedSettingsLogging.
 */
export interface GetAppSecAdvancedSettingsLoggingResult {
    readonly configId: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly json: string;
    readonly outputText: string;
    readonly securityPolicyId?: string;
}

export function getAppSecAdvancedSettingsLoggingOutput(args: GetAppSecAdvancedSettingsLoggingOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAppSecAdvancedSettingsLoggingResult> {
    return pulumi.output(args).apply(a => getAppSecAdvancedSettingsLogging(a, opts))
}

/**
 * A collection of arguments for invoking getAppSecAdvancedSettingsLogging.
 */
export interface GetAppSecAdvancedSettingsLoggingOutputArgs {
    /**
     * . Unique identifier of the security configuration associated with the logging settings.
     */
    configId: pulumi.Input<number>;
    /**
     * . Unique identifier of the security policy associated with the logging settings. If not included, information is returned for all your security policies.
     */
    securityPolicyId?: pulumi.Input<string>;
}