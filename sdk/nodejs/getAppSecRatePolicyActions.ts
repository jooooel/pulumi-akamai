// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * **Scopes**: Security policy; rate policy
 *
 * Returns information about your rate policy actions, Actions specify what happens any time a rate policy is triggered: the issue could be ignored, the request could be denied, or an alert could be generated.
 *
 * **Related API Endpoint:** [/appsec/v1/configs/{configId}/versions/{versionNumber}/security-policies/{policyId}/rate-policies](https://developer.akamai.com/api/cloud_security/application_security/v1.html#getratepolicyactions)
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
 * const ratePolicyActionsAppSecRatePolicyActions = configuration.then(configuration => akamai.getAppSecRatePolicyActions({
 *     configId: configuration.configId,
 *     securityPolicyId: "gms1_134637",
 * }));
 * export const ratePolicyActions = ratePolicyActionsAppSecRatePolicyActions.then(ratePolicyActionsAppSecRatePolicyActions => ratePolicyActionsAppSecRatePolicyActions.outputText);
 * ```
 * ## Output Options
 *
 * The following options can be used to determine the information returned, and how that returned information is formatted:
 *
 * - `outputText`. Tabular report showing the ID, IPv4 action, and IPv6 action of the rate policies.
 */
export function getAppSecRatePolicyActions(args: GetAppSecRatePolicyActionsArgs, opts?: pulumi.InvokeOptions): Promise<GetAppSecRatePolicyActionsResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("akamai:index/getAppSecRatePolicyActions:getAppSecRatePolicyActions", {
        "configId": args.configId,
        "ratePolicyId": args.ratePolicyId,
        "securityPolicyId": args.securityPolicyId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppSecRatePolicyActions.
 */
export interface GetAppSecRatePolicyActionsArgs {
    /**
     * . Unique identifier of the security configuration associated with the rate policies and rate policy actions.
     */
    configId: number;
    /**
     * . Unique identifier of the rate policy you want to return action information for. If not included, action information is returned for all your rate policies.
     */
    ratePolicyId?: number;
    /**
     * . Unique identifier of the security policy associated with the rate policies and rate policy actions.
     */
    securityPolicyId: string;
}

/**
 * A collection of values returned by getAppSecRatePolicyActions.
 */
export interface GetAppSecRatePolicyActionsResult {
    readonly configId: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly outputText: string;
    readonly ratePolicyId?: number;
    readonly securityPolicyId: string;
}

export function getAppSecRatePolicyActionsOutput(args: GetAppSecRatePolicyActionsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAppSecRatePolicyActionsResult> {
    return pulumi.output(args).apply(a => getAppSecRatePolicyActions(a, opts))
}

/**
 * A collection of arguments for invoking getAppSecRatePolicyActions.
 */
export interface GetAppSecRatePolicyActionsOutputArgs {
    /**
     * . Unique identifier of the security configuration associated with the rate policies and rate policy actions.
     */
    configId: pulumi.Input<number>;
    /**
     * . Unique identifier of the rate policy you want to return action information for. If not included, action information is returned for all your rate policies.
     */
    ratePolicyId?: pulumi.Input<number>;
    /**
     * . Unique identifier of the security policy associated with the rate policies and rate policy actions.
     */
    securityPolicyId: pulumi.Input<string>;
}