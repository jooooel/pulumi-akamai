// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetPropertyInclude
    {
        /// <summary>
        /// Use the `akamai.PropertyInclude` data source to get details about a specific include.
        /// 
        /// ## Basic usage
        /// 
        /// This example returns details for an include based on contract, group, and include IDs.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Akamai = Pulumi.Akamai;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myExamplePropertyInclude = Akamai.GetPropertyInclude.Invoke(new()
        ///     {
        ///         ContractId = "ctr_1234",
        ///         GroupId = "grp_5678",
        ///         IncludeId = "inc_9012",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["myExample"] = myExamplePropertyInclude,
        ///     };
        /// });
        /// ```
        /// 
        /// ## Attributes reference
        /// 
        /// This data source returns these attributes:
        /// 
        /// * `name` - The descriptive name for the include.
        /// * `type` - Specifies the type of the include, either `MICROSERVICES` or `COMMON_SETTINGS`. Use this field for filtering. `MICROSERVICES` allow different teams to work independently on different parts of a single site. `COMMON_SETTINGS` includes are useful for configurations that share a large number of settings, often managed by a central team.
        /// * `latest_version` - Returns the most recent version of the include.
        /// * `staging_version` - The include version currently activated on the staging network.
        /// * `production_version` - The include version currently activated on the production network.
        /// </summary>
        public static Task<GetPropertyIncludeResult> InvokeAsync(GetPropertyIncludeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPropertyIncludeResult>("akamai:index/getPropertyInclude:getPropertyInclude", args ?? new GetPropertyIncludeArgs(), options.WithDefaults());

        /// <summary>
        /// Use the `akamai.PropertyInclude` data source to get details about a specific include.
        /// 
        /// ## Basic usage
        /// 
        /// This example returns details for an include based on contract, group, and include IDs.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Akamai = Pulumi.Akamai;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myExamplePropertyInclude = Akamai.GetPropertyInclude.Invoke(new()
        ///     {
        ///         ContractId = "ctr_1234",
        ///         GroupId = "grp_5678",
        ///         IncludeId = "inc_9012",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["myExample"] = myExamplePropertyInclude,
        ///     };
        /// });
        /// ```
        /// 
        /// ## Attributes reference
        /// 
        /// This data source returns these attributes:
        /// 
        /// * `name` - The descriptive name for the include.
        /// * `type` - Specifies the type of the include, either `MICROSERVICES` or `COMMON_SETTINGS`. Use this field for filtering. `MICROSERVICES` allow different teams to work independently on different parts of a single site. `COMMON_SETTINGS` includes are useful for configurations that share a large number of settings, often managed by a central team.
        /// * `latest_version` - Returns the most recent version of the include.
        /// * `staging_version` - The include version currently activated on the staging network.
        /// * `production_version` - The include version currently activated on the production network.
        /// </summary>
        public static Output<GetPropertyIncludeResult> Invoke(GetPropertyIncludeInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPropertyIncludeResult>("akamai:index/getPropertyInclude:getPropertyInclude", args ?? new GetPropertyIncludeInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPropertyIncludeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// (Required) A contract's unique ID, including the optional `ctr_` prefix.
        /// </summary>
        [Input("contractId", required: true)]
        public string ContractId { get; set; } = null!;

        /// <summary>
        /// (Required) A group's unique ID, including the optional `grp_` prefix.
        /// </summary>
        [Input("groupId", required: true)]
        public string GroupId { get; set; } = null!;

        /// <summary>
        /// (Required) An include's unique ID with the optional `inc_` prefix.
        /// </summary>
        [Input("includeId", required: true)]
        public string IncludeId { get; set; } = null!;

        public GetPropertyIncludeArgs()
        {
        }
        public static new GetPropertyIncludeArgs Empty => new GetPropertyIncludeArgs();
    }

    public sealed class GetPropertyIncludeInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// (Required) A contract's unique ID, including the optional `ctr_` prefix.
        /// </summary>
        [Input("contractId", required: true)]
        public Input<string> ContractId { get; set; } = null!;

        /// <summary>
        /// (Required) A group's unique ID, including the optional `grp_` prefix.
        /// </summary>
        [Input("groupId", required: true)]
        public Input<string> GroupId { get; set; } = null!;

        /// <summary>
        /// (Required) An include's unique ID with the optional `inc_` prefix.
        /// </summary>
        [Input("includeId", required: true)]
        public Input<string> IncludeId { get; set; } = null!;

        public GetPropertyIncludeInvokeArgs()
        {
        }
        public static new GetPropertyIncludeInvokeArgs Empty => new GetPropertyIncludeInvokeArgs();
    }


    [OutputType]
    public sealed class GetPropertyIncludeResult
    {
        public readonly string ContractId;
        public readonly string GroupId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string IncludeId;
        public readonly int LatestVersion;
        public readonly string Name;
        public readonly int ProductionVersion;
        public readonly int StagingVersion;
        public readonly string Type;

        [OutputConstructor]
        private GetPropertyIncludeResult(
            string contractId,

            string groupId,

            string id,

            string includeId,

            int latestVersion,

            string name,

            int productionVersion,

            int stagingVersion,

            string type)
        {
            ContractId = contractId;
            GroupId = groupId;
            Id = id;
            IncludeId = includeId;
            LatestVersion = latestVersion;
            Name = name;
            ProductionVersion = productionVersion;
            StagingVersion = stagingVersion;
            Type = type;
        }
    }
}