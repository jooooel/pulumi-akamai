// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/** @deprecated akamai.edgedns/getauthoritiesset.getAuthoritiesSet has been deprecated in favor of akamai.index/getauthoritiesset.getAuthoritiesSet */
export function getAuthoritiesSet(args: GetAuthoritiesSetArgs, opts?: pulumi.InvokeOptions): Promise<GetAuthoritiesSetResult> {
    pulumi.log.warn("getAuthoritiesSet is deprecated: akamai.edgedns/getauthoritiesset.getAuthoritiesSet has been deprecated in favor of akamai.index/getauthoritiesset.getAuthoritiesSet")

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("akamai:edgedns/getAuthoritiesSet:getAuthoritiesSet", {
        "contract": args.contract,
    }, opts);
}

/**
 * A collection of arguments for invoking getAuthoritiesSet.
 */
export interface GetAuthoritiesSetArgs {
    contract: string;
}

/**
 * A collection of values returned by getAuthoritiesSet.
 */
export interface GetAuthoritiesSetResult {
    readonly authorities: string[];
    readonly contract: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
/** @deprecated akamai.edgedns/getauthoritiesset.getAuthoritiesSet has been deprecated in favor of akamai.index/getauthoritiesset.getAuthoritiesSet */
export function getAuthoritiesSetOutput(args: GetAuthoritiesSetOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAuthoritiesSetResult> {
    return pulumi.output(args).apply((a: any) => getAuthoritiesSet(a, opts))
}

/**
 * A collection of arguments for invoking getAuthoritiesSet.
 */
export interface GetAuthoritiesSetOutputArgs {
    contract: pulumi.Input<string>;
}
