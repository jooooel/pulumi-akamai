// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetBotmanCustomClientSequence
    {
        public static Task<GetBotmanCustomClientSequenceResult> InvokeAsync(GetBotmanCustomClientSequenceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBotmanCustomClientSequenceResult>("akamai:index/getBotmanCustomClientSequence:getBotmanCustomClientSequence", args ?? new GetBotmanCustomClientSequenceArgs(), options.WithDefaults());

        public static Output<GetBotmanCustomClientSequenceResult> Invoke(GetBotmanCustomClientSequenceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBotmanCustomClientSequenceResult>("akamai:index/getBotmanCustomClientSequence:getBotmanCustomClientSequence", args ?? new GetBotmanCustomClientSequenceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBotmanCustomClientSequenceArgs : global::Pulumi.InvokeArgs
    {
        [Input("configId", required: true)]
        public int ConfigId { get; set; }

        public GetBotmanCustomClientSequenceArgs()
        {
        }
        public static new GetBotmanCustomClientSequenceArgs Empty => new GetBotmanCustomClientSequenceArgs();
    }

    public sealed class GetBotmanCustomClientSequenceInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("configId", required: true)]
        public Input<int> ConfigId { get; set; } = null!;

        public GetBotmanCustomClientSequenceInvokeArgs()
        {
        }
        public static new GetBotmanCustomClientSequenceInvokeArgs Empty => new GetBotmanCustomClientSequenceInvokeArgs();
    }


    [OutputType]
    public sealed class GetBotmanCustomClientSequenceResult
    {
        public readonly int ConfigId;
        public readonly ImmutableArray<string> CustomClientIds;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetBotmanCustomClientSequenceResult(
            int configId,

            ImmutableArray<string> customClientIds,

            string id)
        {
            ConfigId = configId;
            CustomClientIds = customClientIds;
            Id = id;
        }
    }
}