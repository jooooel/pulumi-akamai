// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetEdgekvGroups
    {
        public static Task<GetEdgekvGroupsResult> InvokeAsync(GetEdgekvGroupsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEdgekvGroupsResult>("akamai:index/getEdgekvGroups:getEdgekvGroups", args ?? new GetEdgekvGroupsArgs(), options.WithDefaults());

        public static Output<GetEdgekvGroupsResult> Invoke(GetEdgekvGroupsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEdgekvGroupsResult>("akamai:index/getEdgekvGroups:getEdgekvGroups", args ?? new GetEdgekvGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEdgekvGroupsArgs : global::Pulumi.InvokeArgs
    {
        [Input("namespaceName", required: true)]
        public string NamespaceName { get; set; } = null!;

        [Input("network", required: true)]
        public string Network { get; set; } = null!;

        public GetEdgekvGroupsArgs()
        {
        }
        public static new GetEdgekvGroupsArgs Empty => new GetEdgekvGroupsArgs();
    }

    public sealed class GetEdgekvGroupsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("namespaceName", required: true)]
        public Input<string> NamespaceName { get; set; } = null!;

        [Input("network", required: true)]
        public Input<string> Network { get; set; } = null!;

        public GetEdgekvGroupsInvokeArgs()
        {
        }
        public static new GetEdgekvGroupsInvokeArgs Empty => new GetEdgekvGroupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetEdgekvGroupsResult
    {
        public readonly ImmutableArray<string> Groups;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string NamespaceName;
        public readonly string Network;

        [OutputConstructor]
        private GetEdgekvGroupsResult(
            ImmutableArray<string> groups,

            string id,

            string namespaceName,

            string network)
        {
            Groups = groups;
            Id = id;
            NamespaceName = namespaceName;
            Network = network;
        }
    }
}