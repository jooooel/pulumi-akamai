// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * **Scopes**: Security configuration
 *
 * Returns information about your prefetch request settings. By default, the Web Application Firewall only inspects external requests: requests originating outside of your firewall or Akamai's edge servers. When prefetch is enabled, however, internal requests – that is, requests between your origin servers and Akamai's edge servers – can also be inspected by the firewall. The returned information is described in the [PrefetchRequest members](https://developer.akamai.com/api/cloud_security/application_security/v1.html#deb7220d) section of the Application Security API.
 *
 * **Related** **API Endpoint**: [/appsec/v1/configs/{configId}/versions/{versionNumber}/advanced-settings/prefetch](https://developer.akamai.com/api/cloud_security/application_security/v1.html#getprefetchrequestsforaconfiguration)
 *
 * Example Usage
 * Basic usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as akamai from "@pulumi/akamai";
 *
 * const configuration = akamai.getAppSecConfiguration({
 *     name: "Documentation",
 * });
 * const prefetch = configuration.then(configuration => akamai.getAppSecAdvancedSettingsPrefetch({
 *     configId: configuration.configId,
 * }));
 * export const advancedSettingsPrefetchOutput = prefetch.then(prefetch => prefetch.outputText);
 * export const advancedSettingsPrefetchJson = prefetch.then(prefetch => prefetch.json);
 * ```
 *
 * ## Output Options
 *
 * The following options can be used to determine the information returned, and how that returned information is formatted:
 *
 * - `json`. JSON-formatted list of information about the prefetch request settings.
 * - `outputText`. Tabular report showing the prefetch request settings.
 */
export function getAppSecAdvancedSettingsPrefetch(args: GetAppSecAdvancedSettingsPrefetchArgs, opts?: pulumi.InvokeOptions): Promise<GetAppSecAdvancedSettingsPrefetchResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("akamai:index/getAppSecAdvancedSettingsPrefetch:getAppSecAdvancedSettingsPrefetch", {
        "configId": args.configId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppSecAdvancedSettingsPrefetch.
 */
export interface GetAppSecAdvancedSettingsPrefetchArgs {
    /**
     * . Unique identifier of the security configuration associated with the prefetch settings.
     */
    configId: number;
}

/**
 * A collection of values returned by getAppSecAdvancedSettingsPrefetch.
 */
export interface GetAppSecAdvancedSettingsPrefetchResult {
    readonly configId: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly json: string;
    readonly outputText: string;
}

export function getAppSecAdvancedSettingsPrefetchOutput(args: GetAppSecAdvancedSettingsPrefetchOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAppSecAdvancedSettingsPrefetchResult> {
    return pulumi.output(args).apply(a => getAppSecAdvancedSettingsPrefetch(a, opts))
}

/**
 * A collection of arguments for invoking getAppSecAdvancedSettingsPrefetch.
 */
export interface GetAppSecAdvancedSettingsPrefetchOutputArgs {
    /**
     * . Unique identifier of the security configuration associated with the prefetch settings.
     */
    configId: pulumi.Input<number>;
}